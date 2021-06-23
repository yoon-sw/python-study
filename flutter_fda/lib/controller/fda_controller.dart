import 'package:flutter_fda/domain/fda.dart';
import 'package:flutter_fda/domain/fda_repository.dart';
import 'package:get/get.dart';

class FdaController extends GetxController {
  FdaRepository fdaRepository = FdaRepository();

  Future<Fda> findById(int id) {
    return fdaRepository.findById(id);
  }

  Future<List<Fda>> findAll() {
    return fdaRepository.findAll();
  }
}
