import 'package:flutter/material.dart';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'package:go_router/go_router.dart';
import 'package:url_launcher/url_launcher.dart';  // Import this package

class Airtime2CashScreen extends StatelessWidget {
  void _showInterestAlert(BuildContext context) {
    Alert(
      context: context,
      type: AlertType.info,
      title: "Interested in Converting Airtime to Cash?",
      desc: "Click OK if you would like to message the CEO about converting your airtime to cash.",
      buttons: [
        DialogButton(
          child: Text(
            "OK",
            style: TextStyle(color: Colors.white, fontSize: 18),
          ),
          onPressed: () {
            _launchWhatsApp();
            Navigator.pop(context); // Close the alert dialog
          },
          color: Colors.blue[900],
        ),
        DialogButton(
          child: Text(
            "Cancel",
            style: TextStyle(color: Colors.white, fontSize: 18),
          ),
          onPressed: () {
            GoRouter.of(context).go('/'); // Navigate to the home screen
          },
          color: Colors.grey,
        ),
      ],
    ).show();
  }

  void _launchWhatsApp() async {
    final phoneNumber = "+2348111250431";
    final message = "Hello CEO, I would like to convert my airtime to cash.";

    final url = "https://web.whatsapp.com/send?phone=$phoneNumber&text=${Uri.encodeComponent(message)}";

    // Use the launch method from url_launcher
    if (await canLaunch(url)) {
      await launch(url);
    } else {
      throw 'Could not launch $url';
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
            'Airtime to Cash',
            style: TextStyle(color: Colors.white),
          ),
        ),
        backgroundColor: Colors.blue[900],
        iconTheme: IconThemeData(color: Colors.white),
      ),
      body: Center(
        child: ElevatedButton(
          onPressed: () => _showInterestAlert(context),
          child: Text(
            'Click Me To convert Airtime To cash',
            style: TextStyle(color: Colors.white), // Set text color to white
          ),
          style: ElevatedButton.styleFrom(
            backgroundColor: Colors.blue[900],
            padding: EdgeInsets.symmetric(horizontal: 50, vertical: 15),
            textStyle: TextStyle(fontSize: 18),
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(15),
            ),
          ),
        ),
      ),
    );
  }
}
