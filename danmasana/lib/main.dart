import 'package:flutter/material.dart';
import 'package:fluro/fluro.dart';
import 'screens/home_screen.dart';
import 'screens/funding_screen.dart';
import 'screens/upgrade_screen.dart';
import 'screens/history_screen.dart';
import 'screens/our_prices_screen.dart';
import 'screens/data_plan_screen.dart';
import 'screens/airtime_screen.dart';
import 'screens/tv_cable_screen.dart';
import 'screens/exam_screen.dart';
import 'screens/electric_bill_screen.dart';
import 'screens/bulk_sms_screen.dart';
import 'screens/airtime_2_cash.dart';
import 'screens/announcement_screen.dart';
import 'screens/whatsapp_screen.dart';
import 'screens/login_screen.dart';
import 'screens/forget_password_screen.dart';
import 'screens/register_screen.dart';
import 'screens/profile_screen.dart';
import 'services/auth_service.dart'; // Import AuthService

// Initialize the router
final FluroRouter router = FluroRouter();

// Define the route handlers
void defineRoutes(FluroRouter router) {
  // Define public routes
  router.define('/auth/login', handler: Handler(
    handlerFunc: (context, parameters) => LoginScreen(router: router),
  ));

  router.define('/auth/forget/password', handler: Handler(
    handlerFunc: (context, parameters) => ForgotPasswordScreen(),
  ));

  router.define('/auth/register', handler: Handler(
    handlerFunc: (context, parameters) => RegisterScreen(router: router),
  ));

  // Define protected routes
  router.define('/', handler: Handler( // Set HomeScreen as default route
    handlerFunc: (context, parameters) => HomeScreen(router: router),
  ));

  router.define('/notification', handler: Handler(
    handlerFunc: (context, parameters) => NotificationScreen(),
  ));

  router.define('/funding', handler: Handler(
    handlerFunc: (context, parameters) => FundScreen(),
  ));

  router.define('/upgrade', handler: Handler(
    handlerFunc: (context, parameters) => UpgradeScreen(),
  ));

  router.define('/history', handler: Handler(
    handlerFunc: (context, parameters) => TransactionScreen(),
  ));

  router.define('/our-prices', handler: Handler(
    handlerFunc: (context, parameters) => OurPricesScreen(),
  ));

  router.define('/data-plan', handler: Handler(
    handlerFunc: (context, parameters) => DataPlanScreen(),
  ));

  router.define('/airtime', handler: Handler(
    handlerFunc: (context, parameters) => AirtimeScreen(),
  ));

  router.define('/tv-cable', handler: Handler(
    handlerFunc: (context, parameters) => TVCableScreen(),
  ));

  router.define('/exam', handler: Handler(
    handlerFunc: (context, parameters) => ExamScreen(),
  ));

  router.define('/electric-bill', handler: Handler(
    handlerFunc: (context, parameters) => ElectricBillScreen(),
  ));

  router.define('/profile', handler: Handler(
    handlerFunc: (context, parameters) => ProfileScreen(),
  ));

  router.define('/bulk-sms', handler: Handler(
    handlerFunc: (context, parameters) => BulkSmsScreen(),
  ));

  router.define('/airtime-2-cash', handler: Handler(
    handlerFunc: (context, parameters) => Airtime2CashScreen(),
  ));

  router.define('/announcement', handler: Handler(
    handlerFunc: (context, parameters) => NotificationScreen(),
  ));

  router.define('/whatsapp', handler: Handler(
    handlerFunc: (context, parameters) => WhatsAppScreen(),
  ));
}

void main() {
  defineRoutes(router); // Define routes here
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'MIKIRUDATA Best VTU Services',
      onGenerateRoute: router.generator,
      home: FutureBuilder<bool>(
        future: AuthService.isLoggedIn(),
        builder: (context, snapshot) {
          if (snapshot.connectionState == ConnectionState.waiting) {
            return const Center(child: CircularProgressIndicator());
          } else if (snapshot.hasData && snapshot.data == true) {
            return HomeScreen(router: router); // User is logged in, show HomeScreen
          } else {
            return LoginScreen(router: router); // User is not logged in, show LoginScreen
          }
        },
      ),
    );
  }
}
