import 'package:flutter/material.dart';
import 'package:flutter_userapp/controller/user_controller.dart';
import 'package:flutter_userapp/domain/user/user.dart';
import 'package:get/get.dart';

class HomePage extends StatelessWidget {
  final UserController u = Get.put(UserController());

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("FDA 정보"),
      ),
      body: FutureBuilder<List<User>>(
        future: u.findAll(), // findAll()을 호출하여 기다린다.
        builder: (context, snapshot) {
          // builder()는 두번 호출된다.
          // snapshot => findAll()의 응답 값
          if (snapshot.hasData) {
            return ListView.separated(
              itemCount: snapshot.data!.length,
              separatorBuilder: (context, index) => Divider(),
              itemBuilder: (context, index) {
                return ListTile(
                  title: Text("${snapshot.data![index].name}"),
                  subtitle: Text("${snapshot.data![index].group}"),
                  onTap: () {
                    print("클릭됨 ${snapshot.data![index].id}");
                    //Get.to(DetailPage(), arguments: snapshot.data![index].id)
                  },
                  //leading: Icon(Icons.person),
                );
              },
            );
          } else {
            return Center(
              child: CircularProgressIndicator(),
            );
          }
        },
      ),
    );
  }
}
