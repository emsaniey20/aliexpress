import 'package:flutter/material.dart';
import 'package:http/http.dart' as https;
import 'dart:convert';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:flutter/services.dart';

class TVCableScreen extends StatefulWidget {
  @override
  _TVCableScreenState createState() => _TVCableScreenState();
}

class _TVCableScreenState extends State<TVCableScreen> {
  String? selectedCableProvider;
  String? selectedSubscription;
  TextEditingController costController = TextEditingController();
  TextEditingController smartcardController = TextEditingController();
  TextEditingController pinController = TextEditingController();
  String attachedUsername = "N/A";

  List<Map<String, dynamic>> cableProviders = [];
  List<Map<String, dynamic>> subscriptions = [];

  @override
  void initState() {
    super.initState();
    _fetchCableProviders();
  }

  Future<void> _fetchCableProviders() async {
    try {
      final response = await https
          .get(Uri.parse('https://app.mikirudata.com.ng/api/cable/networks'));
      if (response.statusCode == 200) {
        setState(() {
          cableProviders =
              List<Map<String, dynamic>>.from(json.decode(response.body));
        });
      } else {
        _showToast(context, 'Failed to load cable providers');
      }
    } catch (e) {
      _showToast(context, 'Error: $e');
    }
  }

  Future<void> _fetchSubscriptions(String providerId) async {
    try {
      final response = await https.get(Uri.parse(
          'https://app.mikirudata.com.ng/api/cable/plans/network/$providerId'));
      if (response.statusCode == 200) {
        setState(() {
          subscriptions =
              List<Map<String, dynamic>>.from(json.decode(response.body));
        });
      } else {
        _showToast(context, 'Failed to load subscriptions');
      }
    } catch (e) {
      _showToast(context, 'Error: $e');
    }
  }

  Future<void> _validateIUCNumber(String iucNumber, String cableCode) async {
    // Use a valid fallback map if provider is not found
    final selectedProvider = cableProviders.firstWhere(
      (provider) => provider['id'].toString() == selectedCableProvider,
      orElse: () => {
        'id': '0', // Provide a default id or handle accordingly
        'name': 'Unknown',
        'code': '0',
        'createdAt': '',
        'updatedAt': '',
      },
    );

    // If the selectedProvider has default values, you might want to check if it's valid
    if (selectedProvider['id'] == '0') {
      _showAlert(
          context, AlertType.error, 'Error', 'Selected provider not found.');
      return;
    }

    final networkId = selectedProvider['id'].toString();

    final url = Uri.parse(
        'https://bankauradatasub.com/api/cable/cable-validation?iuc=$iucNumber&network_id=$networkId');

    try {
      final response = await https.get(url);

      print('Request URL: $url');
      print('Response Status Code: ${response.statusCode}');
      print('Response Body: ${response.body}');

      if (response.statusCode == 200) {
        final data = json.decode(response.body);

        if (data['success']) {
          // Validation succeeded
          // Process the response or update UI accordingly
        } else {
          _showAlert(context, AlertType.error, 'Error',
              'Validation failed: ${data['message']}');
        }
      } else {
        _showAlert(context, AlertType.error, 'Error',
            'Failed to validate IUC number.');
      }
    } catch (e) {
      _showAlert(context, AlertType.error, 'Error', 'An error occurred: $e');
    }
  }

  void _onProceed() {
    if (selectedCableProvider != null &&
        selectedSubscription != null &&
        costController.text.isNotEmpty &&
        smartcardController.text.isNotEmpty) {
      // Show the pin dialog to allow the user to enter the transaction pin
      _showTransactionPinDialog();
    } else {
      _showAlert(context, AlertType.error, 'Error',
          'Please fill in all required fields.');
    }
  }

