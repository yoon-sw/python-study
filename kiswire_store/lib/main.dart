import 'package:flutter/material.dart';
import 'package:kiswire_store/component/nav.dart';

void main() {
  runApp(MyApp());
}

// 1. 아이폰, 안드로이드 => MaterialApp()
// 2. 휴대폰 구조 => Scaffold()
class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: SafeArea(
          child: Column(
            children: [
              Nav(),
              Expanded(
                flex: 1,
                child: Image.asset(
                  "assets/bag.jpeg",
                  fit: BoxFit.cover,
                ),
              ),
              SizedBox(
                height: 2.0,
              ),
              Expanded(
                flex: 1,
                child: Image.asset(
                  "assets/cloth.jpeg",
                  fit: BoxFit.cover,
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }

  TextStyle menuTitleStyle() {
    return TextStyle(
      fontSize: 16.0,
      fontWeight: FontWeight.bold,
    );
  }
}
