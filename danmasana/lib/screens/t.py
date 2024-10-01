from flask import Flask, request, jsonify, send_from_directory
from flask_sqlalchemy import SQLAlchemy
from flask_bcrypt import Bcrypt
from flask_jwt_extended import JWTManager, create_access_token, jwt_required, get_jwt_identity, get_jwt, verify_jwt_in_request
from sqlalchemy.exc import IntegrityError
from datetime import timedelta
import os
import werkzeug
from dotenv import load_dotenv
from functools import wraps

# Load environment variables from .env file
load_dotenv()

app = Flask(__name__)

app.config['SQLALCHEMY_DATABASE_URI'] = os.getenv('DATABASE_URL')
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False
app.config['JWT_SECRET_KEY'] = os.getenv('JWT_SECRET_KEY')
app.config['ENV'] = os.getenv('FLASK_ENV')
app.config['UPLOAD_FOLDER'] = 'uploads/profile_pictures'

# Ensure upload directory exists
os.makedirs(app.config['UPLOAD_FOLDER'], exist_ok=True)

# Set the JWT token expiration time to 7 days
app.config['JWT_ACCESS_TOKEN_EXPIRES'] = timedelta(days=7)

# Initialize extensions
db = SQLAlchemy(app)
bcrypt = Bcrypt(app)
jwt = JWTManager(app)

# Token blacklist (consider persistent storage)
blacklist = set()

def check_if_token_in_blacklist(decrypted_token):
    return decrypted_token['jti'] in blacklist

def token_not_blacklisted(fn):
    @wraps(fn)  # This ensures the original function metadata is preserved
    def wrapper(*args, **kwargs):
        # Ensure JWT is verified before accessing it
        verify_jwt_in_request()
        jwt_data = get_jwt()
        if check_if_token_in_blacklist(jwt_data):
            return jsonify({"message": "Token has been revoked"}), 401
        return fn(*args, **kwargs)
    return wrapper

