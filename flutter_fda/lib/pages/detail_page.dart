import 'package:flutter/material.dart';
import 'package:flutter_fda/controller/fda_controller.dart';
import 'package:flutter_fda/domain/fda.dart';
import 'package:get/get.dart';

class DetailPage extends StatelessWidget {
  final FdaController f = Get.put(FdaController());

  @override
  Widget build(BuildContext context) {
    var id = Get.arguments;
    return Scaffold(
      appBar: AppBar(
        title: Text("Fda 상세보기"),
      ),
      body: FutureBuilder<Fda>(
          future: f.findById(id),
          builder: (context, snapshot) {
            if (snapshot.hasData) {
              return ListTile(
                  title: Text("${snapshot.data!.name}"),
                  subtitle: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text("name : ${snapshot.data!.name}"),
                      Text("group : ${snapshot.data!.group}"),
                      Text(
                          "plcR0001Quality : ${snapshot.data!.plcR0001Quality}"),
                      Text(
                          "plcR0001Timestamp : ${snapshot.data!.plcR0001Timestamp}"),
                      Text("plcR0001 : ${snapshot.data!.plcR0001}"),
                      Text("r0035 : ${snapshot.data!.r0035}"),
                      Text("r0036 : ${snapshot.data!.r0036}"),
                      Text("r0037 : ${snapshot.data!.r0037}"),
                      Text("r0038 : ${snapshot.data!.r0038}"),
                      Text("r0039 : ${snapshot.data!.r0039}"),
                      Text("r0040 : ${snapshot.data!.r0040}"),
                    ],
                  ));
            } else {
              return Center(
                child: CircularProgressIndicator(),
              );
            }
          }),
    );
  }
}
