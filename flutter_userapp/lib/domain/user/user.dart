class User {
  final int id;
  final String name;
  final String group;

  User(this.id, this.name, this.group);

  User.fromJson(Map<String, dynamic> json)
      : id = json["id"],
        name = json["name"],
        group = json["group"];
}
