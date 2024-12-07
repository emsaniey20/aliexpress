import 'package:flutter/material.dart';
import 'package:http/http.dart' as https;
import 'dart:convert';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'package:flutter/services.dart';

class ElectricBillScreen extends StatefulWidget {
  @override
  _ElectricBillScreenState createState() => _ElectricBillScreenState();
}

class _ElectricBillScreenState extends State<ElectricBillScreen> {
  String? selectedDisco; // Store only the discoId as String
  String? selectedMeterType; // Nullable to allow no selection initially
  bool isLoadingMeterTypes = false; // Loading flag for meter types
  final _formKey = GlobalKey<FormState>();
  List<Map<String, dynamic>> discoNames =
      []; // Initially empty, to be populated by API
  List<Map<String, dynamic>> meterTypes =
      []; // Initially empty, to be populated by API
  TextEditingController meterNumberController = TextEditingController();
  TextEditingController amountController = TextEditingController();
  TextEditingController pinController = TextEditingController();

  Map<String, dynamic>? getSelectedDisco() {
    // Find the Disco map that matches the selected discoId
    return discoNames.firstWhere(
        (disco) => disco['discoId'].toString() == selectedDisco,
        orElse: () =>
            {} // Return an empty map or handle the case where the Disco is not found
        );
  }

  @override
  void dispose() {
    meterNumberController.dispose();
    amountController.dispose();
    pinController.dispose();
    super.dispose();
  }

  Future<void> fetchDiscoNames() async {
    try {
      final response = await https.get(
        Uri.parse('https://app.mikirudata.com.ng/api/electricbill/disco-names'),
      );

      print('Disco API Response Status: ${response.statusCode}');
      print('Disco API Response Body: ${response.body}');

      if (response.statusCode == 200) {
        setState(() {
          discoNames =
              List<Map<String, dynamic>>.from(json.decode(response.body));
        });
      } else {
        throw Exception('Failed to load Disco names');
      }
    } catch (e) {
      print('Error fetching Disco names: $e');
      // Handle the error accordingly
    }
  }

// Fetch meter types based on selected Disco
  Future<void> fetchMeterTypes(String discoId) async {
    setState(() {
      isLoadingMeterTypes = true; // Start loading indicator
      meterTypes = []; // Clear previous meterTypes data
    });

    try {
      final response = await https.get(
        Uri.parse(
            'https://app.mikirudata.com.ng/api/electricbill/meter-types?discoId=$discoId'),
      );

      // Debug logging
      print('Meter Types API Response Status: ${response.statusCode}');
      print('Meter Types API Response Body: ${response.body}');

      if (response.statusCode == 200) {
        final data = json.decode(response.body);

        // Ensure the response structure matches what is expected
        if (data['meterTypes'] != null) {
          setState(() {
            meterTypes = List<Map<String, dynamic>>.from(data['meterTypes']);
          });
        } else {
          throw Exception('Invalid meterTypes data structure');
        }
      } else {
        throw Exception('Failed to load Meter types');
      }
    } catch (e) {
      print('Error fetching Meter types: $e');
      _showAlert('Error', 'Failed to load Meter types. Please try again later.',
          AlertType.error);
    } finally {
      setState(() {
        isLoadingMeterTypes = false; // Stop loading
      });
    }
  }

  @override
  void initState() {
    super.initState();
    fetchDiscoNames(); // Fetch disco names when the screen initializes
  }

// Validate transaction pin
  Future<void> _validateTransactionPin(String pin) async {
    final url =
        Uri.parse('https://app.mikirudata.com.ng/api/auth/validate-pin');

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
          _submitBillPayment(); // Proceed with electric bill payment
        } else {
          // Error response from server
          _showAlert("Invalid Pin", data['message'], AlertType.error);
        }
      } else {
        _showAlert("Failed", "Pin validation failed. Please try again.",
            AlertType.error);
      }
    } catch (e) {
      _showAlert("Error", "Error: $e", AlertType.error);
    }
  }

