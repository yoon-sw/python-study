class Fda {
  final String _id;
  final int id;
  final String name;
  final String group;
  final String plcR0001;
  final String plcR0001Timestamp;
  final int plcR0001Quality;
  final String r0035;
  final String r0036;
  final String r0037;
  final String r0038;
  final String r0039;
  final String r0040;

  Fda(
      this._id,
      this.id,
      this.name,
      this.group,
      this.plcR0001,
      this.plcR0001Timestamp,
      this.plcR0001Quality,
      this.r0035,
      this.r0036,
      this.r0037,
      this.r0038,
      this.r0039,
      this.r0040);

  Fda.fromJson(Map<String, dynamic> json)
      : _id = json["_id"],
        id = json["id"],
        name = json["name"],
        group = json["group"],
        plcR0001 = json["plcR0001"],
        plcR0001Timestamp = json["plcR0001Timestamp"],
        plcR0001Quality = json["plcR0001Quality"],
        r0035 = json["r0035"],
        r0036 = json["r0036"],
        r0037 = json["r0037"],
        r0038 = json["r0038"],
        r0039 = json["r0039"],
        r0040 = json["r0040"];
}
