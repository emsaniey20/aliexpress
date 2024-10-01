import 'package:flutter/material.dart';
import 'package:http/http.dart' as https;
import 'dart:convert';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:flutter/services.dart';



class AirtimeScreen extends StatefulWidget {
  @override
  _AirtimeScreenState createState() => _AirtimeScreenState();
}

class _AirtimeScreenState extends State<AirtimeScreen> {
  String? selectedNetworkId;
  String? selectedAirtimeType;
  List<Map<String, dynamic>> networkProviders = [];
  List<String>? airtimeTypes;

  final TextEditingController phoneController = TextEditingController();
  final TextEditingController amountController = TextEditingController();
  final TextEditingController pinController = TextEditingController();

  @override
  void initState() {
    super.initState();
    fetchNetworkProviders();
  }

 Future<void> fetchNetworkProviders() async {
  try {
    final response = await https.get(Uri.parse('https://app.mikirudata.com.ng/api/airtime/networks'));

    if (response.statusCode == 200) {
      List<dynamic> providers = json.decode(response.body);
      setState(() {
        networkProviders = providers.map((provider) => {
          'name': provider['name'],
          'networkId': provider['networkId'].toString(),
        }).toList();
      });
    } else {
      _showAlert("Error", "Failed to load network providers", AlertType.error);
    }
  } catch (e) {
    _showAlert("Error", "Error: $e", AlertType.error);
  }
}


Future<void> fetchAirtimeTypes(String networkId) async {
  try {
    final response = await https.get(Uri.parse('https://app.mikirudata.com.ng/api/airtime/plans?network=$networkId'));

    if (response.statusCode == 200) {
      List<dynamic> types = json.decode(response.body);
      setState(() {
        airtimeTypes = types.map((type) => type['name'] as String).toList();
        selectedAirtimeType = null;
      });
    } else {
      _showAlert("Error", "Failed to load airtime types", AlertType.error);
    }
  } catch (e) {
    _showAlert("Error", "Error: $e", AlertType.error);
  }
}