// Function to handle electric bill submission
  Future<void> _submitBillPayment() async {
    final url =
        Uri.parse('https://app.mikirudata.com.ng/api/electricbill/purchase');

    // Retrieve the token from SharedPreferences
    final prefs = await SharedPreferences.getInstance();
    final token = prefs.getString('auth_token');

    // Check if required fields are selected and valid
    if (selectedDisco == null ||
        selectedMeterType == null ||
        meterNumberController.text.isEmpty) {
      _showAlert("Error", "Please complete all the fields.", AlertType.error);
      return;
    }

    // Construct the request payload
    // Construct the request payload
    final requestBody = {
      'discoId': selectedDisco!, // Use selectedDisco directly
      'meter_number': meterNumberController.text,
      'meter_type': selectedMeterType,
      'amount': amountController.text,
      'requestId': 'Bill_${DateTime.now().millisecondsSinceEpoch}',
      'identifier_number': meterNumberController.text,
    };

    // Debug prints to check the payload
    print('Request Payload: $requestBody');

    try {
      // Make the HTTP POST request
      final response = await https.post(
        url,
        headers: {
          'Authorization': token != null ? 'Bearer $token' : '',
          'Content-Type': 'application/json',
        },
        body: json.encode(requestBody),
      );

      // Debug prints to check the response
      print('Response Status: ${response.statusCode}');
      print('Response Body: ${response.body}');

      if (response.statusCode == 200) {
        // Handle successful response
        final responseData = json.decode(response.body);
        final amount =
            responseData['amount']; // Extract the amount paid from response
        final meterNumber = meterNumberController.text;

        _showAlert(
          "Success",
          "Bill payment successful!\n\n"
              "Meter Number: $meterNumber\n"
              "Amount: NGN $amount",
          AlertType.success,
        );
      } else {
        // Handle error response
        final responseData = json.decode(response.body);
        final errorMessage = responseData['message'] ??
            'Failed to process bill payment. Please try again later.';

        print('Failed to process bill payment. Response: ${response.body}');
        _showAlert(
          "Payment Failed",
          errorMessage,
          AlertType.error,
        );
      }
    } catch (error) {
      // Handle any exceptions
      print('Error occurred during bill payment: $error');
      _showAlert(
        "Error",
        "An error occurred while processing your bill payment. Please try again.",
        AlertType.error,
      );
    }
  }

  void _showTransactionPinDialog() {
    Alert(
      context: context,
      type: AlertType.none,
      title: "Confirm Payment",
      content: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          SizedBox(height: 10),
          Text(
            "You are about to pay for an electricity bill with the following details:\n"
            "Disco: $selectedDisco\n"
            "Meter Type: $selectedMeterType\n"
            "Meter Number: ${meterNumberController.text}\n"
            "Amount: NGN ${amountController.text}.",
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

// Show an alert dialog
  void _showAlert(String title, String message, AlertType type) {
    Alert(
      context: context,
      type: type,
      title: title,
      desc: message,
      buttons: [
        DialogButton(
          child: Text(
            "OK",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
          onPressed: () => Navigator.pop(context),
          width: 120,
        )
      ],
    ).show();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'MIKIRUDATA', // Updated AppBar title
          style: TextStyle(
            color: Colors.white,
            fontSize: 20,
            fontWeight: FontWeight.bold,
          ),
        ),
        backgroundColor: Colors.blue[900],
        centerTitle: true,
        leading: IconButton(
          icon: Icon(Icons.arrow_back, color: Colors.white),
          onPressed: () {
            Navigator.pop(context); // Navigate back to the previous route
          },
        ),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            // Heading Text
            Center(
              child: Text(
                'Electric Bill Payment', // Screen name heading
                style: TextStyle(
                  color: Colors.blue[900],
                  fontSize: 24,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
            SizedBox(height: 20),

            // Disco Dropdown
            DropdownButtonFormField<String>(
              decoration: InputDecoration(
                labelText: 'Select Disco',
                labelStyle: TextStyle(color: Colors.blue[900]),
                border: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(8),
                  borderSide: BorderSide(
                    color: Colors.blue[900]!,
                    width: 2,
                  ),
                ),
                focusedBorder: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(8),
                  borderSide: BorderSide(
                    color: Colors.blue[900]!,
                    width: 2,
                  ),
                ),
                enabledBorder: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(8),
                  borderSide: BorderSide(
                    color: Colors.blue[900]!,
                    width: 2,
                  ),
                ),
              ),
              value: selectedDisco,
              icon: Icon(
                Icons.arrow_drop_down,
                color: Colors.blue[900],
              ),
              style: TextStyle(color: Colors.blue[900]),
              items: discoNames.map<DropdownMenuItem<String>>((disco) {
                return DropdownMenuItem<String>(
                  value: disco['discoId'].toString(),
                  child: Text(disco['name']),
                );
              }).toList(),
              onChanged: (String? value) {
                setState(() {
                  selectedDisco = value ?? '';
                  fetchMeterTypes(value!);
                });
              },
              validator: (value) {
                if (value == null || value.isEmpty) {
                  return 'Please select a Disco';
                }
                return null;
              },
            ),
            SizedBox(height: 16),

            // Meter Type Dropdown
            isLoadingMeterTypes
                ? Center(child: CircularProgressIndicator())
                : DropdownButtonFormField<String>(
                    decoration: InputDecoration(
                      labelText: 'Select Meter Type',
                      labelStyle: TextStyle(color: Colors.blue[900]),
                      border: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(8),
                        borderSide: BorderSide(
                          color: Colors.blue[900]!,
                          width: 2,
                        ),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(8),
                        borderSide: BorderSide(
                          color: Colors.blue[900]!,
                          width: 2,
                        ),
                      ),
                      enabledBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(8),
                        borderSide: BorderSide(
                          color: Colors.blue[900]!,
                          width: 2,
                        ),
                      ),
                    ),
                    value: selectedMeterType,
                    icon: Icon(
                      Icons.arrow_drop_down,
                      color: Colors.blue[900],
                    ),
                    style: TextStyle(color: Colors.blue[900]),
                    items: meterTypes.map<DropdownMenuItem<String>>((meter) {
                      return DropdownMenuItem<String>(
                        value: meter['id'].toString(),
                        child: Text(meter['name']),
                      );
                    }).toList(),
                    onChanged: (String? value) {
                      setState(() {
                        selectedMeterType = value ?? '';
                      });
                    },
                    validator: (value) {
                      if (value == null || value.isEmpty) {
                        return 'Please select a Meter Type';
                      }
                      return null;
                    },
                  ),
            SizedBox(height: 16),

            // Meter Number Input
            TextFormField(
              controller: meterNumberController,
              decoration: InputDecoration(
                labelText: 'Enter Meter Number',
                labelStyle: TextStyle(color: Colors.blue[900]),
                border: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(8),
                  borderSide: BorderSide(
                    color: Colors.blue[900]!,
                    width: 2,
                  ),
                ),
                focusedBorder: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(8),
                  borderSide: BorderSide(
                    color: Colors.blue[900]!,
                    width: 2,
                  ),
                ),
                enabledBorder: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(8),
                  borderSide: BorderSide(
                    color: Colors.blue[900]!,
                    width: 2,
                  ),
                ),
              ),
              keyboardType: TextInputType.number,
              validator: (value) {
                if (value == null || value.isEmpty) {
                  return 'Please enter a meter number';
                }
                return null;
              },
            ),
            SizedBox(height: 16),

            // Amount Input
            TextFormField(
              controller: amountController,
              decoration: InputDecoration(
                labelText: 'Enter Amount',
                labelStyle: TextStyle(color: Colors.blue[900]),
                border: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(8),
                  borderSide: BorderSide(
                    color: Colors.blue[900]!,
                    width: 2,
                  ),
                ),
                focusedBorder: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(8),
                  borderSide: BorderSide(
                    color: Colors.blue[900]!,
                    width: 2,
                  ),
                ),
                enabledBorder: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(8),
                  borderSide: BorderSide(
                    color: Colors.blue[900]!,
                    width: 2,
                  ),
                ),
              ),
              keyboardType: TextInputType.number,
              validator: (value) {
                if (value == null || value.isEmpty) {
                  return 'Please enter an amount';
                }
                return null;
              },
            ),
            SizedBox(height: 20),

            // Proceed Button
            Center(
              child: ElevatedButton(
                onPressed: () async {
                  if (_formKey.currentState?.validate() ?? false) {
                    _showTransactionPinDialog();
                  }
                },
                child: Text(
                  'Proceed',
                  style: TextStyle(color: Colors.white),
                ),
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
