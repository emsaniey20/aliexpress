import 'dart:convert';
import 'package:http/http.dart' as http;
import 'package:shared_preferences/shared_preferences.dart';

class AuthService {
  static const String _baseUrl = 'https://app.mikirudata.com.ng/api/auth';
  static const String _tokenKey = 'auth_token';

  // Method to get the stored token from shared preferences
  static Future<String?> _getStoredToken() async {
    final prefs = await SharedPreferences.getInstance();
    final token = prefs.getString(_tokenKey);
    print('Retrieved token: $token'); // Debugging statement
    return token;
  }

  // Method to validate the token by making a request to the server
  static Future<bool> validateToken() async {
    final token = await _getStoredToken();
    if (token == null) {
      print('No token found.');
      return false;
    }

    try {
      final response = await http.get(
        Uri.parse('$_baseUrl/validate-token'),
        headers: {
          'Authorization': 'Bearer $token', // Ensure this format is correct
        },
      );

      if (response.statusCode == 200) {
        final data = json.decode(response.body);
        print('Token validation response: ${response.body}'); // Debugging statement
        return data['message'] == 'Token is valid';
      } else {
        print('Token validation failed with status code: ${response.statusCode}');
        print('Response body: ${response.body}'); // Debugging statement
        return false;
      }
    } catch (e) {
      print('Error validating token: $e');
      return false;
    }
  }

  // Method to check if the user is logged in
  static Future<bool> isLoggedIn() async {
    return await validateToken();
  }

  // Method to login with a generic identifier (e.g., username, email, phone)
  static Future<bool> login(String identifier, String password) async {
    try {
      final response = await http.post(
        Uri.parse('$_baseUrl/login'),
        headers: {'Content-Type': 'application/json'},
        body: json.encode({
          'identifier': identifier,
          'password': password,
        }),
      );

      if (response.statusCode == 200) {
        final data = json.decode(response.body);
        final token = data['token'];
        print('Received token: $token'); // Debugging statement

        if (token != null) {
          // Store the token securely in shared preferences
          final prefs = await SharedPreferences.getInstance();
          await prefs.setString(_tokenKey, token);
          return true;
        } else {
          print('No token received from the server.');
          return false;
        }
      } else {
        print('Login failed with status code: ${response.statusCode}');
        print('Response body: ${response.body}'); // Debugging statement
        return false;
      }
    } catch (e) {
      print('Error logging in: $e');
      return false;
    }
  }
}
