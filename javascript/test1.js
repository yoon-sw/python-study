
//1. 자바스크립트 타입
// var n1 = 10;
// var n2 = 10.5;
// var s1 = "문자열";
// var b1 = true;

// console.log(n1);
// console.log(n2);
// console.log(s1);
// console.log(b1);

//2.자바스크립트 오브젝트 타입
// var board = {
//     id: 1,
//     title: "제목",
//     content: "내용1",
//     friend: {
//         username: "홍홍홍"
//     }
// };

// console.log(board);
// console.log(board.title);
// console.log(board.friend.username);


//3.자바스크립트 함수
function add() {
    return 10;
}

var result = add();
console.log(result);


//4. 익명함수
var m = function () {
    return 20;
}

console.log(m());

// 5.화살표 함수
var r = () => 30;  // =>는 function 생략, {} 생략, 자동 return

console.log(r());


// 6.화살표 함수로 변경하기
var f1 = function hello(n1) {
    return n1 + 5;
}
var f2 = (n1) => {
    n1 = n1 + 5;
    return n1 + 5;
}
console.log(f2(5));

//7.리스트(배열)
var arr1 = [1, 2, 3];

arr1.forEach((n) => {
    console.log(n);
});

var arr2 = arr1.map((n) => {
    return n + 5;
});
console.log(arr2);

// MariaDB(타임존=Asia/Seoul) => 몽고DB (9시간전 UTC) 
// +9시간 해서 INSERT
// string 타입으로 변경해서 집어넣기
// 8. Date
var today = new Date();
console.log(today);



//Mongo DB

// > db.users.find()
// { "_id" : ObjectId("609b92d9e4664d89d7dac525"), "id" : 1, "username" : "ssar" }
// { "_id" : ObjectId("609b92d9e4664d89d7dac526"), "id" : 2, "username" : "cos" }
// { "_id" : ObjectId("609b92d9e4664d89d7dac527"), "id" : 3, "username" : "love" }
// { "_id" : ObjectId("609b92d9e4664d89d7dac528"), "id" : 4, "username" : "hong" }
// { "_id" : ObjectId("609b92d9e4664d89d7dac529"), "id" : 5, "username" : "choi", "friend" : { "id" : 2 } }

db

use korea;

function f() {
    var r = db.users.findOne({ id: 5 })
    return db.users.find({ id: r.friend.id });
}

f();









