package com.example.myapp

import android.os.Build
import io.flutter.embedding.android.FlutterActivity
import io.flutter.plugin.common.MethodChannel
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocketFactory

class MainActivity : FlutterActivity() {
    private val CHANNEL = "com.example.ssl/tls"

    override fun configureFlutterEngine(flutterEngine: io.flutter.embedding.engine.FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)

        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
            if (call.method == "enableTls12") {
                val sslSocketFactory = enableTls12()
                result.success(null)  // Pass any necessary result back to Dart
            } else {
                result.notImplemented()
            }
        }
    }

    private fun enableTls12(): SSLSocketFactory {
        return try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                // Return default SSL Socket Factory (already supports TLS 1.2)
                SSLContext.getDefault().socketFactory
            } else {
                // Enable TLS 1.2 for older versions
                val context = SSLContext.getInstance("TLSv1.2")
                context.init(null, null, null)
                context.socketFactory
            }
        } catch (e: Exception) {
            e.printStackTrace()
            SSLContext.getDefault().socketFactory  // Fallback to default
        }
    }
}