# User model
class User(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    fullname = db.Column(db.String(100), nullable=False)
    username = db.Column(db.String(50), unique=True, nullable=False) 

    email = db.Column(db.String(100), unique=True, nullable=False)
    phone = db.Column(db.String(20), unique=True, 
 nullable=False)
    transactionPin = db.Column(db.String(128), nullable=False)
    password_hash = db.Column(db.String(128), nullable=False)
    wallet_balance = db.Column(db.Float, nullable=True, default=0.0)  # Default balance is 0.0
    referral_code = db.Column(db.String(10), nullable=True)
    profile_picture = db.Column(db.String(128), nullable=True)  # Field for profile picture
    
    # Network model
class Network(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(100), unique=True, nullable=False)
    data_types = db.relationship('DataType', backref='network', lazy=True)

# DataType model
class DataType(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(100), nullable=False)
    network_id = db.Column(db.Integer, db.ForeignKey('network.id'), nullable=False)
    data_plans = db.relationship('DataPlan', backref='data_type', lazy=True)

# DataPlan model
class DataPlan(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(100), nullable=False)
    price = db.Column(db.Float, nullable=False)
    data_type_id = db.Column(db.Integer, db.ForeignKey('data_type.id'), nullable=False)


# Initialize the database
with app.app_context():
    db.create_all()

# Register route
@app.route('/api/auth/register', methods=['POST'])
def register():
    data = request.json
    fullname = data.get('fullname')
    username = data.get('username')
    email = data.get('email')
    phone = data.get('phone')
    transactionPin = data.get('transactionPin')
    password = data.get('password')

    if User.query.filter_by(username=username).first():
        return jsonify({"message": "Username already exists"}), 400
    if User.query.filter_by(email=email).first():
        return jsonify({"message": "Email already exists"}), 400
    if User.query.filter_by(phone=phone).first():
        return jsonify({"message": "Phone number already exists"}), 400 
    if not transactionPin:
        return jsonify({"error": "Transaction pin must be provided and cannot be empty"}), 400

    password_hash = bcrypt.generate_password_hash(password).decode('utf-8')
    transaction_pin_hash = bcrypt.generate_password_hash(transactionPin).decode('utf-8')

    new_user = User(
        fullname=fullname,
        username=username,
        email=email,
        phone=phone,
        transactionPin=transaction_pin_hash,
        password_hash=password_hash
    )

    try:
        db.session.add(new_user)
        db.session.commit()
    except IntegrityError as e:
        db.session.rollback()
        return jsonify({"message": "Duplicate entry error", "error": str(e.orig)}), 400
    except Exception as e:
        app.logger.error(f"Error registering user: {e}")
        return jsonify({"message": "Internal server error", "error": str(e)}), 500

    return jsonify({"message": "User registered successfully"}), 201

# Login route
@app.route('/api/auth/login', methods=['POST'])
def login():
    data = request.json
    identifier = data.get('identifier')
    password = data.get('password')

    user = User.query.filter(
        (User.username == identifier) | 
        (User.email == identifier) | 
        (User.phone == identifier)
    ).first()

    if user and bcrypt.check_password_hash(user.password_hash, password):
        access_token = create_access_token(identity={'username': user.username})
        return jsonify({"token": access_token}), 200

    return jsonify({"message": "Invalid identifier or password"}), 401

# Logout route
@app.route('/api/auth/logout', methods=['POST'])
@token_not_blacklisted
def logout():
    jti = get_jwt()['jti']
    blacklist.add(jti)
    return jsonify({"message": "Logout successful"}), 200

# Token validation route
@app.route('/api/auth/validate-token', methods=['GET'])
@jwt_required()
def validate_token():
    jwt_data = get_jwt()
    # Your logic here
    current_user = get_jwt_identity()
    return jsonify({"message": "Token is valid", "user": current_user}), 200

# Route to get user details
@app.route('/api/user/details', methods=['GET'])
@jwt_required()  # Ensure that the user is authenticated
def get_user_details():
    current_user_identity = get_jwt_identity()
    
    user = User.query.filter_by(username=current_user_identity).first()

    if user:
        return jsonify({
            "fullname": user.fullname,
            "username": user.username,
            "email": user.email,
            "phone": user.phone,
            "profile_picture": user.profile_picture
        }), 200
    else:
        return jsonify({"message": "User not found"}), 404

# Route to change password
@app.route('/api/user/change-password', methods=['POST'])
@token_not_blacklisted
def change_password():
    data = request.json
    old_password = data.get('old_password')
    new_password = data.get('new_password')
    confirm_new_password = data.get('confirm_new_password')

    current_user_identity = get_jwt_identity()
    user = User.query.filter_by(username=current_user_identity['username']).first()

    if user and bcrypt.check_password_hash(user.password_hash, old_password):
        if new_password == confirm_new_password:
            user.password_hash = bcrypt.generate_password_hash(new_password).decode('utf-8')
            db.session.commit()
            return jsonify({"message": "Password changed successfully"}), 200
        else:
            return jsonify({"message": "New passwords do not match"}), 400
    else:
        return jsonify({"message": "Incorrect old password"}), 400

# Route to change transaction PIN
@app.route('/api/user/change-pin', methods=['POST'])
@token_not_blacklisted
def change_pin():
    data = request.json
    old_pin = data.get('old_pin')
    new_pin = data.get('new_pin')
    confirm_new_pin = data.get('confirm_new_pin')

    current_user_identity = get_jwt_identity()
    user = User.query.filter_by(username=current_user_identity['username']).first()

    if user and bcrypt.check_password_hash(user.transactionPin, old_pin):
        if new_pin == confirm_new_pin:
            user.transactionPin = bcrypt.generate_password_hash(new_pin).decode('utf-8')
            db.session.commit()
            return jsonify({"message": "Transaction PIN changed successfully"}), 200
        else:
            return jsonify({"message": "New PINs do not match"}), 400
    else:
        return jsonify({"message": "Incorrect old PIN"}), 400
        
        
@app.route('/api/data/import/networks', methods=['POST'])
def import_networks():
    data = request.json
    imported_networks = []
    
    for network_data in data:
        existing_network = Network.query.filter_by(name=network_data['name']).first()
        if not existing_network:
            network = Network(name=network_data['name'])
            db.session.add(network)
            db.session.flush()  # Flush to get the ID before committing
            imported_networks.append({"id": network.id, "name": network.name})
        else:
            imported_networks.append({"id": existing_network.id, "name": existing_network.name})
    
    db.session.commit()
    
    return jsonify({
        "message": "Networks imported successfully",
        "networks": imported_networks
    }), 200


@app.route('/api/data/import/data-types', methods=['POST'])
def import_data_types():
    data = request.json
    for data_type_data in data:
        if not DataType.query.filter_by(name=data_type_data['name'], network_id=data_type_data['network_id']).first():
            data_type = DataType(name=data_type_data['name'], network_id=data_type_data['network_id'])
            db.session.add(data_type)
    db.session.commit()
    return jsonify({"message": "Data types imported successfully"}), 200

@app.route('/api/data/import/data-plans', methods=['POST'])
def import_data_plans():
    data = request.json
    for data_plan_data in data:
        if not DataPlan.query.filter_by(name=data_plan_data['name'], data_type_id=data_plan_data['data_type_id']).first():
            data_plan = DataPlan(
                name=data_plan_data['name'],
                price=data_plan_data['price'],
                data_type_id=data_plan_data['data_type_id']
            )
            db.session.add(data_plan)
    db.session.commit()
    return jsonify({"message": "Data plans imported successfully"}), 200


# Credit endpoint
@app.route('/api/transaction/credit', methods=['POST'])
@token_not_blacklisted
def credit():
    data = request.json
    amount = data.get('amount')
    description = data.get('description')

    current_user_identity = get_jwt_identity()
    success, message = credit_account(current_user_identity['username'], amount, description)

    if success:
        return jsonify({"message": message}), 200
    else:
        return jsonify({"message": message}), 400



# Debit endpoint
@app.route('/api/transaction/debit', methods=['POST'])
@token_not_blacklisted
@jwt_required()
def debit():
    data = request.json
    amount = data.get('amount')
    description = data.get('description')

    current_user_identity = get_jwt_identity()
    success, message = debit_account(current_user_identity['username'], amount, description)

    if success:
        return jsonify({"message": message}), 200
    else:
        return jsonify({"message": message}), 400

# Handle profile picture upload
@app.route('/api/user/upload-profile-picture', methods=['POST'])
@token_not_blacklisted
@jwt_required()
def upload_profile_picture():
    if 'file' not in request.files:
        return jsonify({"message": "No file part"}), 400
    
    file = request.files['file']
    
    if file.filename == '':
        return jsonify({"message": "No selected file"}), 400
    
    if file and allowed_file(file.filename):
        filename = werkzeug.utils.secure_filename(file.filename)
        file_path = os.path.join(app.config['UPLOAD_FOLDER'], filename)
        file.save(file_path)
        
        current_user_identity = get_jwt_identity()
        user = User.query.filter_by(username=current_user_identity['username']).first()
        user.profile_picture = file_path
        db.session.commit()
        
        return jsonify({"message": "Profile picture uploaded successfully"}), 200

    return jsonify({"message": "File type not allowed"}), 400

# Serve static files for uploaded profile pictures
@app.route('/uploads/profile_pictures/<filename>', methods=['GET'])
def uploaded_file(filename):
    return send_from_directory(app.config['UPLOAD_FOLDER'], filename)

# Route to delete user account
@app.route('/api/user/delete-account', methods=['DELETE'])
@token_not_blacklisted
@jwt_required()
def delete_account():
    current_user_identity = get_jwt_identity()
    user = User.query.filter_by(username=current_user_identity['username']).first()

    if user:
        db.session.delete(user)
        db.session.commit()
        return jsonify({"message": "User account deleted successfully"}), 200
    else:
        return jsonify({"message": "User not found"}), 404

# Utility function to credit an account
def credit_account(username, amount, description):
    try:
        user = User.query.filter_by(username=username).first()
        if user:
            user.wallet_balance += amount
            db.session.commit()
            return True, "Account credited successfully"
        else:
            return False, "User not found"
    except Exception as e:
        return False, f"Error crediting account: {str(e)}"

# Utility function to debit an account
def debit_account(username, amount, description):
    try:
        user = User.query.filter_by(username=username).first()
        if user:
            if user.wallet_balance >= amount:
                user.wallet_balance -= amount
                db.session.commit()
                return True, "Account debited successfully"
            else:
                return False, "Insufficient balance"
        else:
            return False, "User not found"
    except Exception as e:
        return False, f"Error debiting account: {str(e)}"

# Utility function to check allowed file types
def allowed_file(filename):
    ALLOWED_EXTENSIONS = {'png', 'jpg', 'jpeg', 'gif'}
    return '.' in filename and filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS


@app.route('/')
def serve_index():
    return send_from_directory('build/web', 'index.html')

@app.route('/<path:filename>')
def serve_static(filename):
    return send_from_directory('build/web', filename)

if __name__ == '__main__':
    app.run(debug=True)

