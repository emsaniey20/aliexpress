import 'package:flutter/material.dart';
import 'package:http/http.dart' as https;
import 'package:rflutter_alert/rflutter_alert.dart';
import 'dart:convert';
import 'package:shared_preferences/shared_preferences.dart';

class ProfileScreen extends StatefulWidget {
  const ProfileScreen({Key? key}) : super(key: key);

  @override
  _ProfileScreenState createState() => _ProfileScreenState();
}

class _ProfileScreenState extends State<ProfileScreen> {
  String fullName = '';
  String username = '';
  String email = '';
  String phoneNumber = '';

  @override
  void initState() {
    super.initState();
    _fetchUserDetails();
  }
Widget _buildDeleteAccountOption(BuildContext context) {
  return InkWell(
    onTap: () {
      _showDeleteAccountDialog(context);
    },
    child: Container(
      decoration: BoxDecoration(
        color: Colors.white,
        borderRadius: BorderRadius.circular(10),
        border: Border.all(color: Colors.red.shade900),
      ),
      padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 12),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: <Widget>[
          Text(
            'Delete Account',
            style: TextStyle(
              fontSize: 16,
              color: Colors.red.shade900,
            ),
          ),
          Icon(
            Icons.delete,
            color: Colors.red.shade900,
          ),
        ],
      ),
    ),
  );
}

  Future<String?> _getStoredToken() async {
    final prefs = await SharedPreferences.getInstance();
    return prefs.getString('auth_token');
  }

  Future<Map<String, String>> _getAuthHeaders() async {
    final token = await _getStoredToken();
    return {
      'Authorization': token != null ? 'Bearer $token' : '', // Ensure 'Bearer ' is included
      'Content-Type': 'application/json',
    };
  }

  Future<https.Response> _getRequest(String url) async {
    final headers = await _getAuthHeaders();
    final response = await https.get(Uri.parse(url), headers: headers);

    if (response.statusCode != 200) {
      throw Exception('Failed to load data');
    }
    return response;
  }

  Future<https.Response> _postRequest(String url, dynamic body) async {
    final headers = await _getAuthHeaders();
    final response = await https.post(
      Uri.parse(url),
      headers: headers,
      body: jsonEncode(body),
    );

    if (response.statusCode != 200) {
      throw Exception('Failed to post data');
    }
    return response;
  }

  Future<void> _deleteAccount() async {
  // Show a loading indicator
  Alert(
    context: context,
    title: "Deleting Account...",
    desc: "Please wait.",
    type: AlertType.info,
    style: AlertStyle(
      isCloseButton: false,
      isButtonVisible: false,
    ),
  ).show();

  try {
    final response = await https.delete(
      Uri.parse('https://app.mikirudata.com.ng/api/user/delete-account'),
      headers: await _getAuthHeaders(),
    );

    Navigator.pop(context); // Close the loading dialog

    if (response.statusCode == 200) {
      Alert(
        context: context,
        title: "Success",
        desc: "Your account has been successfully deleted.",
        type: AlertType.success,
        buttons: [
          DialogButton(
            child: const Text(
              "OK",
              style: TextStyle(color: Colors.white, fontSize: 20),
            ),
            onPressed: () {
              Navigator.pop(context);
              // Perform any additional logout or redirection here
              Navigator.of(context).pushReplacementNamed('/login');
            },
            color: Colors.blue.shade900,
          ),
        ],
      ).show();
    } else {
      Alert(
        context: context,
        title: "Error",
        desc: "Failed to delete account. Please try again.",
        type: AlertType.error,
      ).show();
    }
  } catch (e) {
    Navigator.pop(context); // Close the loading dialog
    Alert(
      context: context,
      title: "Error",
      desc: "An unexpected error occurred.",
      type: AlertType.error,
    ).show();
  }
}

  void _showDeleteAccountDialog(BuildContext context) {
  Alert(
    context: context,
    title: "Delete Account",
    desc: "Are you sure you want to delete your account? This action cannot be undone.",
    type: AlertType.warning,
    buttons: [
      DialogButton(
        child: const Text(
          "Cancel",
          style: TextStyle(color: Colors.white, fontSize: 20),
        ),
        onPressed: () {
          Navigator.pop(context); // Close the dialog
        },
        color: Colors.grey,
      ),
      DialogButton(
        child: const Text(
          "Delete",
          style: TextStyle(color: Colors.white, fontSize: 20),
        ),
        onPressed: () async {
          Navigator.pop(context); // Close the dialog
          await _deleteAccount(); // Call the account deletion function
        },
        color: Colors.red.shade900,
      ),
    ],
  ).show();
}


  
  Future<void> _fetchUserDetails() async {
    try {
      final response = await _getRequest('https://app.mikirudata.com.ng/api/user/details');

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        setState(() {
          fullName = data['fullname'];
          username = data['username'];
          email = data['email'];
          phoneNumber = data['phone'];
        });
      } else {
        Alert(
          context: context,
          title: "Error",
          desc: "Failed to fetch user details.",
          type: AlertType.error,
        ).show();
      }
    } catch (e) {
      Alert(
        context: context,
        title: "Error",
        desc: "An unexpected error occurred.",
        type: AlertType.error,
      ).show();
    }
  }


  Future<void> _showChangeDialog(BuildContext context, String title, String apiEndpoint) async {
    final oldController = TextEditingController();
    final newController = TextEditingController();
    final confirmController = TextEditingController();

    Alert(
      context: context,
      title: title,
      content: Column(
        children: <Widget>[
          TextField(
            controller: oldController,
            obscureText: true,
            decoration: const InputDecoration(
              icon: Icon(Icons.lock),
              labelText: 'Old',
            ),
          ),
          TextField(
            controller: newController,
            obscureText: true,
            decoration: const InputDecoration(
              icon: Icon(Icons.lock_outline),
              labelText: 'New',
            ),
          ),
          TextField(
            controller: confirmController,
            obscureText: true,
            decoration: const InputDecoration(
              icon: Icon(Icons.lock_outline),
              labelText: 'Confirm',
            ),
          ),
        ],
      ),
      buttons: [
        DialogButton(
          onPressed: () async {
            final oldValue = oldController.text;
            final newValue = newController.text;
            final confirmValue = confirmController.text;

            if (oldValue.isEmpty || newValue.isEmpty || confirmValue.isEmpty) {
              Alert(
                context: context,
                title: "Error",
                desc: "All fields are required.",
                type: AlertType.error,
              ).show();
              return;
            }

            if (newValue != confirmValue) {
              Alert(
                context: context,
                title: "Error",
                desc: "New values do not match.",
                type: AlertType.error,
              ).show();
              return;
            }

            // Show loading indicator
            Alert(
              context: context,
              title: "Changing...",
              desc: "Please wait.",
              type: AlertType.info,
              style: AlertStyle(
                isCloseButton: false,
                isButtonVisible: false,
              ),
            ).show();

            try {
              final response = await _postRequest(
                'https://app.mikirudata.com.ng$apiEndpoint',
                {
                  'old_password': oldValue,
                  'new_password': newValue,
                  'confirm_new_password': confirmValue,
                },
              );

              if (response.statusCode == 200) {
                Alert(
                  context: context,
                  title: "Success",
                  desc: "Change successful.",
                  type: AlertType.success,
                ).show();
              } else {
                final responseBody = jsonDecode(response.body);
                final errorMessage = responseBody['error'] ?? 'Failed to change.';
                Alert(
                  context: context,
                  title: "Error",
                  desc: errorMessage,
                  type: AlertType.error,
                ).show();
              }
            } catch (e) {
              Alert(
                context: context,
                title: "Error",
                desc: "An unexpected error occurred.",
                type: AlertType.error,
              ).show();
            }

            Navigator.pop(context);
          },
          color: Colors.blue.shade900,
          child: const Text(
            "Change",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
        ),
      ],
    ).show();
  }

 @override
Widget build(BuildContext context) {
  return Scaffold(
    appBar: AppBar(
      title: const Text('Profile'),
      backgroundColor: Colors.blue.shade900,
      leading: IconButton(
        icon: const Icon(Icons.arrow_back),
        onPressed: () => Navigator.pop(context),
      ),
    ),
    body: Padding(
      padding: const EdgeInsets.all(16.0),
      child: Column(
        children: <Widget>[
          // Profile Picture
          Center(
            child: CircleAvatar(
              radius: 50,
              backgroundColor: Colors.grey.shade300,
              backgroundImage: const AssetImage('assets/profile_picture.png'), // Add your profile picture here
            ),
          ),
          const SizedBox(height: 16),

          // Full Name
          _buildProfileField(context, 'Full Name', fullName),
          const SizedBox(height: 16),

          // Username
          _buildProfileField(context, 'Username', username),
          const SizedBox(height: 16),

          // Email
          _buildProfileField(context, 'Email', email),
          const SizedBox(height: 16),

          // Phone Number
          _buildProfileField(context, 'Phone Number', phoneNumber),
          const SizedBox(height: 32),

          // Change Transaction Pin
          _buildChangeOption(context, 'Change Transaction Pin', () {
            _showChangeDialog(context, 'Change Transaction Pin', '/api/user/change-pin');
          }),

          const SizedBox(height: 16),

          // Change Password
          _buildChangeOption(context, 'Change Password', () {
            _showChangeDialog(context, 'Change Password', '/api/user/change-password');
          }),

          const SizedBox(height: 16),

          // Delete Account Option
          _buildDeleteAccountOption(context), // Added Delete Account Option
        ],
      ),
    ),
  );
}

  Widget _buildProfileField(BuildContext context, String label, String value) {
    return Container(
      decoration: BoxDecoration(
        color: Colors.white,
        borderRadius: BorderRadius.circular(10),
        border: Border.all(color: Colors.blue.shade900),
      ),
      padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 12),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: <Widget>[
          Text(
            label,
            style: TextStyle(
              fontSize: 16,
              color: Colors.blue.shade900,
              fontWeight: FontWeight.bold,
            ),
          ),
          Text(
            value,
            style: const TextStyle(
              fontSize: 16,
              color: Colors.black,
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildChangeOption(BuildContext context, String title, VoidCallback onTap) {
    return InkWell(
      onTap: onTap,
      child: Container(
        decoration: BoxDecoration(
          color: Colors.white,
          borderRadius: BorderRadius.circular(10),
          border: Border.all(color: Colors.blue.shade900),
        ),
        padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 12),
        child: Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: <Widget>[
            Text(
              title,
              style: TextStyle(
                fontSize: 16,
                color: Colors.blue.shade900,
              ),
            ),
            Icon(
              Icons.chevron_right,
              color: Colors.blue.shade900,
            ),
          ],
        ),
      ),
    );
  }
}

