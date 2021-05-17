db.food.insertOne({ _id: 1, fruit: ["apple", "banana", "peach"] });
db.food.insertOne({ _id: 2, fruit: ["apple", "kumquat", "orange"] });
db.food.insertOne({ _id: 3, fruit: ["cherry", "banana", "apple"] });
db.food.insertOne({ _id: 4, fruit: ["cherry", "raspberry", "peach"] });


// 배열의 순서별로 검색
db.food.find({ fruit: ["apple", "banana", "peach"] });

db.food.find({ fruit: ["apple", "peach", "banana"] });

// $all 배열의 순서와 상관없이 모두 검색
db.food.find({ fruit: { $all: ["apple", "banana"] } });

// $in apple과 banana 가 포함된 모든 검색
db.food.find({ fruit: { $in: ["apple", "banana"] } });

// 배열의 size(length)가 3인것만 조회
db.food.find({ fruit: { $size: 3 } });

// 배열의 size(length)가 3이고 apple과 banana를 가지고있는 데이터 검색
db.food.find({ fruit: { $size: 3, $all: ["apple", "banana"] } });

// 배열에 넣기
db.food.update({ _id: 1 }, { $push: { fruit: "strawberry" } });

//전체 배열에 넣기
db.food.updateMany({}, { $push: { fruit: "watermelon" } });






db.post.insertOne({
    _id: 1, replys: [
        { id: 1, content: "내용1", userId: 1 },
        { id: 2, content: "내용2", userId: 1 },
        { id: 3, content: "내용3", userId: 2 },
    ]
});

db.post.insertOne({
    _id: 2, replys: [
        { id: 4, content: "내용4", userId: 1 },
        { id: 5, content: "내용5", userId: 1 },
        { id: 6, content: "내용6", userId: 2 },
    ]
});

// replys의 id가 2인것 검색
db.post.find({ "replys.id": 2 });

var a = db.post.findOne({ "replys.id": 2 });

db.post.findOne({ "replys.id": 1, "replys.userId": 2 });
db.post.findOne({ $and: [{ "replys.id": 1 }, { "replys.userId": 1 }] });

// 배열안의 도큐먼트 검색
db.post.findOne({ "replys": { $elemMatch: { id: 1 } } });
db.post.findOne({ "replys": { $elemMatch: { id: 1, userId: 1 } } });

//replys 배열안에 도큐먼트가 id:4이고, userId:1인것을 찾아라
db.post.findOne({ "replys": { $elemMatch: { id: 4, userId: 1 } } });


// 배열 검색  $slice
db.food.find({ _id: 1 }, { fruit: { $slice: 2 } });  //앞에서 2개

db.food.findOne({ _id: 1 }, { fruit: { $slice: [1, 2] } });  // index 1에서 2개







