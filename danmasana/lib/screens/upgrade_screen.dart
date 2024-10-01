import 'package:flutter/material.dart';


class UpgradeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Upgrade'),
      ),
      body: Center(
        child: Text(
          'Coming Soon',
          style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
        ),
      ),
    );
  }
}
