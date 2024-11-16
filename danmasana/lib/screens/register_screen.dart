import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'dart:convert';
import 'package:http/http.dart' as https;
import 'package:fluro/fluro.dart'; // Import Fluro

class RegisterScreen extends StatefulWidget {
  const RegisterScreen({Key? key, required this.router}) : super(key: key);
  final FluroRouter router; // Add router parameter

  @override
  _RegisterScreenState createState() => _RegisterScreenState();
}

class _RegisterScreenState extends State<RegisterScreen> {
  final _formKey = GlobalKey<FormState>();
  final TextEditingController _fullnameController = TextEditingController();
  final TextEditingController _usernameController = TextEditingController();
  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _phoneController = TextEditingController();
  final TextEditingController _transactionPinController =
      TextEditingController();
  final TextEditingController _passwordController = TextEditingController();
  final TextEditingController _confirmPasswordController =
      TextEditingController();
  final TextEditingController _bvnController = TextEditingController();
  final TextEditingController _ninController = TextEditingController();

  bool _isLoading = false;

  @override
  void initState() {
    super.initState();
    _showRequirementAlert();
  }

  void _showRequirementAlert() {
    Alert(
      context: context,
      type: AlertType.info,
      title: "Important Information",
      desc:
          "Please ensure you have either BVN or NIN before registering. Providing both is recommended for better verification.",
      buttons: [
        DialogButton(
          child: const Text("Okay", style: TextStyle(color: Colors.white)),
          onPressed: () => Navigator.pop(context),
        ),
      ],
    ).show();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.blue[900],
        title: const Text('Sign Up', style: TextStyle(color: Colors.white)),
        centerTitle: true,
      ),
      body: LayoutBuilder(
        builder: (context, constraints) {
          double contentWidth = constraints.maxWidth * 0.9; // 90% for mobile
          if (constraints.maxWidth > 600) {
            contentWidth = constraints.maxWidth * 0.5; // 50% for larger screens
          }

          return SingleChildScrollView(
            child: Center(
              child: Container(
                padding: const EdgeInsets.all(24.0),
                width: contentWidth,
                child: Form(
                  key: _formKey,
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.stretch,
                    children: [
                      const Text(
                        "Create Your Own Account",
                        style: TextStyle(
                          fontSize: 24,
                          fontWeight: FontWeight.bold,
                          color: Colors.black,
                        ),
                        textAlign: TextAlign.center,
                      ),
                      const SizedBox(height: 24),
                      _buildFullnameField(),
                      const SizedBox(height: 16),
                      _buildUsernameField(),
                      const SizedBox(height: 16),
                      _buildEmailField(),
                      const SizedBox(height: 16),
                      _buildPhoneField(),
                      const SizedBox(height: 16),
                      _buildBVNField(),
                      const SizedBox(height: 16),
                      _buildNINField(),
                      Row(
                        children: [
                          const Text("Why we ask for BVN or NIN?"),
                          IconButton(
                            icon: const Icon(Icons.help, color: Colors.blue),
                            onPressed: () => _showBVNInfoDialog(context),
                          ),
                        ],
                      ),
                      const SizedBox(height: 16),
                      _buildTransactionPinField(),
                      const SizedBox(height: 16),
                      _buildPasswordField(),
                      const SizedBox(height: 16),
                      _buildConfirmPasswordField(),
                      const SizedBox(height: 24),
                      ElevatedButton(
                        onPressed: _isLoading ? null : _submitForm,
                        style: ElevatedButton.styleFrom(
                          padding: const EdgeInsets.symmetric(vertical: 16),
                          backgroundColor: Colors.blue[900],
                        ),
                        child: _isLoading
                            ? const CircularProgressIndicator(
                                color: Colors.blue)
                            : const Text("Create your account",
                                style: TextStyle(
                                    fontSize: 20, color: Colors.white)),
                      ),
                      const SizedBox(height: 16),
                      _signup(context),
                    ],
                  ),
                ),
              ),
            ),
          );
        },
      ),
    );
  }

  Widget _buildFullnameField() {
    return TextFormField(
      controller: _fullnameController,
      decoration: InputDecoration(
        labelText: "Fullname",
        prefixIcon: Icon(Icons.person),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
      ),
      validator: (value) {
        if (value == null || value.isEmpty) {
          return 'Please enter your full name';
        }
        return null;
      },
    );
  }

  Widget _buildUsernameField() {
    return TextFormField(
      controller: _usernameController,
      decoration: InputDecoration(
        labelText: "Username",
        prefixIcon: Icon(Icons.account_circle),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
      ),
      validator: (value) {
        if (value == null || value.isEmpty) {
          return 'Please enter a username';
        }
        return null;
      },
    );
  }

  Widget _buildEmailField() {
    return TextFormField(
      controller: _emailController,
      decoration: InputDecoration(
        labelText: "Email Address",
        prefixIcon: Icon(Icons.email),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
      ),
      keyboardType: TextInputType.emailAddress,
      validator: (value) {
        if (value == null || value.isEmpty) {
          return 'Please enter your email address';
        }
        if (!RegExp(r'^[^@]+@[^@]+\.[^@]+').hasMatch(value)) {
          return 'Please enter a valid email address';
        }
        return null;
      },
    );
  }

  Widget _buildPhoneField() {
    return TextFormField(
      controller: _phoneController,
      decoration: InputDecoration(
        labelText: "Phone Number",
        prefixIcon: Icon(Icons.phone),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
      ),
      keyboardType: TextInputType.phone,
      inputFormatters: [FilteringTextInputFormatter.digitsOnly],
      validator: (value) {
        if (value == null || value.isEmpty) {
          return 'Please enter your phone number';
        }
        if (value.length < 10) {
          return 'Please enter a valid phone number';
        }
        return null;
      },
    );
  }

  Widget _buildBVNField() {
    return TextFormField(
      controller: _bvnController,
      decoration: InputDecoration(
        labelText: "BVN",
        prefixIcon: Icon(Icons.account_balance),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
      ),
      keyboardType: TextInputType.number,
      inputFormatters: [FilteringTextInputFormatter.digitsOnly],
    );
  }

  Widget _buildNINField() {
    return TextFormField(
      controller: _ninController,
      decoration: InputDecoration(
        labelText: "NIN",
        prefixIcon: Icon(Icons.credit_card),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
      ),
      keyboardType: TextInputType.number,
      inputFormatters: [FilteringTextInputFormatter.digitsOnly],
    );
  }

  Widget _buildTransactionPinField() {
    return TextFormField(
      controller: _transactionPinController,
      decoration: InputDecoration(
        labelText: "Transaction Pin",
        prefixIcon: Icon(Icons.lock),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
      ),
      keyboardType: TextInputType.number,
      inputFormatters: [
        FilteringTextInputFormatter.digitsOnly,
        LengthLimitingTextInputFormatter(4),
      ],
      validator: (value) {
        if (value == null || value.isEmpty) {
          return 'Please enter your transaction pin';
        }
        if (value.length != 4) {
          return 'Transaction pin must be exactly 4 digits';
        }
        return null;
      },
    );
  }

  Widget _buildPasswordField() {
    return TextFormField(
      controller: _passwordController,
      decoration: InputDecoration(
        labelText: "Password",
        prefixIcon: Icon(Icons.lock),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
      ),
      obscureText: true,
      validator: (value) {
        if (value == null || value.isEmpty) {
          return 'Please enter a password';
        }
        if (value.length < 6) {
          return 'Password must be at least 6 characters';
        }
        if (!RegExp(r'(?=.*[A-Z])(?=.*[@$!%*?&])').hasMatch(value)) {
          return 'Password must contain at least one uppercase letter and one special character';
        }
        return null;
      },
    );
  }

  Widget _buildConfirmPasswordField() {
    return TextFormField(
      controller: _confirmPasswordController,
      decoration: InputDecoration(
        labelText: "Confirm Password",
        prefixIcon: Icon(Icons.lock),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
      ),
      obscureText: true,
      validator: (value) {
        if (value == null || value.isEmpty) {
          return 'Please confirm your password';
        }
        if (value != _passwordController.text) {
          return 'Passwords do not match';
        }
        return null;
      },
    );
  }

  Widget _signup(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        const Text('Already have an account?'),
        TextButton(
          onPressed: () {
            widget.router.navigateTo(
                context, '/auth/login'); // Navigate to the registration screen
          },
          child: Text(
            "Sign In",
            style: TextStyle(color: Colors.blue[900]),
          ),
        ),
      ],
    );
  }

  void _showBVNInfoDialog(BuildContext context) {
    Alert(
      context: context,
      title: "Why BVN or NIN?",
      desc:
          "The Central Bank of Nigeria (CBN) mandates the use of BVN or NIN for identity verification to comply with Know Your Customer (KYC) regulations and ensure the safety of your account.",
      buttons: [
        DialogButton(
          child: const Text("Okay", style: TextStyle(color: Colors.white)),
          onPressed: () => Navigator.pop(context),
        ),
      ],
    ).show();
  }

  Future<void> _submitForm() async {
    if (_formKey.currentState!.validate()) {
      if (_bvnController.text.isEmpty && _ninController.text.isEmpty) {
        Alert(
          context: context,
          type: AlertType.error,
          title: "Missing Information",
          desc: "Please provide either BVN or NIN.",
          buttons: [
            DialogButton(
              child: const Text("Okay", style: TextStyle(color: Colors.white)),
              onPressed: () => Navigator.pop(context),
            ),
          ],
        ).show();
        return;
      }

      setState(() {
        _isLoading = true;
      });

      try {
        final response = await _register();
        final Map<String, dynamic> responseBody = json.decode(response.body);

        if (response.statusCode == 201) {
          Alert(
            context: context,
            type: AlertType.success,
            title: "Registration Successful",
            desc: "Your account has been created successfully. Please log in.",
            buttons: [
              DialogButton(
                child:
                    const Text("Okay", style: TextStyle(color: Colors.white)),
                onPressed: () {
                  Navigator.pop(context); // Close alert
                  widget.router.navigateTo(context, '/auth/login',
                      clearStack: true); // Redirect to login screen
                },
              ),
            ],
          ).show();
        } else {
          String message = responseBody['message'] ??
              'Registration was not successful. Please try again.';

          Alert(
            context: context,
            type: AlertType.error,
            title: "Registration Error",
            desc: message,
            buttons: [
              DialogButton(
                child:
                    const Text("Okay", style: TextStyle(color: Colors.white)),
                onPressed: () => Navigator.pop(context),
              ),
            ],
          ).show();
        }
      } catch (e) {
        Alert(
          context: context,
          type: AlertType.error,
          title: "Connection Error",
          desc:
              "An error occurred. Please check your internet connection and try again.",
          buttons: [
            DialogButton(
              child: const Text("Okay", style: TextStyle(color: Colors.white)),
              onPressed: () => Navigator.pop(context),
            ),
          ],
        ).show();
      } finally {
        setState(() {
          _isLoading = false;
        });
      }
    }
  }

  Future<https.Response> _register() async {
    const url = 'https://app.mikirudata.com.ng/api/auth/register';
    final response = await https.post(
      Uri.parse(url),
      body: json.encode({
        'fullname': _fullnameController.text,
        'username': _usernameController.text,
        'email': _emailController.text,
        'phone': _phoneController.text,
        'bvn': _bvnController.text,
        'nin': _ninController.text,
        'transaction_pin': _transactionPinController.text,
        'password': _passwordController.text,
      }),
      headers: {'Content-Type': 'application/json'},
    );
    return response;
  }
}

void _showBVNInfoDialog(BuildContext context) {
  showDialog(
    context: context,
    builder: (BuildContext context) {
      return AlertDialog(
        title: const Text("BVN and NIN Information"),
        content: const Text(
          "BVN (Bank Verification Number) and NIN (National Identification Number) are used for verifying your identity. Providing these numbers helps ensure a secure and accurate registration process.",
        ),
        actions: [
          TextButton(
            onPressed: () {
              Navigator.of(context).pop();
            },
            child: const Text("Close"),
          ),
        ],
      );
    },
  );
}
