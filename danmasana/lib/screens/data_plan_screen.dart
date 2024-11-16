import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:http/http.dart' as https;
import 'dart:convert';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'package:shared_preferences/shared_preferences.dart';

class DataPlanScreen extends StatefulWidget {
  @override
  _DataPlanScreenState createState() => _DataPlanScreenState();
}

final String apiUrl = 'https://app.mikirudata.com.ng/api/ads';

class _DataPlanScreenState extends State<DataPlanScreen> {
  String? selectedNetwork;
  String? selectedDataType;
  String? selectedNetworkName; // For displaying in the dropdown

  Map<String, dynamic>? selectedDataPlan;
  TextEditingController phoneController = TextEditingController();
  TextEditingController pinController = TextEditingController();

  List<Map<String, dynamic>> networkProviders = [];
  List<String> dataTypes = [];
  List<Map<String, dynamic>> dataPlans = [];

  @override
  void initState() {
    super.initState();
    fetchNetworkProviders();
  }

  Future<void> fetchNetworkProviders() async {
    try {
      final response = await https
          .get(Uri.parse('https://app.mikirudata.com.ng/api/data/networks'));

      if (response.statusCode == 200) {
        List<dynamic> providers = json.decode(response.body);
        setState(() {
          networkProviders = providers
              .map((provider) => {
                    'name': provider['name'],
                    'id': provider['id'],
                  })
              .toList();
        });
      } else {
        _showAlert(
            "Error", "Failed to load network providers", AlertType.error);
      }
    } catch (e) {
      _showAlert("Error", "Error: $e", AlertType.error);
    }
  }

  Future<void> fetchDataTypes() async {
    if (selectedNetwork == null) return;
    try {
      final response = await https.get(Uri.parse(
          'https://app.mikirudata.com.ng/api/data/types?network=$selectedNetwork'));

      if (response.statusCode == 200) {
        List<dynamic> types = json.decode(response.body);
        setState(() {
          dataTypes = types.map((type) => type['name'] as String).toList();
          selectedDataType = null;
          selectedDataPlan = null;
          dataPlans.clear();
        });
      } else {
        _showAlert("Error", "Failed to load data types", AlertType.error);
      }
    } catch (e) {
      _showAlert("Error", "Error: $e", AlertType.error);
    }
  }

