import 'package:get/get_connect/connect.dart';

String host = "http://127.0.0.1:8080";

class FdaProvider extends GetConnect {
  // Get request
  Future<Response> findById(int id) => get('$host/fda/$id');

  Future<Response> findAll() => get('$host/fda');
// 스프링에 요청할 주소 적고 함수 생성!!

}
