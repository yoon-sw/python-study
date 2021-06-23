import 'package:flutter_fda/domain/fda.dart';
import 'package:flutter_fda/domain/fda_provider.dart';
import 'package:get/get_connect/http/src/response/response.dart';

class FdaRepository {
  FdaProvider fdaProvider = FdaProvider();

  Future<Fda> findById(int id) async {
    Response response = await fdaProvider.findById(id);

    Fda fda = Fda.fromJson(response.body);
    print(response.body);
    return fda;
  }

  Future<List<Fda>> findAll() async {
    Response response = await fdaProvider.findAll();
    List<dynamic> resp = response.body;
    print(response.body);
    List<Fda> fdaList = resp.map((fda) => Fda.fromJson(fda)).toList();

    return fdaList;
  }
}
