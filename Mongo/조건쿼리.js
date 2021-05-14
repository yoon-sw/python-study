db.users.find({ username: { $in: ["ssar", "cos"] } })



db.users.find({ $or: [{ id: 1 }, { username: "ssar" }] })



db.users.find({ id: 2, username: "cos" })



db.users.find({ $and: [{ id: 2 }, { username: "cos" }] })



db.users.find({ "friend.id": 2 });



db.users.find({ friend: { $exists: 1 } }); //exxist



db.users.find({ id: { $ne: 1 } });  //id <> 1



db.users.find(  : { $lt: 3 }});



db.users.find({ id: { $not: { $lt: 3 } } })



db.users.find().count();



db.users.find().sort({ id: 1 });  //asc



db.users.find().sort({ id: -1 });  //desc



//전체 users 컬렉션에서 usernama 필드만 출력

db.users.find({}, { _id: 0, username: 1 }).sort({ username: -1 }).limit(4);


//skip(2) : 2개 건너띄고 조회
db.users.find({}, { _id: 0, username: 1 }).sort({ username: -1 }).limit(4).skip(2);















