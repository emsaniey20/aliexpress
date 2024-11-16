import 'package:flutter/material.dart';
import 'package:syncfusion_flutter_datagrid/datagrid.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

class OurPricesScreen extends StatefulWidget {
  @override
  _OurPricesScreenState createState() => _OurPricesScreenState();
}

class _OurPricesScreenState extends State<OurPricesScreen> {
  List<PriceData> _priceData = [];
  late PriceDataSource _priceDataSource;

  @override
  void initState() {
    super.initState();
    _fetchPrices(); // Fetch data when the screen initializes
  }

  Future<void> _fetchPrices() async {
    final response = await http.get(Uri.parse('http://app.mikirudata.com.ng/api/get/data-plans'));

    if (response.statusCode == 200) {
      final data = json.decode(response.body);
      final List<PriceData> fetchedPrices = [];

      for (var item in data['data']) {
        fetchedPrices.add(PriceData(
          item['name'],             // Ensure this matches the API response structure
          item['amount'].toString(), // Ensure it's a string
          item['dataTypeName'],      // Ensure this matches the API response structure
        ));
      }

      setState(() {
        _priceData = fetchedPrices;
        _priceDataSource = PriceDataSource(priceData: _priceData);
      });
    } else {
      throw Exception('Failed to load prices');
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
            'Prices',
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
            child: LayoutBuilder(
              builder: (context, constraints) {
                // Set width to 90% for small screens, 50% for larger screens
                double tableWidth = constraints.maxWidth < 600 ? constraints.maxWidth * 0.9 : constraints.maxWidth * 0.5;

                return Center(
                  child: Container(
                    width: tableWidth,
                    decoration: BoxDecoration(
                      color: Colors.white.withOpacity(0.8),
                      borderRadius: BorderRadius.circular(15),
                      border: Border.all(color: Colors.blue[900]!, width: 1),
                    ),
                    child: SfDataGrid(
                      source: _priceDataSource,
                      columns: <GridColumn>[
                        GridColumn(
                          columnName: 'network',
                          label: Container(
                            padding: EdgeInsets.all(8),
                            alignment: Alignment.center,
                            child: Text(
                              'Network',
                              style: TextStyle(
                                fontSize: 16,
                                fontWeight: FontWeight.bold,
                                color: Colors.blue[900],
                              ),
                            ),
                          ),
                        ),
                        GridColumn(
                          columnName: 'amountSent',
                          label: Container(
                            padding: EdgeInsets.all(8),
                            alignment: Alignment.center,
                            child: Text(
                              'Amount',
                              style: TextStyle(
                                fontSize: 16,
                                fontWeight: FontWeight.bold,
                                color: Colors.blue[900],
                              ),
                            ),
                          ),
                        ),
                        GridColumn(
                          columnName: 'amountReceived',
                          label: Container(
                            padding: EdgeInsets.all(8),
                            alignment: Alignment.center,
                            child: Text(
                              'Data Type',
                              style: TextStyle(
                                fontSize: 16,
                                fontWeight: FontWeight.bold,
                                color: Colors.blue[900],
                              ),
                            ),
                          ),
                        ),
                      ],
                    ),
                  ),
                );
              },
            ),
          ),
        ],
      ),
    );
  }
}

class PriceData {
  PriceData(this.network, this.amountSent, this.amountReceived);

  final String network;
  final String amountSent;
  final String amountReceived;
}

class PriceDataSource extends DataGridSource {
  PriceDataSource({required List<PriceData> priceData}) {
    _priceData = priceData
        .map<DataGridRow>((data) => DataGridRow(cells: [
              DataGridCell<String>(columnName: 'network', value: data.network),
              DataGridCell<String>(columnName: 'amountSent', value: data.amountSent),
              DataGridCell<String>(columnName: 'amountReceived', value: data.amountReceived),
            ]))
        .toList();
  }

  List<DataGridRow> _priceData = [];

  @override
  List<DataGridRow> get rows => _priceData;

  @override
  DataGridRowAdapter buildRow(DataGridRow row) {
    return DataGridRowAdapter(
      cells: row.getCells().map<Widget>((cell) {
        return Container(
          alignment: Alignment.center,
          padding: EdgeInsets.all(8),
          child: Text(
            cell.value.toString(),
            style: TextStyle(
              color: Colors.blue[900],
            ),
          ),
        );
      }).toList(),
    );
  }
}
