import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:rflutter_alert/rflutter_alert.dart';
import 'dart:async';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'dart:convert';
import 'package:http/http.dart' as https;
import 'package:shared_preferences/shared_preferences.dart';
import 'package:url_launcher/url_launcher.dart';
import 'package:fluro/fluro.dart';

class HomeScreen extends StatelessWidget {
  final FluroRouter router; // Router for navigation
  final int unreadMessages = 5;

  // Constructor to initialize the router
  HomeScreen({required this.router});

  // Method to get authentication headers
  Future<Map<String, String>> getAuthHeaders() async {
    final prefs = await SharedPreferences.getInstance();
    final token = prefs.getString('auth_token');
    return {
      'Authorization': token != null ? 'Bearer $token' : '',
      'Content-Type': 'application/json',
    };
  }

  // Method to perform GET request
  Future<https.Response> getRequest(String url) async {
    final headers = await getAuthHeaders();
    return https.get(Uri.parse(url), headers: headers);
  }

  // Method to perform POST request
  Future<https.Response> postRequest(String url, dynamic body) async {
    final headers = await getAuthHeaders();
    return https.post(Uri.parse(url), headers: headers, body: jsonEncode(body));
  }

  // Method to log out the user
  Future<https.Response> logout() async {
    final headers = await getAuthHeaders();
    return https.post(
      Uri.parse('https://app.mikirudata.com.ng/api/auth/logout'),
      headers: headers,
    );
  }

