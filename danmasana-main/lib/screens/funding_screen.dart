import 'package:flutter/material.dart';
import 'dart:convert';
import 'package:http/http.dart' as https;
import 'package:shared_preferences/shared_preferences.dart';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'package:monnify_payment_sdk/monnify_payment_sdk.dart';
import 'package:uuid/uuid.dart';


const String API_KEY = 'MK_PROD_R882AY48ED';
const String CONTRACT_CODE = '684162887304';
const String PAYMENT_DESCRIPTION = 'Fund Wallet Payment';
const String TRANSACTION_API_URL =
    'https://app.mikirudata.com.ng/api/transactions/transactions';
const String USER_DETAILS_API_URL =
    'https://app.mikirudata.com.ng/api/user/details';

class FundScreen extends StatefulWidget {
  @override
  _FundScreenState createState() => _FundScreenState();
}

class _FundScreenState extends State<FundScreen> {
  String? fullName;
  String? email;
  String? phoneNumber;
  String? token;
  int amount = 0;
  bool isUserDetailsFetched = false;
  Monnify? monnify;

  @override
  void initState() {
    super.initState();
    _initializeMonnify();
    _fetchUserDetails();
  }

  Future<void> _initializeMonnify() async {
    try {
      monnify = await Monnify.initialize(
        applicationMode: ApplicationMode.LIVE,
        apiKey: API_KEY,
        contractCode: CONTRACT_CODE,
      );
    } catch (e) {
      print('Error initializing Monnify: $e');
    }
  }

  Future<String?> _getStoredToken() async {
    final prefs = await SharedPreferences.getInstance();
    return prefs.getString('auth_token');
  }

  Future<Map<String, String>> _getAuthHeaders() async {
    final token = await _getStoredToken();
    return {
      'Authorization': token != null ? 'Bearer $token' : '',
      'Content-Type': 'application/json',
    };
  }

  Future<https.Response> _getRequest(String url) async {
    final headers = await _getAuthHeaders();
    final response = await https.get(Uri.parse(url), headers: headers);
    if (response.statusCode != 200) {
      throw Exception('Failed to load data');
    }
    return response;
  }

  Future<void> _fetchUserDetails() async {
    try {
      final response = await _getRequest(USER_DETAILS_API_URL);
      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        setState(() {
          fullName = data['fullname'];
          email = data['email'];
          phoneNumber = data['phone'];
          isUserDetailsFetched = true;
        });
      } else {
        _showErrorAlert("Failed to fetch user details.");
      }
    } catch (e) {
      _showErrorAlert("An unexpected error occurred.");
    }
  }

  Future<void> _initializePayment() async {
  try {
    final double paymentAmount = (this.amount.toDouble() + 20); // Add ₦20 as a fee
    final String paymentReference = Uuid().v4(); // Generate a unique UUID

    if (fullName == null || email == null) {
      _showErrorAlert("User details not available.");
      return;
    }

    final transaction = TransactionDetails().copyWith(
      amount: paymentAmount,
      currencyCode: 'NGN',
      customerName: fullName ?? 'Customer Name',
      customerEmail: email ?? 'customer@example.com',
      paymentReference: paymentReference, // Use UUID as payment reference
    );

    final response = await monnify?.initializePayment(transaction: transaction);

    if (response != null && response.transactionStatus == 'SUCCESS') {
      _handlePaymentSuccess(response.amountPaid);
    } else {
      _showErrorAlert('Payment failed');
    }
  } catch (e) {
    _showErrorAlert('Error initiating payment');
  }
}

  void _handlePaymentSuccess(double amountPaid) {
    // Show success alert with the amount paid
    _showSuccessAlert("Transaction successful. Amount paid: ₦$amountPaid");

    // Post transaction details if needed
    // You can implement this if you want to send transaction details to your server
  }

  void _showErrorAlert(String message) {
    Alert(
      context: context,
      title: "Error",
      desc: message,
      type: AlertType.error,
    ).show();
  }

  void _showSuccessAlert(String message) {
    Alert(
      context: context,
      title: "Success",
      desc: message,
      type: AlertType.success,
    ).show();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.blue[900],
        title: Center(
          child: Text(
            'Fund Wallet',
            style: TextStyle(color: Colors.white),
          ),
        ),
        leading: IconButton(
          icon: Icon(Icons.arrow_back, color: Colors.white),
          onPressed: () {
            Navigator.pop(context); // Navigate back to the previous screen
          },
        ),
      ),
      body: LayoutBuilder(
        builder: (context, constraints) {
          double screenWidth = constraints.maxWidth;
          bool isLargeScreen = screenWidth > 600;
          double containerWidth =
              isLargeScreen ? screenWidth * 0.5 : screenWidth * 0.9;

          return Center(
            child: Container(
              width: containerWidth,
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                  Padding(
                    padding: const EdgeInsets.all(20.0),
                    child: TextField(
                      keyboardType: TextInputType.number,
                      decoration: InputDecoration(
                        labelText: 'Enter amount (₦)',
                        hintText: 'Enter amount',
                        hintStyle: TextStyle(color: Colors.blue[900]),
                        border: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(8.0),
                          borderSide: BorderSide(color: Colors.blue[900]!),
                        ),
                        enabledBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(8.0),
                          borderSide: BorderSide(color: Colors.blue[900]!),
                        ),
                        focusedBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(8.0),
                          borderSide:
                              BorderSide(color: Colors.blue[900]!, width: 2.0),
                        ),
                      ),
                      onChanged: (value) {
                        setState(() {
                          amount =
                              int.tryParse(value) ?? 0; // Store entered amount
                        });
                      },
                    ),
                  ),
                  SizedBox(
                      height: 20), // Added spacing between TextField and Button
                  ElevatedButton(
                    onPressed: isUserDetailsFetched
                        ? () => _confirmAmount() // No need to pass context here
                        : null,
                    child:
                        Text('Proceed', style: TextStyle(color: Colors.white)),
                    style: ElevatedButton.styleFrom(
                      backgroundColor: Colors.blue[900],
                      padding:
                          EdgeInsets.symmetric(horizontal: 40, vertical: 15),
                      textStyle: TextStyle(fontSize: 18),
                      shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(8),
                      ),
                    ),
                  ),
                ],
              ),
            ),
          );
        },
      ),
    );
  }

  void _confirmAmount() {
    Alert(
      context: context,
      title: "Confirm Amount",
      desc: "You are about to fund your wallet with ₦$amount. Please confirm.",
      buttons: [
        DialogButton(
          child: Text("Proceed"),
          onPressed: () {
            Navigator.pop(context);
            _initializePayment(); // Initiate the payment process
          },
          color: Colors.blue[900],
        ),
        DialogButton(
          child: Text("Cancel"),
          onPressed: () => Navigator.pop(context),
          color: Colors.grey,
        ),
      ],
    ).show();
  }
}
