import 'package:flutter/material.dart';
import 'dart:convert'; // For jsonDecode
import 'package:http/http.dart' as https; // For HTTP requests
import 'package:shared_preferences/shared_preferences.dart'; // For Shared Preferences
import 'package:rflutter_alert/rflutter_alert.dart';
import 'dart:io'; // For detecting platform
import 'package:flutter/foundation.dart'; // For kIsWeb
import 'dart:js' as js; // For JavaScript interop (web)

// Define constants for Monnify payment parameters
const String API_KEY = 'MK_PROD_R882AY48ED'; // Updated API Key
const String CONTRACT_CODE = '684162887304'; // Updated Contract Code
const String PAYMENT_DESCRIPTION = 'Fund Wallet Payment';
const String TRANSACTION_API_URL = 'https://app.mikirudata.com.ng/api/transactions/transactions';
const String USER_DETAILS_API_URL = 'https://app.mikirudata.com.ng/api/user/details'; // Added user details URL

class FundScreen extends StatefulWidget {
  @override
  _FundScreenState createState() => _FundScreenState();
}

class _FundScreenState extends State<FundScreen> {
  String? fullName;
  String? email;
  String? phoneNumber; // Added to store the user's phone number
  String? token; // To store the token
  int amount = 0; // For storing the entered amount
  bool isUserDetailsFetched = false; // To track if user details have been fetched

  @override
  void initState() {
    super.initState();
    if (kIsWeb) {
      _setupPaymentListener();
    }
    _fetchUserDetails();
  }

  // Setup listeners for Monnify events on web
  void _setupPaymentListener() {
    if (kIsWeb) {
      if (js.context.hasProperty('onMessage')) {
        js.context['onMessage'].callMethod('addEventListener', [
          'monnifyResponse',
          (event) {
            final response = event['detail'];
            _handleMonnifyResponse(response); // Handle the response
          }
        ]);

        js.context['onMessage'].callMethod('addEventListener', [
          'monnifyClose',
          (event) {
            print('Monnify close: ${event['detail']}');
            Navigator.pop(context); // Close the Monnify spinner and go back to the app screen
          }
        ]);
      } else {
        print('onMessage is not defined');
      }
    }
  }

  Future<String?> _getStoredToken() async {
    final prefs = await SharedPreferences.getInstance();
    return prefs.getString('auth_token');
  }

  Future<Map<String, String>> _getAuthHeaders() async {
    final token = await _getStoredToken();
    return {
      'Authorization': token != null ? 'Bearer $token' : '', // Ensure 'Bearer ' is included
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

  Future<https.Response> _postRequest(String url, dynamic body) async {
    final headers = await _getAuthHeaders();
    final response = await https.post(
      Uri.parse(url),
      headers: headers,
      body: jsonEncode(body),
    );

    if (response.statusCode != 200) {
      throw Exception('Failed to post data');
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
          phoneNumber = data['phone']; // Add this line
        });
        setState(() {
          isUserDetailsFetched = true; // Set flag to true after successful fetch
        });
      } else {
        _showErrorAlert("Failed to fetch user details.");
      }
    } catch (e) {
      _showErrorAlert("An unexpected error occurred.");
    }
  }

  void _initiatePayment() {
    int finalAmount = amount + 20;

    if (kIsWeb) {
      // JavaScript-based Monnify payment on web
      String emptyJsonObject = '{}';

      try {
        js.context.callMethod('payWithMonnify', [
          finalAmount,
          'NGN',
          'mikirudata',
          fullName?.toString() ?? 'mikirudata',
          email?.toString() ?? '',
          API_KEY,
          CONTRACT_CODE,
          PAYMENT_DESCRIPTION,
          emptyJsonObject, // Sending an empty metadata object
          emptyJsonObject, // Sending an empty incomeSplitConfig object
        ]);
      } catch (e) {
        print("Error initiating payment: $e");
      }
    } else if (Platform.isAndroid || Platform.isIOS) {
      // Native Monnify SDK integration for Android or iOS
      _showErrorAlert("Native Monnify integration not implemented yet.");
    } else {
      // Handle other platforms or fallback logic
      _showErrorAlert("Unsupported platform.");
    }
  }

  // Method to handle Monnify response (for web)
  void _handleMonnifyResponse(dynamic response) async {
    try {
      final data = jsonDecode(response);
      final transactionDetails = {
        'transactionReference': data['transactionReference'],
        'amountPaid': data['amountPaid'],
        'paymentMethod': data['paymentMethod'],
      };

      final postResponse = await _postRequest(TRANSACTION_API_URL, transactionDetails);

      if (postResponse.statusCode == 200) {
        _showSuccessAlert("Transaction successful.");
      } else {
        _showErrorAlert("Failed to post transaction details.");
      }
    } catch (e) {
      _showErrorAlert("An unexpected error occurred while handling response.");
    }
  }

  // Method to show error alert using rflutter_alert
  void _showErrorAlert(String message) {
    Alert(
      context: context,
      title: "Error",
      desc: message,
      type: AlertType.error,
    ).show();
  }

  // Method to show success alert using rflutter_alert
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
          double containerWidth = isLargeScreen ? screenWidth * 0.5 : screenWidth * 0.9;

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
                          borderSide: BorderSide(color: Colors.blue[900]!, width: 2.0),
                        ),
                      ),
                      onChanged: (value) {
                        setState(() {
                          amount = int.tryParse(value) ?? 0; // Store entered amount
                        });
                      },
                    ),
                  ),
                  SizedBox(height: 20), // Added spacing between TextField and Button
                  ElevatedButton(
                    onPressed: isUserDetailsFetched ? () => _confirmAmount(context) : null,
                    child: Text('Proceed', style: TextStyle(color: Colors.white)),
                    style: ElevatedButton.styleFrom(
                      backgroundColor: Colors.blue[900],
                      padding: EdgeInsets.symmetric(horizontal: 40, vertical: 15),
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

  // Confirm amount before proceeding to Monnify
  void _confirmAmount(BuildContext context) {
    Alert(
      context: context,
      title: "Confirm Amount",
      desc: "You are about to fund your wallet with ₦$amount. Please confirm.",
      buttons: [
        DialogButton(
          child: Text("Proceed", style: TextStyle(color: Colors.white, fontSize: 18)),
          onPressed: () {
            Navigator.pop(context); // Close the dialog
            _initiatePayment(); // Proceed with payment
          },
          color: Colors.blue[900],
        ),
        DialogButton(
          child: Text("Cancel", style: TextStyle(color: Colors.white, fontSize: 18)),
          onPressed: () => Navigator.pop(context),
          color: Colors.grey,
        ),
      ],
    ).show();
  }
}
