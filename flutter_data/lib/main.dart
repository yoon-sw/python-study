import 'package:animated_text_kit/animated_text_kit.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      // "/"으로 named route와 함께 시작합니다. 본 예제에서는 FirstScreen 위젯에서 시작합니다.
      initialRoute: '/',
      routes: {
        // "/" Route로 이동하면, FirstScreen 위젯을 생성합니다.
        '/': (context) => FirstScreen(),
        // "/second" route로 이동하면, SecondScreen 위젯을 생성합니다.
        '/second': (context) => SecondScreen(),
      },
    );
  }
}

class FirstScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('First Screen'),
      ),
      body: Center(
        child: Column(
          children: [
            RaisedButton(
              child: Text('Launch screen'),
              onPressed: () {
                // Named route를 사용하여 두 번째 화면으로 전환합니다.
                Navigator.pushNamed(context, '/second');
              },
            ),
            AnimatedTextKit(
              animatedTexts: [
                TyperAnimatedText('It is not enough to do your best,'),
                FadeAnimatedText('you must know what to do,'),
                RotateAnimatedText('and then do your best'),
                ScaleAnimatedText('- W.Edwards Deming'),
              ],
              onTap: () {},
            )
          ],
        ),
      ),
    );
  }
}

class SecondScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Second Screen"),
      ),
      body: Center(
        child: RaisedButton(
          onPressed: () {
            // 현재 route를 스택에서 제거함으로써 첫 번째 스크린으로 되돌아 갑니다.
            Navigator.pop(context);
          },
          child: Text('Go back!'),
        ),
      ),
    );
  }
}
