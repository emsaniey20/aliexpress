import 'package:flutter/material.dart';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'package:http/http.dart' as https;
import 'dart:convert';

class NotificationScreen extends StatefulWidget {
  @override
  _NotificationScreenState createState() => _NotificationScreenState();
}

class _NotificationScreenState extends State<NotificationScreen> {
  List<Map<String, dynamic>> announcements = []; // Changed to dynamic
  bool isLoading = true;

  @override
  void initState() {
    super.initState();
    fetchAnnouncements();
  }

  Future<void> fetchAnnouncements() async {
    try {
      final response = await https.get(Uri.parse('https://app.mikirudata.com.ng/api/messages/announcement'));
      if (response.statusCode == 200) {
        List<dynamic> data = json.decode(response.body);
        setState(() {
          announcements = data.cast<Map<String, dynamic>>(); // Cast to dynamic
          isLoading = false;
        });
      } else {
        setState(() {
          isLoading = false;
        });
        showAlert('Error', 'Failed to load announcements.');
      }
    } catch (e) {
      setState(() {
        isLoading = false;
      });
      showAlert('Error', 'An error occurred while fetching announcements.');
    }
  }

  void showAlert(String title, String message) {
    Alert(
      context: context,
      content: Column(
        children: [
          Center(
            child: Text(
              title,
              style: TextStyle(
                color: Colors.blue[900],
                fontWeight: FontWeight.bold,
              ),
            ),
          ),
          SizedBox(height: 10),
          Text(message),
        ],
      ),
      buttons: [
        DialogButton(
          child: Text(
            "CLOSE",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
          onPressed: () => Navigator.pop(context),
          color: Colors.blue[900],
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
            'Announcements',
            style: TextStyle(
              color: Colors.white,
              fontWeight: FontWeight.bold,
            ),
          ),
        ),
        backgroundColor: Colors.blue[900],
        actions: [
          IconButton(
            icon: Icon(Icons.notifications),
            onPressed: () {
              // Optionally, add functionality here
            },
          ),
        ],
      ),
      body: isLoading
          ? Center(child: CircularProgressIndicator())
          : LayoutBuilder(
              builder: (context, constraints) {
                double widthFactor = constraints.maxWidth < 600 ? 0.8 : 0.5;

                return Center(
                  child: Container(
                    width: constraints.maxWidth * widthFactor,
                    child: ListView.builder(
                      itemCount: announcements.length,
                      itemBuilder: (context, index) {
                        final announcement = announcements[index];
                        return ListTile(
                          leading: Icon(Icons.notifications, color: Colors.blue),
                          title: Text(
                            announcement['title'] ?? '',
                            style: TextStyle(
                              color: Colors.blue[900],
                              fontWeight: FontWeight.bold,
                            ),
                          ),
                          subtitle: Text(
                            announcement['message'] ?? '',
                            maxLines: 1,
                            overflow: TextOverflow.ellipsis,
                            style: TextStyle(
                              color: Colors.blue[900],
                            ),
                          ),
                          contentPadding: EdgeInsets.all(16.0),
                          onTap: () {
                            Alert(
                              context: context,
                              content: Column(
                                crossAxisAlignment: CrossAxisAlignment.start,
                                children: [
                                  Center(
                                    child: Text(
                                      announcement['title'] ?? '',
                                      style: TextStyle(
                                        color: Colors.blue[900],
                                        fontWeight: FontWeight.bold,
                                      ),
                                    ),
                                  ),
                                  SizedBox(height: 10),
                                  Text(announcement['message'] ?? ''),
                                ],
                              ),
                              buttons: [
                                DialogButton(
                                  child: Text(
                                    "CLOSE",
                                    style: TextStyle(color: Colors.white, fontSize: 20),
                                  ),
                                  onPressed: () => Navigator.pop(context),
                                  color: Colors.blue[900],
                                ),
                              ],
                            ).show();
                          },
                        );
                      },
                    ),
                  ),
                );
              },
            ),
    );
  }
}
