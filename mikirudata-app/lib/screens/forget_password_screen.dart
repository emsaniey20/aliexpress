import 'package:flutter/material.dart';
import 'package:http/http.dart' as https;
import 'package:rflutter_alert/rflutter_alert.dart';
import 'dart:convert';

class ForgotPasswordScreen extends StatefulWidget {
  const ForgotPasswordScreen({super.key});

  @override
  _ForgotPasswordScreenState createState() => _ForgotPasswordScreenState();
}

class _ForgotPasswordScreenState extends State<ForgotPasswordScreen> {
  final _formKey = GlobalKey<FormState>();
  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _codeController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();
  final TextEditingController _confirmPasswordController = TextEditingController();

  bool _isLoading = false;
  bool _isCodeSent = false;
  bool _isCodeVerified = false;

  Future<void> _sendCode() async {
    if (_formKey.currentState!.validate()) {
      setState(() {
        _isLoading = true;
      });

      final String apiUrl = 'https://app.mikirudata.com.ng/api/auth/forgot-password';
      final Map<String, dynamic> data = {'email': _emailController.text};

      try {
        final response = await https.post(
          Uri.parse(apiUrl),
          headers: {'Content-Type': 'application/json'},
          body: jsonEncode(data),
        );

        if (response.statusCode == 200) {
          setState(() {
            _isCodeSent = true;
          });
          _showAlert(context, "Success", "6-digit code sent to your email.", AlertType.success);
        } else {
          _showAlert(context, "Error", "Failed to send code. Please try again.", AlertType.error);
        }
      } catch (e) {
        _showAlert(context, "Error", "An error occurred. Please try again.", AlertType.error);
      } finally {
        setState(() {
          _isLoading = false;
        });
      }
    }
  }

  Future<void> _verifyCode() async {
    if (_codeController.text.isNotEmpty) {
      setState(() {
        _isLoading = true;
      });

      final String apiUrl = 'https://app.mikirudata.com.ng/api/auth/verify-code';
      final Map<String, dynamic> data = {
        'email': _emailController.text,
        'code': _codeController.text,
      };

      try {
        final response = await https.post(
          Uri.parse(apiUrl),
          headers: {'Content-Type': 'application/json'},
          body: jsonEncode(data),
        );

        if (response.statusCode == 200) {
          setState(() {
            _isCodeVerified = true;
          });
        } else {
          _showAlert(context, "Error", "Invalid code. Please try again.", AlertType.error);
        }
      } catch (e) {
        _showAlert(context, "Error", "An error occurred. Please try again.", AlertType.error);
      } finally {
        setState(() {
          _isLoading = false;
        });
      }
    }
  }

  Future<void> _resetPassword() async {
    if (_formKey.currentState!.validate()) {
      setState(() {
        _isLoading = true;
      });

      final String apiUrl = 'https://app.mikirudata.com.ng/api/auth/reset-password';
      final Map<String, dynamic> data = {
        'email': _emailController.text,
        'code': _codeController.text,
        'password': _passwordController.text,
      };

      try {
        final response = await https.post(
          Uri.parse(apiUrl),
          headers: {'Content-Type': 'application/json'},
          body: jsonEncode(data),
        );

        if (response.statusCode == 200) {
          _showAlert(context, "Success", "Password has been reset.", AlertType.success);
          Navigator.pop(context);
        } else {
          _showAlert(context, "Error", "Failed to reset password. Please try again.", AlertType.error);
        }
      } catch (e) {
        _showAlert(context, "Error", "An error occurred. Please try again.", AlertType.error);
      } finally {
        setState(() {
          _isLoading = false;
        });
      }
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
        backgroundColor: Colors.blue[900],
        title: const Text('Forgot Password', style: TextStyle(color: Colors.white)),
        centerTitle: true,
      ),
      body: SingleChildScrollView(
        child: Padding(
          padding: const EdgeInsets.all(24.0),
          child: Form(
            key: _formKey,
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                const Text(
                  "Recover your password",
                  style: TextStyle(
                    fontSize: 24,
                    fontWeight: FontWeight.bold,
                    color: Colors.blue,
                  ),
                  textAlign: TextAlign.center,
                ),
                const SizedBox(height: 24),
                _buildEmailField(),
                const SizedBox(height: 16),
                _isCodeSent ? _buildCodeField() : const SizedBox.shrink(),
                const SizedBox(height: 16),
                _isCodeVerified ? _buildPasswordFields() : const SizedBox.shrink(),
                const SizedBox(height: 24),
                ElevatedButton(
                  onPressed: _isLoading
                      ? null
                      : _isCodeSent
                          ? _isCodeVerified
                              ? _resetPassword
                              : _verifyCode
                          : _sendCode,
                  style: ElevatedButton.styleFrom(
                    padding: const EdgeInsets.symmetric(vertical: 16),
                    backgroundColor: Colors.blue[900],
                  ),
                  child: _isLoading
                      ? const CircularProgressIndicator(color: Colors.white)
                      : Text(
                          _isCodeSent
                              ? _isCodeVerified
                                  ? "Reset Password"
                                  : "Verify Code"
                              : "Send Code",
                          style: const TextStyle(fontSize: 20, color: Colors.white),
                        ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }

  Widget _buildEmailField() {
    return TextFormField(
      controller: _emailController,
      decoration: InputDecoration(
        labelText: "Email Address",
        prefixIcon: const Icon(Icons.email),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
      ),
      keyboardType: TextInputType.emailAddress,
      validator: (value) {
        if (value == null || value.isEmpty) {
          return 'Please enter your email address';
        }
        if (!RegExp(r'^[^@]+@[^@]+\.[^@]+').hasMatch(value)) {
          return 'Please enter a valid email address';
        }
        return null;
      },
    );
  }

  Widget _buildCodeField() {
    return TextFormField(
      controller: _codeController,
      decoration: InputDecoration(
        labelText: "Enter 6-Digit Code",
        prefixIcon: const Icon(Icons.lock),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
      ),
      keyboardType: TextInputType.number,
      validator: (value) {
        if (value == null || value.isEmpty) {
          return 'Please enter the 6-digit code';
        }
        if (value.length != 6) {
          return 'The code must be 6 digits';
        }
        return null;
      },
    );
  }

  Widget _buildPasswordFields() {
    return Column(
      children: [
        TextFormField(
          controller: _passwordController,
          decoration: InputDecoration(
            labelText: "New Password",
            prefixIcon: const Icon(Icons.lock),
            border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
          ),
          obscureText: true,
          validator: (value) {
            if (value == null || value.isEmpty) {
              return 'Please enter your new password';
            }
            if (value.length < 6) {
              return 'Password must be at least 6 characters';
            }
            return null;
          },
        ),
        const SizedBox(height: 16),
        TextFormField(
          controller: _confirmPasswordController,
          decoration: InputDecoration(
            labelText: "Confirm New Password",
            prefixIcon: const Icon(Icons.lock),
            border: OutlineInputBorder(borderRadius: BorderRadius.circular(18)),
          ),
          obscureText: true,
          validator: (value) {
            if (value == null || value.isEmpty) {
              return 'Please confirm your new password';
            }
            if (value != _passwordController.text) {
              return 'Passwords do not match';
            }
            return null;
          },
        ),
      ],
    );
  }

  void _showAlert(BuildContext context, String title, String desc, AlertType alertType) {
    Alert(
      context: context,
      type: alertType,
      title: title,
      desc: desc,
      buttons: [
        DialogButton(
          child: const Text(
            "OK",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
          onPressed: () => Navigator.pop(context),
          width: 120,
        ),
      ],
    ).show();
  }
}
