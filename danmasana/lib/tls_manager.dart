import 'package:flutter/services.dart';

class TLSManager {
  static const platform = MethodChannel('com.example.ssl/tls');

  // This method will trigger the enableTls12 function in the native code
  static Future<void> enableTls12() async {
    try {
      await platform.invokeMethod('enableTls12');
    } on PlatformException catch (e) {
      print("Failed to enable TLS 1.2: ${e.message}");
    }
  }
}
