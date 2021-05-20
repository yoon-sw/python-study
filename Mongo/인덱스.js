
// ObjectId()
// Timestamp + MacID + 랜덤번호(3)

//10만건 데이터 입력
for (i = 0; i < 100000; i++) {
    db.users.insertOne({ "id": i, "username": "user" + i, "age": Math.floor(Math.random() * 120), "created": new Date() });
}

// 실행계획 표시
db.users.find({ "username": "user101" }).explain("executionStats");


db.users.createIndex({ "username": 1 });


db.users.find({ "username": "user101" }).explain("executionStats");

db.users.find().sort({ "age": 1, "username": 1 }).explain("executionStats");
db.users.find().sort({ "username": 1, "age": 1 }).explain("executionStats");

//복합인덱스
db.users.createIndex({ "age": 1, "username": 1 });
db.users.find().sort({ "age": 1, "username": 1 });

db.users.find({ "age": 21 }).sort({ "username": 1 })



db.users.find({ "age": { "$gt": 21, "$lt": 30 } })

db.users.find({ "age": { "$gt": 21, "$lt": 30 } }).sort({ "username": 1 }).explain("executionStats");



// 복합 인덱스 쿼리 플랜보기
for (i = 0; i < 100000; i++) {
    db.students.insertOne({ "student_id": i, "username": "user" + i, "class_id": Math.floor(Math.random() * 500) });
}


