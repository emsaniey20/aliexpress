import 'package:flutter/material.dart';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'package:http/http.dart' as https;
import 'dart:convert';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:fluro/fluro.dart'; // Import Fluro

class LoginScreen extends StatefulWidget {
  final FluroRouter router; // Add router parameter

  const LoginScreen({Key? key, required this.router}) : super(key: key);

  @override
  _LoginScreenState createState() => _LoginScreenState();
}

class _LoginScreenState extends State<LoginScreen> {
  final TextEditingController _identifierController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();
  bool _isLoading = false;

  @override
  void dispose() {
    _identifierController.dispose();
    _passwordController.dispose();
    super.dispose();
  }

  Future<void> _login(BuildContext context) async {
    if (_identifierController.text.isEmpty || _passwordController.text.isEmpty) {
      _showFailureAlert(context, "Fields are empty", "Please fill in all fields.");
      return;
    }

    setState(() {
      _isLoading = true;
    });

    try {
      final response = await https.post(
        Uri.parse('https://app.mikirudata.com.ng/api/auth/login'),
        headers: {'Content-Type': 'application/json'},
        body: jsonEncode({
          'identifier': _identifierController.text,
          'password': _passwordController.text,
        }),
      );

      setState(() {
        _isLoading = false;
      });

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);

        if (data.containsKey('token')) {
          // Save token and navigate to the home screen
          await _saveToken(data['token']);
          widget.router.navigateTo(context, '/', clearStack: true); // Clear stack to prevent back navigation
        } else {
          _showFailureAlert(context, "Login Failed", "Invalid Email/Username or password.");
        }
      } else {
        _showFailureAlert(context, "Login Failed", "Invalid Email/Username or password.");
      }
    } catch (e) {
      setState(() {
        _isLoading = false;
      });
      _showFailureAlert(context, "Network Error", "Please check your connection and try again.");
    }
  }

  Future<void> _saveToken(String token) async {
    final prefs = await SharedPreferences.getInstance();
    await prefs.setString('auth_token', token);
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text(
          "Login",
          style: TextStyle(color: Colors.white),
        ),
        centerTitle: true,
        backgroundColor: Colors.blue[900],
      ),
      body: LayoutBuilder(
        builder: (context, constraints) {
          double contentWidth = constraints.maxWidth * 0.9; // 90% for mobile
          if (constraints.maxWidth > 600) {
            contentWidth = constraints.maxWidth * 0.5; // 50% for larger screens
          }

          return SingleChildScrollView(
            child: Center(
              child: Container(
                margin: const EdgeInsets.all(24),
                width: contentWidth,
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    const SizedBox(height: 60),
                    _header(),
                    const SizedBox(height: 30),
                    _inputField(),
                    _forgotPassword(context),
                    _signup(context),
                  ],
                ),
              ),
            ),
          );
        },
      ),
    );
  }

  Widget _header() {
    return const Column(
      children: [
        Text(
          "Welcome Back",
          style: TextStyle(fontSize: 40, fontWeight: FontWeight.bold),
        ),
        Text("Enter your credentials to login"),
      ],
    );
  }

  Widget _inputField() {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.stretch,
      children: [
        TextField(
          controller: _identifierController,
          decoration: InputDecoration(
            hintText: "Email/Username",
            border: OutlineInputBorder(
              borderRadius: BorderRadius.circular(18),
              borderSide: BorderSide.none,
            ),
            fillColor: Colors.blue[900]!.withOpacity(0.1),
            filled: true,
            prefixIcon: const Icon(Icons.person),
          ),
        ),
        const SizedBox(height: 16),
        TextField(
          controller: _passwordController,
          decoration: InputDecoration(
            hintText: "Password",
            border: OutlineInputBorder(
              borderRadius: BorderRadius.circular(18),
              borderSide: BorderSide.none,
            ),
            fillColor: Colors.blue[900]!.withOpacity(0.1),
            filled: true,
            prefixIcon: const Icon(Icons.lock),
          ),
          obscureText: true,
        ),
        const SizedBox(height: 24),
        ElevatedButton(
          onPressed: _isLoading ? null : () => _login(context),
          style: ElevatedButton.styleFrom(
            shape: const StadiumBorder(),
            padding: const EdgeInsets.symmetric(vertical: 16),
            backgroundColor: Colors.blue[900],
          ),
          child: _isLoading
              ? const CircularProgressIndicator(
                  valueColor: AlwaysStoppedAnimation<Color>(Colors.white),
                )
              : const Text(
                  "Login",
                  style: TextStyle(fontSize: 20, color: Colors.white),
                ),
        ),
      ],
    );
  }

  Widget _forgotPassword(BuildContext context) {
    return TextButton(
      onPressed: () {
        widget.router.navigateTo(context, '/auth/forget/password'); // Navigate to forgot password page
      },
      child: Text(
        "Forgot password?",
        style: TextStyle(color: Colors.blue[900]),
      ),
    );
  }

  Widget _signup(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        const Text("Don't have an account? "),
        TextButton(
          onPressed: () {
            widget.router.navigateTo(context, '/auth/register'); // Navigate to the registration screen
          },
          child: Text(
            "Sign Up",
            style: TextStyle(color: Colors.blue[900]),
          ),
        ),
      ],
    );
  }

  void _showFailureAlert(BuildContext context, String title, String description) {
    Alert(
      context: context,
      type: AlertType.error,
      title: title,
      desc: description,
      style: AlertStyle(
        titleStyle: TextStyle(
          color: Colors.red[700],
          fontWeight: FontWeight.bold,
          fontSize: 24,
        ),
      ),
      buttons: [
        DialogButton(
          child: const Text(
            "Retry",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
          onPressed: () => Navigator.pop(context),
          width: 120,
          color: Colors.red[700],
        ),
      ],
    ).show();
  }
}
