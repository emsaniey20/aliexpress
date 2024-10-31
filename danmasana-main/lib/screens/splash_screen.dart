import 'package:flutter/material.dart';
import 'dart:async';
import 'package:fluro/fluro.dart'; // Importing Fluro router

class SplashScreen extends StatefulWidget {
  final FluroRouter router;

  // Constructor to accept the router
  SplashScreen({required this.router});

  @override
  _SplashScreenState createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
  @override
  void initState() {
    super.initState();

    // Simulate a delay for the splash screen (e.g., 3 seconds)
    Timer(Duration(seconds: 3), () {
      // Navigate using FluroRouter instead of MaterialPageRoute
      widget.router.navigateTo(context, '/home', replace: true);
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          // Background image
          Positioned.fill(
            child: Image.asset(
              'assets/images/background.jpg', // Replace with your background image path
              fit: BoxFit.cover,
            ),
          ),
          Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Image.asset(
                  'assets/images/imk.png', 
                  width: 150, 
                  height: 150, 
                  fit: BoxFit.cover,
                ), // Your app logo
                SizedBox(height: 20),
                Text(
                  'Welcome to Mikirudata', // The text you want to display
                  style: TextStyle(
                    fontSize: 28,
                    color: Colors.white,
                    fontWeight: FontWeight.bold,
                  ),
                  textAlign: TextAlign.center,
                ),
              ],
            ),
          ),
          Positioned(
            bottom: 30,
            left: 0,
            right: 0,
            child: Center(
              child: CircularProgressIndicator(
                valueColor: AlwaysStoppedAnimation<Color>(Colors.white), // Progress indicator color
              ),
            ),
          ),
        ],
      ),
    );
  }
}
