import 'package:flutter/material.dart';
import 'package:syncfusion_flutter_datagrid/datagrid.dart';
import 'package:http/http.dart' as https;
import 'dart:convert';
import 'package:shared_preferences/shared_preferences.dart';
import 'transaction_detail_screen.dart'; // Import the detail screen

class TransactionScreen extends StatefulWidget {
  @override
  _TransactionScreenState createState() => _TransactionScreenState();
}

class _TransactionScreenState extends State<TransactionScreen> {
  late TransactionDataSource transactionDataSource;
  bool isLoading = true;
  bool hasError = false;

  @override
  void initState() {
    super.initState();
    fetchTransactions();
  }

  Future<String?> getAuthToken() async {
    final SharedPreferences prefs = await SharedPreferences.getInstance();
    return prefs.getString('auth_token');
  }

  Future<void> fetchTransactions() async {
    final String? token = await getAuthToken();
    if (token == null) {
      // Handle token absence, possibly redirect to login
      setState(() {
        hasError = true;
        isLoading = false;
      });
      return;
    }

    try {
      final response = await https.get(
        Uri.parse(
            'https://app.mikirudata.com.ng/api/transactions/transactions'),
        headers: {'Authorization': 'Bearer $token'},
      );

      if (response.statusCode == 200) {
        List<Transaction> transactions = (json.decode(response.body) as List)
            .map((data) => Transaction.fromJson(data))
            .toList();

        setState(() {
          transactionDataSource = TransactionDataSource(transactions);
          isLoading = false;
        });
      } else {
        setState(() {
          hasError = true;
          isLoading = false;
        });
      }
    } catch (e) {
      setState(() {
        hasError = true;
        isLoading = false;
      });
    }
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
            'Transaction History',
            style: TextStyle(color: Colors.white),
          ),
        ),
        backgroundColor: Colors.blue[900],
        iconTheme: IconThemeData(color: Colors.white),
      ),
      body: Stack(
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
          ),
          Padding(
            padding: const EdgeInsets.all(16.0),
            child: isLoading
                ? Center(child: CircularProgressIndicator())
                : hasError
                    ? Center(child: Text("Failed to load transactions"))
                    : Container(
                        decoration: BoxDecoration(
                          color: Colors.white.withOpacity(0.8),
                          borderRadius: BorderRadius.circular(15),
                          border:
                              Border.all(color: Colors.blue[900]!, width: 1),
                        ),
                        child: SfDataGrid(
                            source: transactionDataSource,
                            columns: <GridColumn>[
                              GridColumn(
                                columnName: 'dateTime',
                                label: Container(
                                  padding: EdgeInsets.all(8.0),
                                  alignment: Alignment.center,
                                  child: Text(
                                    'Date/Time',
                                    style: TextStyle(
                                      color: Colors.blue[900],
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                                width:
                                    150, // Set a fixed width for better truncation
                              ),
                              GridColumn(
                                columnName: 'service',
                                label: Container(
                                  padding: EdgeInsets.all(8.0),
                                  alignment: Alignment.center,
                                  child: Text(
                                    'Service',
                                    style: TextStyle(
                                      color: Colors.blue[900],
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                                width:
                                    120, // Set a fixed width for better truncation
                              ),
                              GridColumn(
                                columnName: 'identifierNumber',
                                label: Container(
                                  padding: EdgeInsets.all(8.0),
                                  alignment: Alignment.center,
                                  child: Text(
                                    'Identifier',
                                    style: TextStyle(
                                      color: Colors.blue[900],
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                              ),
                              GridColumn(
                                columnName: 'amount',
                                label: Container(
                                  padding: EdgeInsets.all(8.0),
                                  alignment: Alignment.center,
                                  child: Text(
                                    'Amount',
                                    style: TextStyle(
                                      color: Colors.blue[900],
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                                width:
                                    100, // Set a fixed width for better truncation
                              ),
                            ],
                            onCellTap: (details) {
                              if (details.rowColumnIndex.rowIndex != 0) {
                                final int selectedIndex =
                                    details.rowColumnIndex.rowIndex - 1;
                                final Transaction selectedTransaction =
                                    transactionDataSource
                                        .transactions[selectedIndex];
                                Navigator.push(
                                  context,
                                  MaterialPageRoute(
                                    builder: (context) =>
                                        TransactionDetailScreen(
                                      transaction: selectedTransaction,
                                      responseMessage: selectedTransaction
                                          .responseMessage, // Pass the responseMessage
                                    ),
                                  ),
                                );
                              }
                            }),
                      ),
          ),
        ],
      ),
    );
  }
}

class Transaction {
  final String transactionId;
  final String service;
  final double amount;
  final String identifierNumber;
  final DateTime dateTime;
  final String responseMessage; // Add responseMessage

  Transaction({
    required this.transactionId,
    required this.service,
    required this.amount,
    required this.identifierNumber,
    required this.dateTime,
    required this.responseMessage, // Include responseMessage in the constructor
  });

  factory Transaction.fromJson(Map<String, dynamic> json) {
    return Transaction(
      transactionId: json['transactionId'],
      service: json['service'],
      amount: json['amount'].toDouble(),
      identifierNumber: json['identifierNumber'],
      dateTime: DateTime.parse(json['dateTime']),
      responseMessage: json['responseMessage'], // Parse responseMessage
    );
  }
}

class TransactionDataSource extends DataGridSource {
  List<DataGridRow> _transactions = [];
  List<Transaction> transactions;

  TransactionDataSource(this.transactions) {
    _transactions = transactions.map<DataGridRow>((transaction) {
      return DataGridRow(cells: [
        DataGridCell<String>(
            columnName: 'dateTime', value: transaction.dateTime.toString()),
        DataGridCell<String>(columnName: 'service', value: transaction.service),
        DataGridCell<String>(
            columnName: 'identifierNumber',
            value: transaction.identifierNumber),
        DataGridCell<double>(columnName: 'amount', value: transaction.amount),
      ]);
    }).toList();
  }

  @override
  List<DataGridRow> get rows => _transactions;

  @override
  DataGridRowAdapter buildRow(DataGridRow row) {
    return DataGridRowAdapter(
      cells: row.getCells().map<Widget>((dataGridCell) {
        return Container(
          alignment: Alignment.center,
          padding: EdgeInsets.symmetric(horizontal: 8.0),
          child: Text(
            dataGridCell.value.toString(),
            style: TextStyle(color: Colors.blue[900]),
          ),
        );
      }).toList(),
    );
  }
}
