db.users.find().pretty();

// update $set 사용!!!
db.users.update({ password: "5678" }, { $set: { password: "1234" } });

// 한건만 update
db.users.update({ password: "6789" }, { $set: { password: "5678" } });

// 모든 데이터 update
db.users.update({ password: "5678" }, { $set: { password: "1111" } }, { multi: 1 });


// 데이터 생성
db.persons.save({ _id: 1, username: "ssar", password: "1234" });
db.persons.save({ _id: 2, username: "cos", password: "1234" });

// 필드만 제거
db.persons.update({ _id: 2 }, { $unset: { password: "1234" } })

db.persons.update({ _id: 1 }, { password: "5678" });

db.persons.update({ _id: 2 }, { password: "5678" });

// $set 필드 추가
db.persons.update({ _id: 2 }, { $set: { phone: "5678" } });


// $upsert
db.persons.update({ _id: 3 }, { password: "1234" });

//데이터가 없으면 추가 , 있으면 업데이트
db.persons.update({ _id: 3 }, { password: "1234" }, { upsert: 1 });


/* UPDATE 정리 ****************************************************************************
   updateOne - 한건
   updateMany - 전부

   update({찾을값}, {$set : {변경할값}}, {옵션});
   update({찾을값}, {$unset : {변경할값}}, {옵션});

   연산자 : $set (필드변경, 필드추가)
            $unset(필드삭제)
   옵션 : multi, upsert

*****************************************************************************/

// 도큐먼트 삭제 - 한건
db.persons.remove({ _id: 3 });

// 도큐먼트 삭제 - 전체
db.persons.remove({});

db.persons.drop();

/*
remove({찾을값});
remove({_id:{$gt:3}});
*/





