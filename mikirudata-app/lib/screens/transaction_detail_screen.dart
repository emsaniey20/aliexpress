import 'package:flutter/material.dart';
import 'package:flutter/services.dart'; // Import this for rootBundle
import 'package:pdf/pdf.dart';
import 'package:pdf/widgets.dart' as pw;
import 'package:printing/printing.dart';
import 'history_screen.dart'; // Import the transaction model

class TransactionDetailScreen extends StatelessWidget {
  final Transaction transaction;
  final String responseMessage; // Add this line

  TransactionDetailScreen({
    required this.transaction,
    required this.responseMessage, // Add this parameter
  });

  @override
  Widget build(BuildContext context) {
    // Determine screen width and set dynamic width
    double screenWidth = MediaQuery.of(context).size.width;
    double containerWidth =
        screenWidth < 600 ? screenWidth * 0.8 : screenWidth * 0.5;

    return Scaffold(
      appBar: AppBar(
        title: Text('Transaction Details'),
        backgroundColor: Colors.blue[900],
      ),
      body: Stack(
        children: [
          // Background image
          Positioned.fill(
            child: Image.asset(
              'assets/images/background.jpg', // Replace with your background image path
              fit: BoxFit.cover,
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(16.0),
            child: Container(
              constraints: BoxConstraints
                  .expand(), // Make sure the container takes up the full height
              child: Column(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                  Column(
                    crossAxisAlignment: CrossAxisAlignment.center,
                    children: [
                      Image.asset(
                        'assets/images/imk.png', // Replace with your app logo
                        height: 100,
                      ),
                      SizedBox(height: 20),

                      // New container for API response
                      Center(
                        child: Container(
                          width: containerWidth,
                          height: 200,
                          decoration: BoxDecoration(
                            color: Colors.white.withOpacity(0.8),
                            borderRadius: BorderRadius.circular(20),
                            boxShadow: [
                              BoxShadow(
                                color: Colors.grey.withOpacity(0.5),
                                spreadRadius: 5,
                                blurRadius: 7,
                                offset: Offset(0, 3),
                              ),
                            ],
                          ),
                          padding: const EdgeInsets.all(16.0),
                          child: Column(
                            mainAxisAlignment: MainAxisAlignment.center,
                            crossAxisAlignment: CrossAxisAlignment.center,
                            children: [
                              Text(
                                'API RESPONSE',
                                style: TextStyle(
                                  fontSize: 18,
                                  fontWeight: FontWeight.bold,
                                  letterSpacing: 2,
                                  color: Colors.blue[900],
                                ),
                              ),
                              SizedBox(height: 10),
                              Text(
                                responseMessage, // Display the response message
                                style: TextStyle(
                                  fontSize: 16,
                                  color: Colors.blue[900],
                                ),
                                textAlign: TextAlign.center,
                              ),
                            ],
                          ),
                        ),
                      ),

                      SizedBox(height: 20),
                      Text(
                        'Transaction ID: ${transaction.transactionId}',
                        style: TextStyle(
                          fontSize: 18,
                          fontWeight: FontWeight.bold,
                          color: Colors.blue[900],
                        ),
                        textAlign: TextAlign.center,
                      ),
                      SizedBox(height: 10),
                      Text(
                        'Date: ${transaction.dateTime.toLocal().toString()}',
                        style: TextStyle(fontSize: 16, color: Colors.blue[900]),
                        textAlign: TextAlign.center,
                      ),
                      SizedBox(height: 10),
                      Text(
                        'Service: ${transaction.service}',
                        style: TextStyle(fontSize: 16, color: Colors.blue[900]),
                        textAlign: TextAlign.center,
                      ),
                      SizedBox(height: 10),
                      Text(
                        'Identifier: ${transaction.identifierNumber}',
                        style: TextStyle(fontSize: 16, color: Colors.blue[900]),
                        textAlign: TextAlign.center,
                      ),
                      SizedBox(height: 10),
                      Text(
                        'Amount: ${transaction.amount.toStringAsFixed(2)}',
                        style: TextStyle(fontSize: 16, color: Colors.blue[900]),
                        textAlign: TextAlign.center,
                      ),
                    ],
                  ),
                  ElevatedButton.icon(
                    onPressed: () async {
                      try {
                        await _generateAndSavePdf(context);
                      } catch (e) {
                        // Handle error
                        print("Error generating PDF: $e");
                        ScaffoldMessenger.of(context).showSnackBar(
                          SnackBar(content: Text('Failed to generate PDF')),
                        );
                      }
                    },
                    icon: Icon(Icons.download,
                        color: Colors.white), // Set icon color to white
                    label: Text(
                      'Download PDF',
                      style: TextStyle(
                          color: Colors.white), // Set text color to white
                    ),
                    style: ElevatedButton.styleFrom(
                      backgroundColor:
                          Colors.blue[900], // Set button color to blue[900]
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

  Future<void> _generateAndSavePdf(BuildContext context) async {
    final pdf = pw.Document();

    // Load the custom fonts
    final robotoRegular =
        pw.Font.ttf(await rootBundle.load('assets/fonts/Roboto-Regular.ttf'));
    final robotoBold =
        pw.Font.ttf(await rootBundle.load('assets/fonts/Roboto-Bold.ttf'));

    final image = pw.MemoryImage(
      (await rootBundle.load('assets/images/imk.png')).buffer.asUint8List(),
    );

    pdf.addPage(
      pw.Page(
        build: (pw.Context context) {
          return pw.Center(
            child: pw.Column(
              crossAxisAlignment: pw.CrossAxisAlignment.center,
              children: [
                pw.Image(image, height: 100),
                pw.SizedBox(height: 20),
                pw.Text(
                  'Transaction ID: ${transaction.transactionId}',
                  style: pw.TextStyle(
                    fontSize: 18,
                    fontWeight: pw.FontWeight.bold,
                    font: robotoBold,
                    color: PdfColors.blue900,
                  ),
                  textAlign: pw.TextAlign.center,
                ),
                pw.SizedBox(height: 10),
                pw.Text(
                  'Date: ${transaction.dateTime.toLocal().toString()}',
                  style: pw.TextStyle(
                    fontSize: 16,
                    font: robotoRegular,
                    color: PdfColors.blue900,
                  ),
                  textAlign: pw.TextAlign.center,
                ),
                pw.SizedBox(height: 10),
                pw.Text(
                  'Service: ${transaction.service}',
                  style: pw.TextStyle(
                    fontSize: 16,
                    font: robotoRegular,
                    color: PdfColors.blue900,
                  ),
                  textAlign: pw.TextAlign.center,
                ),
                pw.SizedBox(height: 10),
                pw.Text(
                  'Identifier: ${transaction.identifierNumber}',
                  style: pw.TextStyle(
                    fontSize: 16,
                    font: robotoRegular,
                    color: PdfColors.blue900,
                  ),
                  textAlign: pw.TextAlign.center,
                ),
                pw.SizedBox(height: 10),
                pw.Text(
                  'Amount: ${transaction.amount.toStringAsFixed(2)}',
                  style: pw.TextStyle(
                    fontSize: 16,
                    font: robotoRegular,
                    color: PdfColors.blue900,
                  ),
                  textAlign: pw.TextAlign.center,
                ),
                pw.SizedBox(height: 20),

                // Boxed container for the response message
                pw.Container(
                  width: double.infinity,
                  padding: pw.EdgeInsets.all(10),
                  decoration: pw.BoxDecoration(
                    border: pw.Border.all(color: PdfColors.blue900, width: 1.5),
                    borderRadius: pw.BorderRadius.circular(10),
                  ),
                  child: pw.Column(
                    children: [
                      pw.Text(
                        'API RESPONSE',
                        style: pw.TextStyle(
                          fontSize: 16,
                          fontWeight: pw.FontWeight.bold,
                          color: PdfColors.blue900,
                        ),
                        textAlign: pw.TextAlign.center,
                      ),
                      pw.SizedBox(height: 10),
                      pw.Text(
                        responseMessage,
                        style: pw.TextStyle(
                          fontSize: 14,
                          font: robotoRegular,
                          color: PdfColors.black,
                        ),
                        textAlign: pw.TextAlign.center,
                      ),
                    ],
                  ),
                ),
              ],
            ),
          );
        },
      ),
    );

    // Save the PDF and open it in the system PDF viewer
    await Printing.sharePdf(
      bytes: await pdf.save(),
      filename: 'transaction_${transaction.transactionId}.pdf',
    );
  }
}
