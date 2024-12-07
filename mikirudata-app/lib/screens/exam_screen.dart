import 'package:flutter/material.dart';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'package:pdf/pdf.dart';
import 'package:pdf/widgets.dart' as pw;
import 'package:printing/printing.dart';
import 'dart:convert'; // For JSON encoding/decoding
import 'package:http/http.dart' as https; // For making API requests
import 'package:shared_preferences/shared_preferences.dart'; // For shared preferences
import 'package:flutter/services.dart';

class ExamScreen extends StatefulWidget {
  @override
  _ExamScreenState createState() => _ExamScreenState();
}

class _ExamScreenState extends State<ExamScreen> {
  String? selectedExamId;
  double price = 0.0;
  TextEditingController quantityController = TextEditingController();
  TextEditingController pinController = TextEditingController();
  double amount = 0.0;

  List<Map<String, dynamic>> examData = [];

  @override
  void initState() {
    super.initState();
    _fetchExamProviders();
  }

  Future<void> _fetchExamProviders() async {
    final response = await https
        .get(Uri.parse('https://app.mikirudata.com.ng/api/exams/exams'));

    if (response.statusCode == 200) {
      List<dynamic> data = jsonDecode(response.body);
      setState(() {
        examData = data
            .map((item) => {
                  'name': item['name'],
                  'price': double.parse(
                      item['amount'].toString()), // Parsing price from amount
                  'id': item['examId'].toString() // Ensure examId is a string
                })
            .toList();
      });
    } else {
      _showCustomAlert('Failed to fetch exam providers.');
    }
  }

  void _onExamNameChanged(String? newValue) {
    setState(() {
      selectedExamId = examData.firstWhere((exam) => exam['name'] == newValue,
          orElse: () => {'id': null})['id'] as String?;
      // Find the price for the selected exam
      var selectedExam = examData.firstWhere((exam) => exam['name'] == newValue,
          orElse: () => {'price': 0.0});
      price = selectedExam['price'];
      _calculateAmount();
    });
  }

  void _calculateAmount() {
    int quantity = int.tryParse(quantityController.text) ?? 0;
    if (quantity > 5) {
      _showCustomAlert('Quantity cannot exceed 5.');
      quantityController.text = '5'; // Limit quantity to 5
      quantity = 5;
    }
    setState(() {
      amount = quantity * price;
    });
  }

  void _onProceed() {
    // Check if the user has selected an exam
    if (selectedExamId == null) {
      _showCustomAlert('Please select an exam.');
      return;
    }

    // Check if the quantity is provided and is a positive number
    if (quantityController.text.isEmpty ||
        int.tryParse(quantityController.text) == null ||
        int.parse(quantityController.text) <= 0) {
      _showCustomAlert('Please enter a valid quantity.');
      return;
    }

    // Proceed to show the PIN dialog
    _showTransactionPinDialog();
  }

  void _showTransactionPinDialog() {
    Alert(
      context: context,
      type: AlertType.none,
      title: "ENTER TRANSACTION PIN TO PURCHASE TOKEN",
      content: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          SizedBox(height: 10),
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

      if (response.statusCode == 200) {
        final data = json.decode(response.body);
        if (data['success']) {
          // If PIN is valid, proceed with the exam purchase
          _submitExamPurchase();
        } else {
          _showCustomAlert('Invalid Pin: ${data['message']}');
        }
      } else {
        _showCustomAlert('Pin validation failed. Please try again.');
      }
    } catch (e) {
      _showCustomAlert('Error: $e');
    }
  }

  Future<void> _submitExamPurchase() async {
    final url = Uri.parse('https://app.mikirudata.com.ng/api/exams/purchase');

    final prefs = await SharedPreferences.getInstance();
    final token = prefs.getString('auth_token');

    try {
      final response = await https.post(
        url,
        headers: {
          'Authorization': token != null ? 'Bearer $token' : '',
          'Content-Type': 'application/json',
        },
        body: jsonEncode({
          'examId': selectedExamId,
          'quantity': quantityController.text,
        }),
      );

      if (response.statusCode == 200) {
        final data = json.decode(response.body);

        // Extract the relevant information
        final quantity = data['quantity'];
        final message = data['message'];
        final examTokens = data['pin'];

        // Pass the extracted data to the success dialog
        _showSuccessDialog(quantity, message, examTokens);
      } else {
        final errorData = json.decode(response.body);
        final errorMessage =
            errorData['message'] ?? 'An unexpected error occurred';
        _showFailedDialog(
            errorMessage); // Pass the server message to the failed dialog
      }
    } catch (e) {
      _showFailedDialog('Error: $e'); // Use the server message for errors
    }
  }

