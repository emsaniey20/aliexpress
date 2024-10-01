import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:http/http.dart' as https; // Import http package

class WhatsAppScreen extends StatefulWidget {
  @override
  _WhatsAppScreenState createState() => _WhatsAppScreenState();
}

class _WhatsAppScreenState extends State<WhatsAppScreen> {
  List<Map<String, String>> accounts = [];
  List<Map<String, String>> groups = [];

  @override
  void initState() {
    super.initState();
    _fetchWhatsAppLinks();
  }

  Future<void> _fetchWhatsAppLinks() async {
    try {
      final response = await https.get(Uri.parse('https://app.mikirudata.com.ng/api/whatsapp'));

      if (response.statusCode == 200) {
        final data = json.decode(response.body);
        setState(() {
          accounts = List<Map<String, String>>.from(data['accounts']);
          groups = List<Map<String, String>>.from(data['groups']);
        });
      } else {
        // Handle server error
        _showError('Failed to load data');
      }
    } catch (e) {
      // Handle network error
      _showError('An error occurred: $e');
    }
  }

  void _showError(String message) {
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(content: Text(message)),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Center(
          child: Text(
            'Chat Us',
            style: TextStyle(
              color: Colors.white,
              fontWeight: FontWeight.bold,
            ),
          ),
        ),
        backgroundColor: Colors.blue[900],
      ),
      body: LayoutBuilder(
        builder: (context, constraints) {
          double widthFactor = constraints.maxWidth < 600 ? 0.8 : 0.5;

          return Center(
            child: Container(
              width: constraints.maxWidth * widthFactor,
              child: Padding(
                padding: const EdgeInsets.all(16.0),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.center,
                  children: [
                    Center(
                      child: Text(
                        'Accounts',
                        style: TextStyle(
                          fontSize: 20,
                          fontWeight: FontWeight.bold,
                          color: Colors.blue[900],
                        ),
                      ),
                    ),
                    SizedBox(height: 10),
                    ...accounts.map((account) => WhatsAppButton(
                      icon: FontAwesomeIcons.whatsappSquare,
                      label: account['label']!,
                      url: account['url']!,
                    )).toList(),
                    SizedBox(height: 30),
                    Center(
                      child: Text(
                        'Groups',
                        style: TextStyle(
                          fontSize: 20,
                          fontWeight: FontWeight.bold,
                          color: Colors.blue[900],
                        ),
                      ),
                    ),
                    SizedBox(height: 10),
                    ...groups.map((group) => WhatsAppButton(
                      icon: FontAwesomeIcons.users,
                      label: group['label']!,
                      url: group['url']!,
                    )).toList(),
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

class WhatsAppButton extends StatelessWidget {
  final IconData icon;
  final String label;
  final String url;

  const WhatsAppButton({
    required this.icon,
    required this.label,
    required this.url,
  });

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: () {
        // Open WhatsApp with the provided URL
        // Launch the URL using url_launcher package or similar
        // Here is an example:
        // launch('https://wa.me/$url');
      },
      child: Column(
        children: [
          CircleAvatar(
            radius: 30,
            backgroundColor: Colors.green[700],
            child: FaIcon(icon, color: Colors.white, size: 30),
          ),
          SizedBox(height: 8),
          Text(label),
        ],
      ),
    );
  }
}
