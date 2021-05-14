use korea;

var u_ob1 = ObjectId();
var u_ob2 = ObjectId();
var u_ob3 = ObjectId();
var u_ob4 = ObjectId();

var b_ob1 = ObjectId();
var b_ob2 = ObjectId();
var b_ob3 = ObjectId();
var b_ob4 = ObjectId();

var c_ob1 = ObjectId();
var c_ob2 = ObjectId();
var c_ob3 = ObjectId();
var c_ob4 = ObjectId();

var users = [
    { _id: u_ob1, username: "ssar", password: "1234" },
    { _id: u_ob2, username: "cos", password: "1234" },
    { _id: u_ob3, username: "love", password: "1234" }
];

var boards = [
    {
        _id: b_ob1, title: "1강 문법", content: "내용1", user: { id: 1, username: "ssar", password: "1234" },
        comments: [
            { _id: c_ob3, reply: "그냥 그래요", user: { _id: u_ob2, username: "cos", password: "1234" } },
            { _id: c_ob4, reply: "공감해요", user: { _id: u_ob3, username: "love", password: "1234" } },
        ]
    },
    {
        _id: b_ob2, title: "2강 문법", content: "내용2", user: { _id: u_ob2, username: "cos", password: "1234" },
        comments: [
            { _id: c_ob1, reply: "너무 좋아요", user: { _id: u_ob1, username: "ssar", password: "1234" } },
            { _id: c_ob2, reply: "너무 별로에요", user: { _id: u_ob1, username: "ssar", password: "1234" } },
        ]
    }
];

var comments = [
    { _id: c_ob1, reply: "너무 좋아요", user: { _id: u_ob1, username: "ssar", password: "1234" }, boardId: b_ob2 },
    { _id: c_ob2, reply: "너무 별로에요", user: { _id: u_ob1, username: "ssar", password: "1234" }, boardId: b_ob2 },
    { _id: c_ob3, reply: "그냥 그래요", user: { _id: u_ob2, username: "cos", password: "1234" }, boardId: b_ob1 },
    { _id: c_ob4, reply: "공감해요", user: { _id: u_ob3, username: "love", password: "1234" }, boardId: b_ob1 },
]

db.users.save(users);
db.boards.save(boards);
db.comments.save(comments);

db.board.find()
db.users.find().pretty();


db.users.update({ username: "ssar" }, { password: "578" });  //잘못된 쿼리

db.users.update({ password: "578" }, { username: "ssar", password: "1234" });  //복구

db.users.update({ username: "ssar" }, { $set: { password: "5678" } });  //Good!!

/*
1. 문서정리
2. 업데이트 할때 find 다 찾아내서 한번에 업데이트
*/



db.users.find()

db.users.update({ password: "1234" }, { $set: { password: "6789" } }, { multi: 1 });
