  void _showTransactionPinDialog() {
    Alert(
      context: context,
      type: AlertType.none,
      title: 'Enter Transaction Pin',
      content: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          SizedBox(height: 10),
          Text('Smartcard Number: ${smartcardController.text}'),
          Text(
            'Subscription Cost: \NGN${costController.text}',
            style: TextStyle(
              fontSize: 16,
              color: Colors.blue[900],
            ),
          ),
          SizedBox(height: 20),
          PinInputField(
            pinController: pinController,
            onComplete: (pin) {
              // Validate the pin after entry
              _validateTransactionPinForTV(pinController.text);
            },
          ),
        ],
      ),
      buttons: [
        DialogButton(
          onPressed: () {
            _validateTransactionPinForTV(
                pinController.text); // Validate pin when the button is pressed
          },
          child: Text(
            "Validate Pin",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
        ),
      ],
    ).show();
  }

  Future<void> _validateTransactionPinForTV(String pin) async {
    final url =
        Uri.parse('https://app.mikirudata.com.ng/api/auth/validate-pin');

    // Retrieve the token from SharedPreferences
    final prefs = await SharedPreferences.getInstance();
    final token = prefs.getString('auth_token');

    try {
      final response = await https.post(
        url,
        headers: {
          'Authorization': token != null ? 'Bearer $token' : '',
          'Content-Type': 'application/json',
        },
        body: json.encode({
          'transactionPin': pin,
        }),
      );

      print('Request URL: $url');
      print('Request Payload: ${json.encode({'transactionPin': pin})}');
      print('Response Status Code: ${response.statusCode}');
      print('Response Body: ${response.body}');

      if (response.statusCode == 200) {
        final data = json.decode(response.body);

        // Check the response data and handle accordingly
        if (data['success']) {
          // Success response - pin validation succeeded
          Navigator.pop(context); // Close any open pin dialog or screen
          _submitTVSubscription(); // Proceed with the TV subscription purchase
        } else {
          // Error response from server
          print('Pin validation message: ${data['message']}');
          _showAlert(context, AlertType.error, "Invalid Pin", data['message']);
        }
      } else {
        // Handle unexpected status codes
        _showAlert(context, AlertType.error, "Failed",
            "Pin validation failed. Please try again.");
      }
    } catch (e) {
      _showAlert(context, AlertType.error, "Error", "Error: $e");
    }
  }

  Future<void> _submitTVSubscription() async {
    final selectedProvider = cableProviders.firstWhere(
      (provider) => provider['id'].toString() == selectedCableProvider,
      orElse: () => {
        'id': '0',
        'name': 'Unknown',
        'code': '0',
        'createdAt': '',
        'updatedAt': '',
      },
    );
    final selectedPlan = subscriptions.firstWhere(
      (plan) => plan['id'].toString() == selectedSubscription,
      orElse: () => {
        'id': '0',
        'plan_name': 'Unknown',
        'amount': 0,
        'charges': 0,
      },
    );

    if (selectedProvider['id'] == '0' || selectedPlan['id'] == '0') {
      _showAlert(context, AlertType.error, 'Error',
          'Invalid provider or subscription selected.');
      return;
    }

    final requestData = {
      'provider_id': selectedProvider['id'].toString(),
      'plan_id': selectedPlan['id'].toString(),
      'smartcard_number': smartcardController.text,
    };

    final prefs = await SharedPreferences.getInstance();
    final token = prefs.getString('auth_token');

    try {
      final response = await https.post(
        Uri.parse('https://app.mikirudata.com.ng/api/cables/purchase'),
        headers: {
          'Authorization': 'Bearer $token',
          'Content-Type': 'application/json',
        },
        body: json.encode(requestData),
      );

      if (response.statusCode == 200) {
        final responseData = json.decode(response.body);
        if (responseData['status'] == 'success') {
          _showAlert(context, AlertType.success, 'Success',
              'Subscription successful!');
        } else {
          final errorMessage =
              responseData['message'] ?? 'Failed to process subscription.';
          _showAlert(context, AlertType.error, 'Error', errorMessage);
        }
      } else {
        final responseData = json.decode(response.body);
        final errorMessage =
            responseData['message'] ?? 'Failed to process subscription.';
        _showAlert(context, AlertType.error, 'Error', errorMessage);
      }
    } catch (e) {
      _showAlert(context, AlertType.error, 'Error', 'An error occurred: $e');
    }
  }

  void _showToast(BuildContext context, String message) {
    Alert(
      context: context,
      type: AlertType.error,
      title: "Notification",
      desc: message,
      buttons: [],
    ).show();
  }

  void _showAlert(
      BuildContext context, AlertType type, String title, String message) {
    Alert(
      context: context,
      type: type,
      title: title,
      desc: message, // Corrected to use `message`
      buttons: [
        DialogButton(
          child:
              Text("OK", style: TextStyle(color: Colors.white, fontSize: 18)),
          onPressed: () => Navigator.of(context).pop(),
          color: Colors.blue[900],
        ),
      ],
    ).show();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        leading: IconButton(
          icon: Icon(Icons.arrow_back, color: Colors.white),
          onPressed: () {
            Navigator.pop(context); // Navigate back to the previous route
          },
        ),
        title: Center(
          child: Text(
            'MIKIRUDATA',
            style: TextStyle(color: Colors.white),
          ),
        ),
        backgroundColor: Colors.blue[900],
        foregroundColor: Colors.white,
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Center(
          // Ensure content is centered
          child: Column(
            mainAxisSize: MainAxisSize.min, // Center the column vertically
            crossAxisAlignment:
                CrossAxisAlignment.center, // Center horizontally
            children: [
              Text(
                'TV Cable Subscription',
                style: TextStyle(
                  color: Colors.blue[900],
                  fontSize: 24,
                  fontWeight: FontWeight.bold,
                ),
              ),
              SizedBox(height: 20), // Add some spacing

              // Dropdown for Cable Providers
              DropdownButtonFormField<String>(
                decoration: InputDecoration(
                  border: OutlineInputBorder(
                    borderSide: BorderSide(color: Colors.blue[900]!),
                  ),
                ),
                dropdownColor: Colors.white,
                iconEnabledColor: Colors.blue[900],
                value: selectedCableProvider,
                hint: Text('Select Cable Provider',
                    style: TextStyle(color: Colors.blue[900])),
                items: cableProviders.map((provider) {
                  return DropdownMenuItem<String>(
                    value: provider['id'].toString(),
                    child: Text(provider['name'],
                        style: TextStyle(color: Colors.blue[900])),
                  );
                }).toList(),
                onChanged: (newValue) {
                  setState(() {
                    selectedCableProvider = newValue;
                    _fetchSubscriptions(
                        newValue!); // Fetch subscriptions when provider changes
                  });
                },
              ),
              SizedBox(height: 20),

              // Dropdown for Subscriptions
              DropdownButtonFormField<String>(
                decoration: InputDecoration(
                  border: OutlineInputBorder(
                    borderSide: BorderSide(color: Colors.blue[900]!),
                  ),
                ),
                dropdownColor: Colors.white,
                iconEnabledColor: Colors.blue[900],
                value: selectedSubscription,
                hint: Text('Select Subscription',
                    style: TextStyle(color: Colors.blue[900])),
                items: subscriptions.map((subscription) {
                  return DropdownMenuItem<String>(
                    value: subscription['id'].toString(),
                    child: Text(subscription['plan_name'],
                        style: TextStyle(color: Colors.blue[900])),
                  );
                }).toList(),
                onChanged: (newValue) {
                  setState(() {
                    selectedSubscription = newValue;

                    // Find the selected subscription and calculate the total cost
                    final selectedPlan = subscriptions.firstWhere(
                        (plan) => plan['id'].toString() == newValue);
                    final totalCost =
                        selectedPlan['amount'] + selectedPlan['charges'];

                    // Update the cost controller to display the total cost
                    costController.text = totalCost.toString();
                  });
                },
              ),
              SizedBox(height: 20),

              // Read-Only Cost Field
              TextField(
                controller: costController,
                readOnly: true, // Makes this field read-only
                decoration: InputDecoration(
                  border: OutlineInputBorder(
                    borderSide: BorderSide(color: Colors.blue[900]!),
                  ),
                  labelText: 'Cost',
                  labelStyle: TextStyle(color: Colors.blue[900]),
                ),
                keyboardType: TextInputType.number,
              ),
              SizedBox(height: 20),

              // Smartcard Number Input Field
              TextField(
                controller: smartcardController,
                decoration: InputDecoration(
                  border: OutlineInputBorder(
                    borderSide: BorderSide(color: Colors.blue[900]!),
                  ),
                  labelText: 'Smartcard Number',
                  labelStyle: TextStyle(color: Colors.blue[900]),
                ),
                keyboardType: TextInputType.number,
              ),
              SizedBox(height: 20),

              // Proceed Button
              ElevatedButton(
                onPressed: _onProceed,
                child: Text('Proceed'),
                style: ElevatedButton.styleFrom(
                  backgroundColor: Colors.blue[900],
                  foregroundColor: Colors.white,
                  padding: EdgeInsets.symmetric(horizontal: 50, vertical: 15),
                  textStyle: TextStyle(fontSize: 16),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

class PinInputField extends StatefulWidget {
  final TextEditingController pinController;
  final Function(String) onComplete;

  PinInputField({
    required this.pinController,
    required this.onComplete,
  });

  @override
  _PinInputFieldState createState() => _PinInputFieldState();
}

class _PinInputFieldState extends State<PinInputField> {
  List<FocusNode> _focusNodes = List.generate(4, (index) => FocusNode());
  List<TextEditingController> _controllers =
      List.generate(4, (index) => TextEditingController());

  @override
  void initState() {
    super.initState();
  }

  @override
  void dispose() {
    for (var controller in _controllers) {
      controller.dispose();
    }
    for (var node in _focusNodes) {
      node.dispose();
    }
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: 20),
      child: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          const SizedBox(height: 20),
          const Text(
            "Enter Transaction PIN",
            style: TextStyle(
              fontSize: 18,
              fontWeight: FontWeight.bold,
            ),
          ),
          const SizedBox(height: 20),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: List.generate(4, (index) {
              return Container(
                width: 50,
                child: TextField(
                  controller: _controllers[index],
                  focusNode: _focusNodes[index],
                  textAlign: TextAlign.center,
                  keyboardType: TextInputType.number,
                  maxLength: 1,
                  obscureText: true,
                  textInputAction:
                      index == 3 ? TextInputAction.done : TextInputAction.next,
                  style: TextStyle(fontSize: 24),
                  decoration: InputDecoration(
                    counterText: "",
                    enabledBorder: OutlineInputBorder(
                      borderSide:
                          BorderSide(width: 2, color: Colors.blue[900]!),
                      borderRadius: BorderRadius.circular(8),
                    ),
                    focusedBorder: OutlineInputBorder(
                      borderSide:
                          BorderSide(width: 2, color: Colors.blue[900]!),
                      borderRadius: BorderRadius.circular(8),
                    ),
                  ),
                  inputFormatters: [
                    FilteringTextInputFormatter.digitsOnly
                  ], // Only numeric input
                  onChanged: (value) {
                    if (value.isNotEmpty) {
                      // Move to the next field if it's not the last field
                      if (index < 3) {
                        _focusNodes[index + 1].requestFocus();
                      } else {
                        // If the last field is filled, complete the PIN entry
                        String pin = _controllers
                            .map((controller) => controller.text)
                            .join();
                        widget.pinController.text = pin;
                        widget.onComplete(pin);

                        // Dismiss keyboard after PIN entry
                        FocusScope.of(context).unfocus();
                      }
                    } else if (value.isEmpty && index > 0) {
                      // Move to the previous field if the current field is empty
                      _focusNodes[index - 1].requestFocus();
                    }
                  },
                  onSubmitted: (value) {
                    // Handle submission on the last field
                    if (index == 3) {
                      String pin = _controllers
                          .map((controller) => controller.text)
                          .join();
                      widget.pinController.text = pin;
                      widget.onComplete(pin);

                      // Dismiss keyboard after PIN entry
                      FocusScope.of(context).unfocus();
                    }
                  },
                ),
              );
            }),
          ),
          const SizedBox(height: 20),
        ],
      ),
    );
  }
}
