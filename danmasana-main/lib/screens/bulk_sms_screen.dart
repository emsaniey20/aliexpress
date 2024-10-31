import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'package:http/http.dart' as https;
import 'package:flutter/services.dart';
import 'package:shared_preferences/shared_preferences.dart';


class BulkSmsScreen extends StatefulWidget {
  @override
  _BulkSmsScreenState createState() => _BulkSmsScreenState();
}

class _BulkSmsScreenState extends State<BulkSmsScreen> {
  TextEditingController senderNameController = TextEditingController();
  TextEditingController phoneNumbersController = TextEditingController();
  TextEditingController messageController = TextEditingController();
  TextEditingController pinController = TextEditingController();

  void _onProceed() {
    if (senderNameController.text.isNotEmpty &&
        phoneNumbersController.text.isNotEmpty &&
        messageController.text.isNotEmpty) {
      _showTransactionPinDialog();
    } else {
      Alert(
        context: context,
        type: AlertType.error,
        title: "Error",
        desc: "Please fill all fields",
        buttons: [
          DialogButton(
            child: Text(
              "OK",
              style: TextStyle(color: Colors.white, fontSize: 18),
            ),
            onPressed: () => Navigator.pop(context),
          )
        ],
      ).show();
    }
  }

  void _showTransactionPinDialog() {
    Alert(
      context: context,
      type: AlertType.none,
      title: "Are you sure?",
      content: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          SizedBox(height: 10),
          Text(
            "You want to send a message. Validate your transaction pin to proceed.",
            style: TextStyle(
              fontSize: 16,
              color: Colors.blue[900],
            ),
          ),
          SizedBox(height: 20),
          PinInputField(
            pinController: pinController,
            onComplete: (pin) {
              _validateTransactionPin(pin);
            },
          ),
        ],
      ),
      buttons: [
        DialogButton(
          onPressed: () {
            _validateTransactionPin(pinController.text);
          },
          child: Text(
            "Validate Pin",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
        ),
      ],
    ).show();
  }

  Future<void> _validateTransactionPin(String pin) async {
    final url = Uri.parse('https://app.mikirudata.com.ng/api/auth/validate-pin');
    
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
          // Success response
          Navigator.pop(context);
          _submitBulkSms(); // Proceed with the bulk SMS submission
        } else {
          // Error response from server
          print('Pin validation message: ${data['message']}');
          _showAlert("Invalid Pin", data['message'], AlertType.error);
        }
      } else {
        // Handle unexpected status codes
        _showAlert("Failed", "Pin validation failed. Please try again.", AlertType.error);
      }
    } catch (e) {
      _showAlert("Error", "Error: $e", AlertType.error);
    }
  }

  Future<void> _submitBulkSms() async {
  final url = Uri.parse('https://app.mikirudata.com.ng/api/bulksms/purchase');

  // Retrieve the token from SharedPreferences
  final prefs = await SharedPreferences.getInstance();
  final token = prefs.getString('auth_token');

  // Construct the request payload
  final requestBody = {
    'sender': senderNameController.text,
    'numbers': phoneNumbersController.text.split(',').map((number) => number.trim()).toList(),
    'message': messageController.text,
    'requestId': 'BulkSMS_${DateTime.now().millisecondsSinceEpoch}', // Example requestId
  };

  // Debug prints to check the payload
  print('Request URL: $url');
  print('Request Payload: ${json.encode(requestBody)}');

  try {
    final response = await https.post(
      url,
      headers: {
        'Authorization': token != null ? 'Bearer $token' : '',
        'Content-Type': 'application/json',
      },
      body: json.encode(requestBody),
    );

    print('Response Status Code: ${response.statusCode}');
    print('Response Body: ${response.body}');

    if (response.statusCode == 200) {
      final data = json.decode(response.body);

      // Handle the response data accordingly
      if (data['success']) {
        _showAlert("Success", "Bulk SMS sent successfully.", AlertType.success);
      } else {
        // Error response from server
        final errorMessage = data['message'] ?? "An unknown error occurred.";
        print('Bulk SMS error message: $errorMessage');
        _showAlert("Failed", errorMessage, AlertType.error);
      }
    } else {
      // Handle unexpected status codes
      final errorMessage = response.body.isNotEmpty
          ? json.decode(response.body)['message'] ?? "Bulk SMS submission failed. Please try again."
          : "Bulk SMS submission failed. Please try again.";
      _showAlert("Failed", errorMessage, AlertType.error);
    }
  } catch (e) {
    // Handle network or parsing errors
    print('Exception occurred: $e');
    _showAlert("Error", "An error occurred: $e", AlertType.error);
  }
}

  void _showAlert(String title, String desc, AlertType alertType) {
    Alert(
      context: context,
      type: alertType,
      title: title,
      desc: desc,
      buttons: [
        DialogButton(
          child: Text(
            "OK",
            style: TextStyle(color: Colors.white, fontSize: 18),
          ),
          onPressed: () => Navigator.pop(context),
        )
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
          'Bulk SMS',
          style: TextStyle(color: Colors.white),
        ),
      ),
      backgroundColor: Colors.blue[900],
      iconTheme: IconThemeData(color: Colors.white),
    ),
    body: LayoutBuilder(
      builder: (context, constraints) {
        double screenWidth = constraints.maxWidth;
        bool isLargeScreen = screenWidth > 600;
        double containerWidth = isLargeScreen ? screenWidth * 0.5 : screenWidth * 0.8;

        return Stack(
          children: [
            Container(
              width: double.infinity,
              height: double.infinity,
              decoration: BoxDecoration(
                image: DecorationImage(
                  image: AssetImage('assets/images/background.jpg'),
                  fit: BoxFit.cover,
                ),
              ),
              child: Center(
                child: Container(
                  width: containerWidth,
                  child: SingleChildScrollView(
                    child: Padding(
                      padding: const EdgeInsets.all(16.0),
                      child: Column(
                        mainAxisAlignment: MainAxisAlignment.start,
                        crossAxisAlignment: CrossAxisAlignment.stretch, // Align children to stretch across width
                        children: [
                          Center(
                      child: Text(
                        'Bulk SMS',
                        style: TextStyle(
                          color: Colors.blue[900],
                          fontSize: 24,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ),
                          // Sender Name Input
                          CustomTextField(
                            controller: senderNameController,
                            hint: 'Enter Sender Name',
                          ),
                          SizedBox(height: 20),

                          // Phone Numbers Input
                          CustomTextField(
                            controller: phoneNumbersController,
                            hint: 'Type or paste up to 10000 numbers, separated by commas, no spaces',
                            maxLines: 3,
                          ),
                          SizedBox(height: 20),

                          // Message Input
                          CustomTextField(
                            controller: messageController,
                            hint: 'Enter Your Message',
                            maxLines: 5,
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
                              textStyle: TextStyle(fontSize: 18),
                              shape: RoundedRectangleBorder(
                                borderRadius: BorderRadius.circular(15),
                              ),
                            ),
                          ),
                        ],
                      ),
                    ),
                  ),
                ),
              ),
            ),
          ],
        );
      },
    ),
  );
}
}
class CustomTextField extends StatelessWidget {
  final TextEditingController controller;
  final String hint;
  final TextInputType keyboardType;
  final int? maxLines;