  void _showSuccessDialog(int quantity, String message, String examTokens) {
    // Split the examTokens into individual tokens
    final tokens = examTokens.split('<=>');

    // Create a formatted string of tokens
    final tokensDisplay = tokens.map((token) => 'Token: $token').join('\n');

    Alert(
      context: context,
      type: AlertType.success,
      title: 'Success',
      desc: 'Exam purchase successful!\n\n'
          'Quantity: $quantity\n'
          'Message: $message\n\n'
          '$tokensDisplay',
      buttons: [
        DialogButton(
          child: Text(
            'OK',
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
          onPressed: () => Navigator.pop(context),
        ),
      ],
    ).show();
  }

  void _showFailedDialog(String errorMessage) {
    Alert(
      context: context,
      type: AlertType.error,
      title: 'Failed',
      desc: errorMessage,
      buttons: [
        DialogButton(
          child: Text(
            'OK',
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
          onPressed: () => Navigator.pop(context),
        ),
      ],
    ).show();
  }

  void _showCustomAlert(String message) {
    Alert(
      context: context,
      type: AlertType.error,
      title: 'Alert',
      desc: message,
      buttons: [
        DialogButton(
          child: Text(
            'OK',
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
          onPressed: () => Navigator.pop(context),
        ),
      ],
    ).show();
  }

  Future<void> _generateAndDownloadPdf() async {
    final pdf = pw.Document();
    pdf.addPage(
      pw.Page(
        build: (pw.Context context) => pw.Center(
          child: pw.Text(
              'Your Token: \n\n Exam ID: $selectedExamId\n Quantity: ${quantityController.text}\n Total Amount: ₦${amount.toStringAsFixed(2)}'),
        ),
      ),
    );

    await Printing.sharePdf(
        bytes: await pdf.save(), filename: 'exam_token.pdf');
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
        iconTheme: IconThemeData(color: Colors.white),
      ),
      body: LayoutBuilder(
        builder: (context, constraints) {
          double screenWidth = constraints.maxWidth;
          bool isLargeScreen = screenWidth > 600;
          double containerWidth =
              isLargeScreen ? screenWidth * 0.5 : screenWidth * 0.8;

          return Container(
            width: double.infinity,
            height: double.infinity,
            decoration: BoxDecoration(
              image: DecorationImage(
                image: AssetImage('assets/images/background.jpg'),
                fit: BoxFit.cover,
              ),
            ),
            child: SingleChildScrollView(
              child: Center(
                child: Container(
                  width: containerWidth,
                  padding: EdgeInsets.all(16.0),
                  decoration: BoxDecoration(
                    color: Colors.white.withOpacity(0.8),
                    borderRadius: BorderRadius.circular(10),
                  ),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Center(
                        child: Text(
                          'EXAM TOKEN',
                          style: TextStyle(
                            color: Colors.blue[900],
                            fontSize: 24,
                            fontWeight: FontWeight.bold,
                          ),
                        ),
                      ),
                      SizedBox(height: 20),
                      Text(
                        'Select Exam:',
                        style: TextStyle(
                          color: Colors.blue[900],
                          fontSize: 18,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                      DropdownButtonFormField<String>(
                        value: examData.isNotEmpty ? examData[0]['name'] : null,
                        items: examData.map<DropdownMenuItem<String>>((exam) {
                          return DropdownMenuItem<String>(
                            value: exam['name'],
                            child: Text(
                              exam['name'],
                              style: TextStyle(color: Colors.blue[900]),
                            ),
                          );
                        }).toList(),
                        onChanged: _onExamNameChanged,
                        decoration: InputDecoration(
                          border: OutlineInputBorder(
                            borderSide:
                                BorderSide(color: Colors.blue[900]!, width: 2),
                            borderRadius: BorderRadius.circular(10),
                          ),
                          focusedBorder: OutlineInputBorder(
                            borderSide:
                                BorderSide(color: Colors.blue[900]!, width: 2),
                            borderRadius: BorderRadius.circular(10),
                          ),
                          enabledBorder: OutlineInputBorder(
                            borderSide:
                                BorderSide(color: Colors.blue[900]!, width: 2),
                            borderRadius: BorderRadius.circular(10),
                          ),
                          hintText: 'Select an exam',
                          hintStyle: TextStyle(color: Colors.blue[900]),
                        ),
                      ),
                      SizedBox(height: 20),
                      Text(
                        'Quantity:',
                        style: TextStyle(
                          color: Colors.blue[900],
                          fontSize: 18,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                      TextField(
                        controller: quantityController,
                        keyboardType: TextInputType.number,
                        decoration: InputDecoration(
                          border: OutlineInputBorder(
                            borderSide:
                                BorderSide(color: Colors.blue[900]!, width: 2),
                            borderRadius: BorderRadius.circular(10),
                          ),
                          focusedBorder: OutlineInputBorder(
                            borderSide:
                                BorderSide(color: Colors.blue[900]!, width: 2),
                            borderRadius: BorderRadius.circular(10),
                          ),
                          enabledBorder: OutlineInputBorder(
                            borderSide:
                                BorderSide(color: Colors.blue[900]!, width: 2),
                            borderRadius: BorderRadius.circular(10),
                          ),
                          hintText: 'Enter quantity',
                          hintStyle: TextStyle(color: Colors.blue[900]),
                        ),
                        onChanged: (value) => _calculateAmount(),
                      ),
                      SizedBox(height: 20),
                      Center(
                        child: Container(
                          padding: EdgeInsets.all(16),
                          decoration: BoxDecoration(
                            border:
                                Border.all(color: Colors.blue[900]!, width: 2),
                            borderRadius: BorderRadius.circular(10),
                          ),
                          child: Text(
                            'Amount to Pay: ₦${amount.toStringAsFixed(2)}',
                            style: TextStyle(
                              color: Colors.blue[900],
                              fontSize: 18,
                              fontWeight: FontWeight.bold,
                            ),
                          ),
                        ),
                      ),
                      SizedBox(height: 20),
                      Center(
                        child: ElevatedButton(
                          onPressed: _onProceed,
                          style: ElevatedButton.styleFrom(
                            backgroundColor:
                                Colors.blue[900], // Button background color
                            shape: RoundedRectangleBorder(
                              borderRadius: BorderRadius.circular(
                                  10), // Button border radius
                            ),
                            padding: EdgeInsets.symmetric(
                                horizontal: 32, vertical: 12),
                          ),
                          child: Text(
                            'Proceed',
                            style: TextStyle(
                                color: Colors.white), // Button text color
                          ),
                        ),
                      ),
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
}

class CustomDropdown extends StatelessWidget {
  final String? value;
  final String hint;
  final List<String> items;
  final Function(String?) onChanged;

  CustomDropdown({
    required this.value,
    required this.hint,
    required this.items,
    required this.onChanged,
  });

  @override
  Widget build(BuildContext context) {
    return DropdownButtonFormField<String>(
      value: value,
      decoration: InputDecoration(
        border: OutlineInputBorder(),
        labelText: hint,
      ),
      items: items
          .map((item) => DropdownMenuItem<String>(
                value: item,
                child: Text(item),
              ))
          .toList(),
      onChanged: onChanged,
    );
  }
}

class CustomTextField extends StatelessWidget {
  final TextEditingController controller;
  final String hint;
  final TextInputType keyboardType;
  final Function(String) onChanged;

  CustomTextField({
    required this.controller,
    required this.hint,
    required this.keyboardType,
    required this.onChanged,
  });

  @override
  Widget build(BuildContext context) {
    return TextField(
      controller: controller,
      keyboardType: keyboardType,
      decoration: InputDecoration(
        border: OutlineInputBorder(),
        labelText: hint,
      ),
      onChanged: onChanged,
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