  Future<void> fetchDataPlans() async {
    if (selectedDataType == null) return;
    try {
      final response = await https.get(Uri.parse(
          'https://app.mikirudata.com.ng/api/data/plans?type=$selectedDataType'));

      if (response.statusCode == 200) {
        List<dynamic> plans = json.decode(response.body);
        setState(() {
          dataPlans = plans
              .map((plan) => {
                    'id': plan['id'], // Add this to identify the plan
                    'name': plan['name'],
                    'amount': plan['amount'],
                    'networkId': plan['networkId'], // Add networkId
                    'data_plan': plan['data_plan'], // Add data_plan
                  })
              .toList();
          selectedDataPlan = null;
        });
      } else {
        _showAlert("Error", "Failed to load data plans", AlertType.error);
      }
    } catch (e) {
      _showAlert("Error", "Error: $e", AlertType.error);
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

  void _showBottomSheet({
    required List<String> items,
    required String title,
    required Function(String) onItemSelected,
  }) {
    showModalBottomSheet(
      context: context,
      isScrollControlled: true, // Allows the bottom sheet to take up more space
      builder: (context) {
        return DraggableScrollableSheet(
          expand: false,
          builder: (context, scrollController) {
            return Center(
              child: Column(
                children: [
                  Padding(
                    padding: const EdgeInsets.all(16.0),
                    child: Text(
                      title,
                      style: TextStyle(
                        fontSize: 18,
                        fontWeight: FontWeight.bold,
                        color: Colors.blue[900],
                      ),
                    ),
                  ),
                  Divider(),
                  Expanded(
                    child: ListView.builder(
                      controller: scrollController,
                      itemCount: items.length,
                      itemBuilder: (context, index) {
                        final item = items[index];
                        return ListTile(
                          title: Center(
                            child: Text(
                              item,
                              style: TextStyle(
                                color: Colors.blue[900],
                              ),
                            ),
                          ),
                          onTap: () {
                            onItemSelected(item);
                            Navigator.pop(context);
                          },
                        );
                      },
                    ),
                  ),
                ],
              ),
            );
          },
        );
      },
    );
  }

  void _onProceed() {
    if (selectedNetwork != null &&
        selectedDataType != null &&
        selectedDataPlan != null &&
        phoneController.text.isNotEmpty) {
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
            "You want to buy '${selectedDataPlan!['name']}' for NGN ${selectedDataPlan!['amount']} for ${phoneController.text}. Validate your transaction pin to proceed.",
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

  void _showNoDataAlert(BuildContext context) {
    showDialog(
      context: context,
      builder: (BuildContext context) {
        return AlertDialog(
          title: Text(
            'No Data Available',
            style: TextStyle(
              color: Colors.blue[900],
              fontWeight: FontWeight.bold,
            ),
            textAlign: TextAlign.center,
          ),
          content: Text(
            'No data is available for the selected option. Please try again later.',
            textAlign: TextAlign.center,
          ),
          actions: [
            TextButton(
              onPressed: () {
                Navigator.of(context).pop();
              },
              child: Text(
                'OK',
                style: TextStyle(color: Colors.blue[900]),
              ),
            ),
          ],
        );
      },
    );
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
          _submitDataPlan(); // Proceed with the data plan purchase
        } else {
          // Error response from server
          print('Pin validation message: ${data['message']}');
          _showAlert("Invalid Pin", data['message'], AlertType.error);
        }
      } else {
        // Handle unexpected status codes
        _showAlert("Failed", "Pin validation failed. Please try again.",
            AlertType.error);
      }
    } catch (e) {
      _showAlert("Error", "Error: $e", AlertType.error);
    }
  }

  Future<void> _submitDataPlan() async {
    final url =
        Uri.parse('https://app.mikirudata.com.ng/api/dataplan/purchase');

    // Retrieve the token from SharedPreferences
    final prefs = await SharedPreferences.getInstance();
    final token = prefs.getString('auth_token');

    // Check if the selected data plan is valid
    if (selectedDataPlan == null) {
      _showAlert("Error", "Please select a data plan.", AlertType.error);
      return;
    }

    // Construct the request payload
    final requestBody = {
      'networkId': selectedDataPlan!['networkId'],
      'phone': phoneController.text,
      'data_plan': selectedDataPlan!['data_plan'],
      'requestId':
          'Data_${DateTime.now().millisecondsSinceEpoch}', // Example requestId
      'identifier_number':
          phoneController.text, // Phone number as the identifier
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
        final amount = responseData['amount']; // Extract amount from response
        final phone = phoneController.text;
        final dataPlanName =
            selectedDataPlan!['name']; // Extract data plan name

        _showAlert(
          "Success",
          "Data plan '$dataPlanName' purchased successfully!\n\n"
              "Phone Number: $phone\n"
              "Amount: NGN $amount",
          AlertType.success,
        );
      } else {
        // Handle error response
        final responseData = json.decode(response.body);
        final errorMessage = responseData['message'] ??
            'Failed to purchase data plan. Please try again later.';

        print('Failed to purchase data plan. Response: ${response.body}');
        _showAlert(
          "Purchase Failed",
          errorMessage,
          AlertType.error,
        );
      }
    } catch (error) {
      // Handle any exceptions
      print('Error occurred during data plan purchase: $error');
      _showAlert(
        "Error",
        "An error occurred while processing your data plan purchase. Please try again.",
        AlertType.error,
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
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
          double containerWidth =
              isLargeScreen ? screenWidth * 0.5 : screenWidth * 0.9;

          return Center(
            child: Container(
              width: containerWidth,
              child: SingleChildScrollView(
                child: Padding(
                  padding: const EdgeInsets.all(16.0),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Center(
                        child: Text(
                          'DATA PLAN',
                          style: TextStyle(
                            color: Colors.blue[900],
                            fontSize: 24,
                            fontWeight: FontWeight.bold,
                          ),
                        ),
                      ),
                      SizedBox(height: 20),
                      GestureDetector(
                        onTap: () async {
                          // Show loading indicator
                          showDialog(
                            context: context,
                            barrierDismissible: false,
                            builder: (context) =>
                                Center(child: CircularProgressIndicator()),
                          );

                          // Fetch network providers
                          await fetchNetworkProviders();

                          // Close loading indicator
                          Navigator.pop(context);

                          // Show bottom sheet only if data is available
                          if (networkProviders.isNotEmpty) {
                            _showBottomSheet(
                              items: networkProviders
                                  .map((provider) => provider['name'] as String)
                                  .toList(),
                              title: 'Select Network Provider',
                              onItemSelected: (newValue) {
                                setState(() {
                                  final selectedProvider =
                                      networkProviders.firstWhere(
                                    (provider) => provider['name'] == newValue,
                                    orElse: () => {'id': null, 'name': null},
                                  );
                                  selectedNetwork =
                                      selectedProvider['id']?.toString();
                                  selectedNetworkName =
                                      selectedProvider['name'];
                                  selectedDataType = null;
                                  selectedDataPlan = null;
                                });
                                fetchDataTypes();
                              },
                            );
                          } else {
                            _showNoDataAlert('No network providers available.'
                                as BuildContext);
                          }
                        },
                        child: _buildDropdownContainer(
                          text: selectedNetworkName ??
                              networkProviders.firstWhere(
                                  (provider) =>
                                      provider['id'] == selectedNetwork,
                                  orElse: () => {
                                        'name': 'Select Network Provider'
                                      })['name'] as String,
                        ),
                      ),
                      SizedBox(height: 20),
                      GestureDetector(
                        onTap: () async {
                          if (selectedNetwork == null) {
                            _showNoDataAlert('Please select a network provider.'
                                as BuildContext);
                            return;
                          }

                          // Show loading indicator
                          showDialog(
                            context: context,
                            barrierDismissible: false,
                            builder: (context) =>
                                Center(child: CircularProgressIndicator()),
                          );

                          // Fetch data types
                          await fetchDataTypes();

                          // Close loading indicator
                          Navigator.pop(context);

                          // Show bottom sheet only if data is available
                          if (dataTypes.isNotEmpty) {
                            _showBottomSheet(
                              items: dataTypes,
                              title: 'Select Data Type',
                              onItemSelected: (newValue) {
                                setState(() {
                                  selectedDataType = newValue;
                                });
                                fetchDataPlans();
                              },
                            );
                          } else {
                            _showNoDataAlert(
                                'No data types available.' as BuildContext);
                          }
                        },
                        child: _buildDropdownContainer(
                          text: selectedDataType ?? 'Select Data Type',
                        ),
                      ),
                      SizedBox(height: 20),
                      GestureDetector(
                        onTap: () async {
                          if (selectedDataType == null) {
                            _showNoDataAlert(
                                'Please select a data type.' as BuildContext);
                            return;
                          }

                          // Show loading indicator
                          showDialog(
                            context: context,
                            barrierDismissible: false,
                            builder: (context) =>
                                Center(child: CircularProgressIndicator()),
                          );

                          // Fetch data plans
                          await fetchDataPlans();

                          // Close loading indicator
                          Navigator.pop(context);

                          // Show bottom sheet only if data is available
                          if (dataPlans.isNotEmpty) {
                            _showBottomSheet(
                              items: dataPlans
                                  .map((plan) =>
                                      '${plan['name']} - NGN ${plan['amount']}')
                                  .toList(),
                              title: 'Select Data Plan',
                              onItemSelected: (newValue) {
                                setState(() {
                                  selectedDataPlan = dataPlans.firstWhere(
                                    (plan) =>
                                        '${plan['name']} - NGN ${plan['amount']}' ==
                                        newValue,
                                  );
                                });
                              },
                            );
                          } else {
                            _showNoDataAlert(
                                'No data plans available.' as BuildContext);
                          }
                        },
                        child: _buildDropdownContainer(
                          text: selectedDataPlan != null
                              ? '${selectedDataPlan!['name']} - NGN ${selectedDataPlan!['amount']}'
                              : 'Select Data Plan',
                        ),
                      ),
                      SizedBox(height: 20),
                      Row(
                        children: [
                          Expanded(
                            child: TextField(
                              controller: phoneController,
                              keyboardType: TextInputType.phone,
                              decoration: InputDecoration(
                                hintText: 'Enter Mobile Number',
                                hintStyle: TextStyle(color: Colors.blue[900]),
                                border: OutlineInputBorder(
                                  borderRadius: BorderRadius.circular(8.0),
                                  borderSide:
                                      BorderSide(color: Colors.blue[900]!),
                                ),
                                enabledBorder: OutlineInputBorder(
                                  borderRadius: BorderRadius.circular(8.0),
                                  borderSide:
                                      BorderSide(color: Colors.blue[900]!),
                                ),
                                focusedBorder: OutlineInputBorder(
                                  borderRadius: BorderRadius.circular(8.0),
                                  borderSide: BorderSide(
                                      color: Colors.blue[900]!, width: 2.0),
                                ),
                              ),
                            ),
                          ),
                        ],
                      ),
                      SizedBox(height: 20),
                      Center(
                        // Wrap ElevatedButton with Center
                        child: ElevatedButton(
                          onPressed: _onProceed,
                          child: Text('Proceed',
                              style: TextStyle(color: Colors.white)),
                          style: ElevatedButton.styleFrom(
                            backgroundColor: Colors.blue[900],
                            padding: EdgeInsets.symmetric(
                                horizontal: 40, vertical: 15),
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
            ),
          );
        },
      ),
    );
  }
}

Widget _buildDropdownContainer({required String text}) {
  return Container(
    width: double.infinity,
    padding: EdgeInsets.symmetric(vertical: 20, horizontal: 10),
    decoration: BoxDecoration(
      border: Border.all(color: Colors.blue[900]!),
      borderRadius: BorderRadius.circular(8.0),
    ),
    child: Text(
      text,
      style: TextStyle(color: Colors.blue[900]),
      textAlign: TextAlign.left,
    ),
  );
}

class CustomDropdown extends StatelessWidget {
  final String? value;
  final String hint;
  final List<String> items;
  final ValueChanged<String?> onChanged;

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
      hint: Text(
        hint,
        style: TextStyle(color: Colors.blue[900]), // Dropdown hint text color
      ),
      decoration: InputDecoration(
        border: OutlineInputBorder(
          borderRadius: BorderRadius.circular(8.0), // Rounded border radius
          borderSide: BorderSide(color: Colors.blue[900]!), // Border color
        ),
        enabledBorder: OutlineInputBorder(
          borderRadius: BorderRadius.circular(8.0),
          borderSide:
              BorderSide(color: Colors.blue[900]!), // Border color when enabled
        ),
        focusedBorder: OutlineInputBorder(
          borderRadius: BorderRadius.circular(8.0),
          borderSide: BorderSide(
              color: Colors.blue[900]!,
              width: 2.0), // Border color when focused
        ),
        contentPadding: EdgeInsets.symmetric(horizontal: 10.0, vertical: 15.0),
      ),
      isExpanded: true,
      iconEnabledColor: Colors.blue[900], // Dropdown arrow color
      style: TextStyle(
          color: Colors.blue[900]), // Dropdown selected item text color
      dropdownColor: Colors.white, // Background color of the dropdown container
      items: items.map((String item) {
        return DropdownMenuItem<String>(
          value: item,
          child: Container(
            width: double
                .infinity, // Ensures the dropdown item width is the same as the dropdown button
            child: Text(item),
          ),
        );
      }).toList(),
      onChanged: onChanged,
      isDense: true, // Ensures the dropdown opens below the input field
      alignment: Alignment.centerLeft, // Aligns the dropdown text to the left
      menuMaxHeight: 250, // Maximum height of the dropdown menu
      itemHeight: 60, // Height of each item
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