  // Fetch user data from API
  Future<Map<String, dynamic>> _fetchUserData() async {
    try {
      final response =
          await getRequest('https://app.mikirudata.com.ng/api/user/details');

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);

        if (data is! Map<String, dynamic> ||
            !data.containsKey('wallet_balance') ||
            !data.containsKey('username')) {
          throw Exception('Invalid API response format');
        }

        final walletBalance = data['wallet_balance'];
        final username = data['username'];

        return {
          'wallet_balance': walletBalance.toDouble(),
          'username': username,
        };
      } else {
        throw Exception('Failed to fetch user data: ${response.statusCode}');
      }
    } catch (e) {
      print('Error fetching user data: $e');
      return {'wallet_balance': 0.0, 'username': 'Failed'};
    }
  }

  @override
  Widget build(BuildContext context) {
    // Display announcement on screen load
    WidgetsBinding.instance.addPostFrameCallback((_) {
      _showAnnouncement(context);
    });
    final double screenWidth = MediaQuery.of(context).size.width;
    final bool isMobile = screenWidth < 600;
    final double containerWidth =
        isMobile ? screenWidth * 0.9 : screenWidth * 0.5;

    return Scaffold(
      appBar: AppBar(
        title: Row(
          children: [
            WavingHandIcon(),
            const SizedBox(width: 10),
            FutureBuilder<Map<String, dynamic>>(
              future: _fetchUserData(),
              builder: (context, snapshot) {
                if (snapshot.connectionState == ConnectionState.waiting) {
                  return const Text('Loading...');
                } else if (snapshot.hasError) {
                  return const Text('Error fetching user data');
                } else if (snapshot.hasData && snapshot.data != null) {
                  final userData = snapshot.data!;
                  return Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(
                        "Hi, ${userData['username']}!",
                        style: const TextStyle(
                          fontSize: 20,
                          color: Colors.white,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                      Text(
                        "Balance: \₦${userData['wallet_balance'].toStringAsFixed(2)}",
                        style: const TextStyle(
                          fontSize: 16,
                          color: Colors.white,
                        ),
                      ),
                    ],
                  );
                } else {
                  return const Text('No user data');
                }
              },
            ),
          ],
        ),
        backgroundColor: Colors.blue[900],
        actions: [
          Stack(
            children: [
              IconButton(
                icon: const Icon(Icons.notifications, color: Colors.white),
                onPressed: () {
                  print("Navigating to notification");
                  router.navigateTo(context, '/notification');
                },
              ),
              if (unreadMessages > 0)
                Positioned(
                  right: 11,
                  top: 11,
                  child: Container(
                    padding: const EdgeInsets.all(2),
                    decoration: BoxDecoration(
                      color: Colors.red,
                      borderRadius: BorderRadius.circular(10),
                    ),
                    constraints: const BoxConstraints(
                      minWidth: 16,
                      minHeight: 16,
                    ),
                    child: Center(
                      child: Text(
                        '$unreadMessages',
                        style: const TextStyle(
                          color: Colors.white,
                          fontSize: 12,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ),
                  ),
                ),
            ],
          ),
          PopupMenuButton<String>(
            icon: const Icon(Icons.person, color: Colors.white),
            onSelected: (String value) async {
              print("Selected: $value");
              if (value == 'profile') {
                print("Navigating to profile");
                router.navigateTo(context, '/profile');
              } else if (value == 'logout') {
                final response = await logout();
                if (response.statusCode == 200) {
                  final prefs = await SharedPreferences.getInstance();
                  await prefs.remove('auth_token');
                  print("Navigating to login");
                  router.navigateTo(context, '/auth/login');
                } else {
                  Alert(
                    context: context,
                    type: AlertType.error,
                    title: "Logout Failed",
                    desc: "Unable to logout. Please try again.",
                    buttons: [
                      DialogButton(
                        child: const Text(
                          "OK",
                          style: TextStyle(color: Colors.white, fontSize: 20),
                        ),
                        onPressed: () => Navigator.pop(context),
                        width: 120,
                      )
                    ],
                  ).show();
                }
              }
            },
            itemBuilder: (BuildContext context) {
              return [
                const PopupMenuItem<String>(
                  value: 'profile',
                  child: Text('Profile'),
                ),
                const PopupMenuItem<String>(
                  value: 'logout',
                  child: Text('Logout'),
                ),
              ];
            },
          ),
        ],
      ),
      body: RefreshIndicator(
        onRefresh: _fetchUserData,
        child: Stack(
          children: [
            FutureBuilder<Map<String, dynamic>>(
              future: _fetchUserData(),
              builder: (context, snapshot) {
                if (snapshot.connectionState == ConnectionState.waiting) {
                  return const Center(child: CircularProgressIndicator());
                } else if (snapshot.hasError) {
                  return Center(
                      child:
                          Text('Error fetching user data: ${snapshot.error}'));
                } else if (snapshot.hasData && snapshot.data != null) {
                  final userData = snapshot.data!;
                  final wallet = Wallet(
                    name: userData['username'],
                    balance: userData['wallet_balance'],
                    bonus: 0.0, // Or use appropriate value if available
                  );

                  return SingleChildScrollView(
                    child: Column(
                      children: [
                        Center(
                          child: Container(
                            height: 220,
                            margin: const EdgeInsets.all(12),
                            decoration: BoxDecoration(
                              color: Colors.blue[900],
                              borderRadius: BorderRadius.circular(24),
                              boxShadow: [
                                BoxShadow(
                                  color: Colors.grey.withOpacity(0.5),
                                  spreadRadius: 5,
                                  blurRadius: 7,
                                  offset: const Offset(0, 3),
                                ),
                              ],
                            ),
                            width: containerWidth,
                            child: WalletCard(
                                wallet: wallet,
                                walletBalance: userData['wallet_balance']),
                          ),
                        ),
                        const SizedBox(height: 20),
                        AnimatedTextContainer(),
                        const SizedBox(height: 20),
                        ServiceIconsCard(
                            router: router), // Pass the router here
                        const SizedBox(height: 20),
                        ServiceCardsRow(router: router), // Pass the router here
                      ],
                    ),
                  );
                } else {
                  return const Center(child: Text('No wallet data available'));
                }
              },
            ),
            Positioned(
              bottom: 20,
              right: 20,
              child: FloatingActionButton(
                onPressed: () {
                  _launchWhatsApp();
                },
                child: const FaIcon(
                  FontAwesomeIcons.whatsapp,
                  color: Colors.white,
                ),
                backgroundColor: Colors.green,
              ),
            ),
          ],
        ),
      ),
    );
  }
}

void _launchWhatsApp() async {
  final phoneNumber = '+2348111250431';
  final message = Uri.encodeComponent('Hello mikirudata CEO');
  final url = Uri.parse('https://wa.me/$phoneNumber?text=$message');

  // Check if the URL can be launched
  if (await canLaunchUrl(url)) {
    await launchUrl(url);
  } else {
    print('Could not launch $url');
  }
}

bool hasShownAnnouncement =
    false; // Global or shared state to track if the announcement has been shown

// Method to fetch announcement with token in header
Future<String> fetchAnnouncement() async {
  // Fetch the token from SharedPreferences
  final prefs = await SharedPreferences.getInstance();
  final token = prefs.getString('auth_token');

  // Prepare the headers with the token
  final headers = {
    'Authorization': 'Bearer $token',
    'Content-Type': 'application/json',
  };

  // Make the GET request with headers
  final response = await https.get(
    Uri.parse('https://app.mikirudata.com.ng/api/messages/welcome-message1'),
    headers: headers,
  );

  // Handle the response
  if (response.statusCode == 200) {
    final jsonResponse = json.decode(response.body);
    return jsonResponse['message'];
  } else {
    throw Exception('Failed to load announcement: ${response.statusCode}');
  }
}

void _showAnnouncement(BuildContext context) async {
  // Ensure the announcement is shown only once
  if (hasShownAnnouncement) {
    return;
  }

  try {
    String message = await fetchAnnouncement();

    // Show the dialog only if the announcement hasn't been shown before
    Alert(
      context: context,
      type: AlertType.info,
      title: "Announcement",
      desc: message,
      buttons: [
        DialogButton(
          child: const Text(
            "OK",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
          onPressed: () {
            Navigator.pop(context);
            hasShownAnnouncement =
                true; // Set the flag after the dialog is closed
          },
          width: 120,
        )
      ],
    ).show();
  } catch (e) {
    Alert(
      context: context,
      type: AlertType.error,
      title: "Error",
      desc: "Failed to load announcement",
      buttons: [
        DialogButton(
          child: const Text(
            "OK",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
          onPressed: () => Navigator.pop(context),
          width: 120,
        )
      ],
    ).show();
  }
}

// A widget for a waving hand icon
class WavingHandIcon extends StatefulWidget {
  @override
  _WavingHandIconState createState() => _WavingHandIconState();
}

class _WavingHandIconState extends State<WavingHandIcon>
    with SingleTickerProviderStateMixin {
  late AnimationController _controller;
  late Animation<double> _animation;

  @override
  void initState() {
    super.initState();
    _controller = AnimationController(
      duration: const Duration(seconds: 1),
      vsync: this,
    )..repeat(reverse: true);

    _animation = Tween<double>(begin: 0.0, end: 0.2).animate(CurvedAnimation(
      parent: _controller,
      curve: Curves.elasticInOut,
    ));
  }

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return AnimatedBuilder(
      animation: _animation,
      child: Icon(
        Icons.person,
        size: 40,
        color: Colors.white,
      ),
      builder: (context, child) {
        return Transform.rotate(
          angle: _animation.value,
          child: child,
        );
      },
    );
  }
}

void _showErrorDialog(BuildContext context, String title, String message) {
  Alert(
    context: context,
    type: AlertType.error,
    title: title,
    desc: message,
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

class ApiService {
  static Future<Map<String, String>> getAuthHeaders() async {
    final prefs = await SharedPreferences.getInstance();
    final token = prefs.getString('auth_token');
    return {
      'Authorization': token != null ? 'Bearer $token' : '',
      'Content-Type': 'application/json',
    };
  }

  static Future<Map<String, String>> fetchBankAccountDetails() async {
    try {
      final response = await https.get(
        Uri.parse('https://app.mikirudata.com.ng/api/auth/bank-info'),
        headers: await getAuthHeaders(),
      );

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        if (data['success'] == true && data['bankDetails'] != null) {
          return {
            'number': data['bankDetails']['accountNumber'] ?? 'N/A',
            'bank': data['bankDetails']['bankName'] ?? 'N/A',
            'name': data['bankDetails']['accountName'] ?? 'N/A',
          };
        } else {
          return {'number': 'N/A', 'bank': 'N/A', 'name': 'N/A'};
        }
      } else {
        return {'number': 'N/A', 'bank': 'N/A', 'name': 'N/A'};
      }
    } catch (e) {
      return {'number': 'N/A', 'bank': 'N/A', 'name': 'N/A'};
    }
  }
}

class WalletCard extends StatefulWidget {
  final Wallet wallet;
  final double walletBalance;

  WalletCard({required this.wallet, required this.walletBalance});

  @override
  _WalletCardState createState() => _WalletCardState();
}

class _WalletCardState extends State<WalletCard> {
  Map<String, String> accountDetails = {};
  int currentIndex = 0;
  Timer? timer;

  @override
  void initState() {
    super.initState();
    _fetchBankAccountDetails();
    timer = Timer.periodic(const Duration(seconds: 3), (Timer timer) {
      if (accountDetails.isNotEmpty) {
        setState(() {
          currentIndex = (currentIndex + 1) % accountDetails.length;
        });
      }
    });
  }

  @override
  void dispose() {
    timer?.cancel();
    super.dispose();
  }

  Future<void> _fetchBankAccountDetails() async {
    final details = await ApiService.fetchBankAccountDetails();
    setState(() {
      accountDetails = details;
    });
  }

  void _showErrorDialog(BuildContext context, String title, String message) {
    Alert(
      context: context,
      type: AlertType.error,
      title: title,
      desc: message,
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

  void _copyToClipboard(String text) {
    Clipboard.setData(ClipboardData(text: text));
    ScaffoldMessenger.of(context).showSnackBar(
      const SnackBar(content: Text('Account number copied to clipboard')),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      margin: EdgeInsets.symmetric(vertical: 8),
      padding: const EdgeInsets.all(16.0),
      decoration: BoxDecoration(
        color: Colors.blue[900],
        borderRadius: BorderRadius.circular(24),
        boxShadow: [
          BoxShadow(
            color: Colors.grey.withOpacity(0.5),
            spreadRadius: 5,
            blurRadius: 7,
            offset: Offset(0, 3),
          ),
        ],
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        mainAxisSize: MainAxisSize.min,
        children: [
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  const Text(
                    'Balance:',
                    style: TextStyle(
                      fontSize: 20,
                      color: Colors.white,
                    ),
                  ),
                  Text(
                    '₦${widget.wallet.balance.toStringAsFixed(2)}',
                    style: const TextStyle(
                      fontSize: 20,
                      color: Colors.white,
                    ),
                  ),
                ],
              ),
              Text(
                accountDetails.isNotEmpty ? accountDetails['bank']! : 'N/A',
                style: const TextStyle(
                  fontSize: 14,
                  color: Colors.white,
                ),
              ),
            ],
          ),
          const SizedBox(height: 50),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  const Text(
                    'Bonus Balance:',
                    style: TextStyle(
                      fontSize: 20,
                      color: Colors.white,
                    ),
                  ),
                  Text(
                    '₦${widget.wallet.bonus.toStringAsFixed(2)}',
                    style: const TextStyle(
                      fontSize: 20,
                      color: Colors.white,
                    ),
                  ),
                ],
              ),
              Row(
                children: [
                  Text(
                    accountDetails.isNotEmpty
                        ? accountDetails['number']!
                        : 'N/A',
                    style: const TextStyle(
                      fontSize: 14,
                      color: Colors.white,
                    ),
                  ),
                  IconButton(
                    icon: const Icon(Icons.copy, color: Colors.white),
                    onPressed: () {
                      _copyToClipboard(accountDetails.isNotEmpty
                          ? accountDetails['number']!
                          : 'N/A');
                    },
                  ),
                ],
              ),
            ],
          ),
        ],
      ),
    );
  }
}

