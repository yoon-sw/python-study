import 'package:flutter_userapp/domain/user/user.dart';
import 'package:flutter_userapp/domain/user/user_repository.dart';
import 'package:get/get.dart';

class UserController extends GetxController {
  UserRepository userRepository = UserRepository();

  Future<User> findById(int id) {
    return userRepository.findById(id);
  }

  Future<List<User>> findAll() {
    return userRepository.findAll();
  }
}