  CustomTextField({
    required this.controller,
    required this.hint,
    this.keyboardType = TextInputType.text,
    this.maxLines = 1,
  });

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.symmetric(horizontal: 16),
      decoration: BoxDecoration(
        border: Border.all(color: Colors.blue[900]!, width: 1),
        borderRadius: BorderRadius.circular(15),
      ),
      child: TextField(
        controller: controller,
        keyboardType: keyboardType,
        maxLines: maxLines,
        decoration: InputDecoration(
          border: InputBorder.none,
          hintText: hint,
          hintStyle: TextStyle(color: Colors.grey),
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
  List<TextEditingController> _controllers = List.generate(4, (index) => TextEditingController());

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
    return Row(
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
            textInputAction: index == 3 ? TextInputAction.done : TextInputAction.next,
            style: TextStyle(fontSize: 24),
            decoration: InputDecoration(
              counterText: "",
              enabledBorder: OutlineInputBorder(
                borderSide: BorderSide(width: 2, color: Colors.blue[900]!),
                borderRadius: BorderRadius.circular(8),
              ),
              focusedBorder: OutlineInputBorder(
                borderSide: BorderSide(width: 2, color: Colors.blue[900]!),
                borderRadius: BorderRadius.circular(8),
              ),
            ),
            inputFormatters: [FilteringTextInputFormatter.digitsOnly], // Only numeric input
            onChanged: (value) {
              if (value.isNotEmpty) {
                // Move to the next field if it's not the last field
                if (index < 3) {
                  _focusNodes[index + 1].requestFocus();
                } else {
                  // If the last field is filled, complete the PIN entry
                  String pin = _controllers.map((controller) => controller.text).join();
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
                String pin = _controllers.map((controller) => controller.text).join();
                widget.pinController.text = pin;
                widget.onComplete(pin);

                // Dismiss keyboard after PIN entry
                FocusScope.of(context).unfocus();
              }
            },
          ),
        );
      }),
    );
  }
}