 Future<void> _validateTransactionPin(String pin, BuildContext context) async {
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
        Navigator.pop(context); // Close the PIN dialog or screen
        await _submitAirtime(context); // Proceed with airtime purchase
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

Future<void> _submitAirtime(BuildContext context) async {
  if (selectedNetworkId == null) {
    _showAlert("Error", "Network provider not selected", AlertType.error);
    return;
  }

  final url = Uri.parse('https://app.mikirudata.com.ng/api/airtime/purchase');
  final prefs = await SharedPreferences.getInstance();
  final token = prefs.getString('auth_token');

  final requestBody = {
    'networkId': selectedNetworkId, // Ensure this is the ID
    'phone': phoneController.text,
    'amount': amountController.text,
    'requestId': 'Airtime_${DateTime.now().millisecondsSinceEpoch}',
    'identifier_number': phoneController.text,
  };

  try {
    final response = await https.post(
      url,
      headers: {
        'Authorization': token != null ? 'Bearer $token' : '',
        'Content-Type': 'application/json',
      },
      body: json.encode(requestBody),
    );

    if (response.statusCode == 200) {
      final responseData = json.decode(response.body);
      final amount = responseData['amount'];
      final phone = phoneController.text;

      _showAlert(
        "Success",
        "Airtime purchased successfully!\n\n"
        "Phone Number: $phone\n"
        "Amount: NGN $amount",
        AlertType.success,
      );
    } else {
      final errorMessage = json.decode(response.body)['message'] ?? 'Unknown error';

      _showAlert(
        "Purchase Failed",
        errorMessage,
        AlertType.error,
      );
    }
  } catch (error) {
    _showAlert(
      "Error",
      "An error occurred while processing your airtime purchase. Please try again.",
      AlertType.error,
    );
  }
}

  void _showAlert(String title, String description, AlertType type) {
    Alert(
      context: context,
      type: type,
      title: title,
      desc: description,
      style: AlertStyle(
        titleStyle: TextStyle(
          fontWeight: FontWeight.bold,
          color: Colors.blue[900],
          fontSize: 22,
        ),
        titleTextAlign: TextAlign.center,
      ),
      buttons: [
        DialogButton(
          child: Text(
            "OK",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
          onPressed: () => Navigator.pop(context),
        )
      ],
    ).show();
  }

  void _onProceed() {
    if (selectedNetworkId != null &&
        selectedAirtimeType != null &&
        phoneController.text.isNotEmpty &&
        amountController.text.isNotEmpty) {
      _showTransactionPinDialog();
    } else {
      _showAlert("Warning", "Please fill all fields", AlertType.warning);
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
            "You want to purchase airtime for ${phoneController.text}. Validate your transaction pin to proceed.",
            style: TextStyle(
              fontSize: 16,
              color: Colors.blue[900],
            ),
          ),
          SizedBox(height: 20),
          PinInputField(
            pinController: pinController,
            onComplete: (pin) {
              _validateTransactionPin(pin, context);

            },
          ),
        ],
      ),
      buttons: [
        DialogButton(
          onPressed: () {
_validateTransactionPin(pinController.text, context);
          },
          child: Text(
            "Validate Pin",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
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
          'MIKIRUDATA', // Title in the AppBar
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
        double containerWidth = isLargeScreen ? screenWidth * 0.5 : screenWidth * 0.9;

        return Center(
          child: Container(
            width: containerWidth,
            child: SingleChildScrollView(
              padding: const EdgeInsets.all(16.0),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  // Heading for Airtime Purchase
                  Center(
                    child: Text(
                      'Airtime Purchase', // Same heading style as Data Plan
                      style: TextStyle(
                        color: Colors.blue[900],
                        fontSize: 24,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                  ),
                  SizedBox(height: 20),

                  // Dropdown for Network Providers
                  CustomDropdown(
                    hint: 'Select Network Provider',
                    value: selectedNetworkId,
                    onChanged: (String? newValue) {
                      setState(() {
                        selectedNetworkId = networkProviders.firstWhere(
                          (provider) => provider['name'] == newValue
                        )['networkId'];
                        fetchAirtimeTypes(selectedNetworkId!);
                      });
                    },
                    items: networkProviders.map((provider) => provider['name'] as String).toList(),
                  ),
                  SizedBox(height: 16.0),

                  // Dropdown for Airtime Type
                  CustomDropdown(
                    hint: 'Select Airtime Type',
                    value: selectedAirtimeType,
                    onChanged: (String? newValue) {
                      setState(() {
                        selectedAirtimeType = newValue;
                      });
                    },
                    items: airtimeTypes ?? [],
                  ),
                  SizedBox(height: 16.0),

                  // Phone Number Input
                  TextFormField(
                    controller: phoneController,
                    keyboardType: TextInputType.phone,
                    decoration: InputDecoration(
                      labelText: 'Phone Number',
                      labelStyle: TextStyle(color: Colors.blue[900]),
                      hintText: 'Enter Mobile Number',
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
                  ),
                  SizedBox(height: 16.0),

                  // Amount Input
                  TextFormField(
                    controller: amountController,
                    keyboardType: TextInputType.number,
                    decoration: InputDecoration(
                      labelText: 'Amount',
                      labelStyle: TextStyle(color: Colors.blue[900]),
                      hintText: 'Enter Amount',
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
                  ),
                  SizedBox(height: 20),

                  // Proceed Button
                  Center(
                    child: ElevatedButton(
                      onPressed: _onProceed,
                      child: Text('Proceed', style: TextStyle(color: Colors.white)),
                      style: ElevatedButton.styleFrom(
                        backgroundColor: Colors.blue[900],
                        padding: EdgeInsets.symmetric(horizontal: 40, vertical: 15),
                        textStyle: TextStyle(fontSize: 18),
                        shape: RoundedRectangleBorder(
                          borderRadius: BorderRadius.circular(8.0),
                        ),
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ),
        );
      },
    ),
  );
}
}
Widget _buildDropdown(String hint, String? value, List<String> items, ValueChanged<String?> onChanged) {
  return CustomDropdown(
    value: value,
    hint: hint,
    items: items,
    onChanged: onChanged,
  );
}

Widget _buildTextField(TextEditingController controller, TextInputType keyboardType, String label) {
  return TextField(
    controller: controller,
    keyboardType: keyboardType,
    decoration: InputDecoration(
      labelText: label,
      border: OutlineInputBorder(),
      filled: true,
      fillColor: Colors.grey[200],
    ),
  );
}


class CustomDropdown extends StatelessWidget {
  final String? value;
  final String hint;
  final List<String> items; // Changed type to List<String>
  final ValueChanged<String?>? onChanged;
  final bool isLoading;

  CustomDropdown({
    required this.value,
    required this.hint,
    required this.items,
    required this.onChanged,
    this.isLoading = false,
  });

  @override
  Widget build(BuildContext context) {
    return DropdownButtonFormField<String>(
      value: value,
      hint: Text(
        hint,
        style: TextStyle(color: Colors.blue[900]),
      ),
      decoration: InputDecoration(
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
        contentPadding: EdgeInsets.symmetric(horizontal: 10.0, vertical: 15.0),
      ),
      isExpanded: true,
      iconEnabledColor: Colors.blue[900],
      style: TextStyle(color: Colors.blue[900]),
      dropdownColor: Colors.white,
      items: items.map((item) {
        return DropdownMenuItem<String>(
          value: item,
          child: Container(
            width: double.infinity,
            child: Text(item),
          ),
        );
      }).toList(),
      onChanged: onChanged,
      isDense: true,
      alignment: Alignment.centerLeft,
      menuMaxHeight: 250,
      itemHeight: 60,
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