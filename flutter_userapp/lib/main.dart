import 'package:flutter/material.dart';
import 'package:flutter_userapp/controller/user_controller.dart';
import 'package:flutter_userapp/pages/home_page.dart';
import 'package:get/get.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: HomePage(),
    );
  }
}