// The Wallet class representing a user's wallet
class Wallet {
  final String name;
  final double balance;
  final double bonus;

  Wallet({required this.name, required this.balance, required this.bonus});
}

class AnimatedTextContainer extends StatefulWidget {
  @override
  _AnimatedTextContainerState createState() => _AnimatedTextContainerState();
}

class _AnimatedTextContainerState extends State<AnimatedTextContainer>
    with SingleTickerProviderStateMixin {
  late AnimationController _controller;
  late Animation<Offset> _animation;
  String accountText = 'Loading...';
  String accountName = '';

  @override
  void initState() {
    super.initState();
    _fetchBankAccountDetails();

    _controller = AnimationController(
      duration: const Duration(seconds: 5),
      vsync: this,
    )..repeat(reverse: false);

    _animation = Tween<Offset>(
      begin: Offset(1.0, 0.0),
      end: Offset(-1.0, 0.0),
    ).animate(CurvedAnimation(
      parent: _controller,
      curve: Curves.linear,
    ));
  }

  Future<void> _fetchBankAccountDetails() async {
    final details = await ApiService.fetchBankAccountDetails();
    setState(() {
      accountName =
          'MFY/MUSA IBRAHIM/${details['name']}/${details['bank']}/${details['number']}';
      accountText = accountName;
    });
  }

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      height: 30,
      color: Colors.grey,
      child: Row(
        children: [
          Padding(
            padding: const EdgeInsets.only(left: 8.0),
            child: Icon(Icons.volume_up, color: Colors.blue[900]),
          ),
          Expanded(
            child: SlideTransition(
              position: _animation,
              child: Padding(
                padding: const EdgeInsets.only(left: 8.0),
                child: Text(
                  accountText,
                  style: TextStyle(
                    fontSize: 16,
                    color: Colors.blue[900],
                  ),
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }
}

class ServiceIconsCard extends StatelessWidget {
  final FluroRouter router; // Add router parameter

  // Constructor to accept the router
  ServiceIconsCard({required this.router});

  @override
  Widget build(BuildContext context) {
    final double screenWidth = MediaQuery.of(context).size.width;
    final bool isMobile = screenWidth < 600;
    final double containerWidth =
        isMobile ? screenWidth * 0.9 : screenWidth * 0.5;

    return Container(
      width: containerWidth,
      margin: EdgeInsets.symmetric(horizontal: 12),
      padding: EdgeInsets.all(16),
      decoration: BoxDecoration(
        color: Colors.white,
        borderRadius: BorderRadius.circular(24),
        boxShadow: [
          BoxShadow(
            color: Colors.grey.withOpacity(0.5),
            spreadRadius: 5,
            blurRadius: 7,
            offset: Offset(0, 3),
          ),
        ],
      ),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        children: [
          ServiceIcon(
            icon: Icons.add_circle_outline,
            label: 'Funding',
            onTap: () => router.navigateTo(context, '/funding'),
          ),
          ServiceIcon(
            icon: Icons.arrow_upward,
            label: 'Upgrade',
            onTap: () => router.navigateTo(context, '/upgrade'),
          ),
          ServiceIcon(
            icon: Icons.history,
            label: 'History',
            onTap: () => router.navigateTo(context, '/history'),
          ),
          ServiceIcon(
            icon: Icons.payment,
            label: 'Our Prices',
            onTap: () => router.navigateTo(context, '/our-prices'),
          ),
        ],
      ),
    );
  }
}

class ServiceIcon extends StatelessWidget {
  final IconData icon;
  final String label;
  final VoidCallback onTap;

  ServiceIcon({required this.icon, required this.label, required this.onTap});

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: onTap,
      child: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          Icon(icon, size: 40, color: Colors.blue[900]),
          SizedBox(height: 8),
          Text(
            label,
            style: TextStyle(
              fontSize: 14,
              color: Colors.blue[900],
            ),
          ),
        ],
      ),
    );
  }
}

