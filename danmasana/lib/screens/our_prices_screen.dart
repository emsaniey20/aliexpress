import 'package:flutter/material.dart';
import 'package:syncfusion_flutter_datagrid/datagrid.dart';

class OurPricesScreen extends StatefulWidget {
  @override
  _OurPricesScreenState createState() => _OurPricesScreenState();
}

class _OurPricesScreenState extends State<OurPricesScreen> {
  final List<PriceData> _priceData = [
    PriceData('MTN', '500', '4G'),
    PriceData('Airtel', '1000', '9G'),
    PriceData('Glo', '200', '1G'),
    PriceData('9mobile', '1500', '3G'),
  ];

  late PriceDataSource _priceDataSource;

  @override
  void initState() {
    super.initState();
    _priceDataSource = PriceDataSource(priceData: _priceData);
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
            child: Container(
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
                        'Amount Sent',
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
                        'Amount Received',
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
