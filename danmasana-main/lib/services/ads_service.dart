import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:carousel_slider/carousel_slider.dart';
import 'package:http/http.dart' as http;
import 'package:url_launcher/url_launcher.dart';

class AdsService extends StatelessWidget {
  final String apiUrl;

  AdsService({required this.apiUrl});

  Future<List<Map<String, String>>> fetchAds() async {
    final response = await http.get(Uri.parse(apiUrl));

    if (response.statusCode == 200) {
      List<dynamic> json = jsonDecode(response.body);
      return json.map((item) {
        // Ensure item is a Map<String, dynamic> and cast the fields to String
        if (item is Map<String, dynamic>) {
          return {
            'image': item['image'] as String? ?? '',  // Safely cast to String
            'url': item['url'] as String? ?? '',      // Safely cast to String
          };
        } else {
          throw Exception('Invalid data format');
        }
      }).toList();
    } else {
      throw Exception('Failed to load ads');
    }
  }

  @override
  Widget build(BuildContext context) {
    return FutureBuilder<List<Map<String, String>>>(
      future: fetchAds(),
      builder: (context, snapshot) {
        if (snapshot.connectionState == ConnectionState.waiting) {
          return Center(child: CircularProgressIndicator());
        } else if (snapshot.hasError) {
          return Center(child: Text('Error: ${snapshot.error}'));
        } else if (!snapshot.hasData || snapshot.data!.isEmpty) {
          return Center(child: Text('No ads available'));
        } else {
          final ads = snapshot.data!;
          return LayoutBuilder(
            builder: (context, constraints) {
              double widthPercentage = constraints.maxWidth > 600 ? 0.5 : 0.9;

              return CarouselSlider.builder(
                itemCount: ads.length,
                itemBuilder: (context, index, realIndex) {
                  final ad = ads[index];
                  return GestureDetector(
                    onTap: () async {
                      final url = ad['url']!;
                      if (await canLaunch(url)) {
                        await launch(url);
                      } else {
                        throw 'Could not launch $url';
                      }
                    },
                    child: Container(
                      width: constraints.maxWidth * widthPercentage,
                      margin: EdgeInsets.symmetric(horizontal: 5.0),
                      child: Image.network(
                        ad['image']!,
                        fit: BoxFit.cover,
                        errorBuilder: (context, error, stackTrace) {
                          // Handle image loading errors
                          return Center(child: Text('Failed to load image'));
                        },
                      ),
                    ),
                  );
                },
                options: CarouselOptions(
                  height: 100.0,
                  autoPlay: true,
                  autoPlayInterval: Duration(seconds: 3),
                  autoPlayAnimationDuration: Duration(milliseconds: 800),
                  viewportFraction: 1.0,
                ),
              );
            },
          );
        }
      },
    );
  }
}