class ServiceCardsRow extends StatelessWidget {
  final FluroRouter router; // Add a router parameter

  // Constructor to accept router
  ServiceCardsRow({required this.router});

  @override
  Widget build(BuildContext context) {
    final double screenWidth = MediaQuery.of(context).size.width;
    final bool isMobile = screenWidth < 600;
    final double containerWidth =
        isMobile ? screenWidth * 0.9 : screenWidth * 0.5;

    return Container(
      width: containerWidth,
      margin: EdgeInsets.symmetric(horizontal: 12),
      child: GridView.count(
        shrinkWrap: true,
        crossAxisCount: 3,
        crossAxisSpacing: 8.0,
        mainAxisSpacing: 8.0,
        childAspectRatio: 1.0, // Adjust this ratio if needed
        children: [
          ServiceCard(
            icon: Icons.wifi,
            label: 'Buy Data',
            onTap: () => router.navigateTo(context, '/data-plan'),
          ),
          ServiceCard(
            icon: Icons.phone,
            label: 'Top-Up',
            onTap: () => router.navigateTo(context, '/airtime'),
          ),
          ServiceCard(
            icon: Icons.tv,
            label: 'TV Cable',
            onTap: () => router.navigateTo(context, '/tv-cable'),
          ),
          ServiceCard(
            icon: Icons.school,
            label: 'Exam Pin',
            onTap: () => router.navigateTo(context, '/exam'),
          ),
          ServiceCard(
            icon: Icons.electrical_services,
            label: 'Electric Bill',
            onTap: () => router.navigateTo(context, '/electric-bill'),
          ),
          ServiceCard(
            icon: Icons.sms,
            label: 'Bulk SMS',
            onTap: () => router.navigateTo(context, '/bulk-sms'),
          ),
          ServiceCard(
            icon: Icons.repeat,
            label: 'Airtime to Cash',
            onTap: () => router.navigateTo(context, '/airtime-2-cash'),
          ),
        ],
      ),
    );
  }
}

class ServiceCard extends StatelessWidget {
  final IconData icon;
  final String label;
  final VoidCallback onTap;

  ServiceCard({required this.icon, required this.label, required this.onTap});

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: onTap,
      child: Container(
        margin: EdgeInsets.symmetric(horizontal: 4),
        padding: EdgeInsets.all(16),
        decoration: BoxDecoration(
          color: Colors.white,
          borderRadius: BorderRadius.circular(24),
          boxShadow: [
            BoxShadow(
              color: Colors.grey.withOpacity(0.5),
              spreadRadius: 5,
              blurRadius: 7,
              offset: Offset(0, 3),
            ),
          ],
        ),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            Icon(icon, size: 30, color: Colors.blue[900]),
            SizedBox(height: 8),
            Text(
              label[0].toUpperCase() + label.substring(1),
              textAlign: TextAlign.center,
              style: TextStyle(
                fontSize: 16,
                color: Colors.blue[900],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
