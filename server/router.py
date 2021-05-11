# python -m pip install flask

from flask import Flask, render_template, url_for, redirect
import repository

# 1.Flask 객체 생성
app = Flask(__name__)


# 2.라우터 함수 만들기
# http1.1 => 요청방식 4가지 방식
# GET(SELECT), POST(INSERT), DELETE(DELETE), PUT(UPDATE)

# Data를 응답
@app.route("/", methods=["GET"])
def home():
    # 파일의 위치는 templates 폴더안!!
    boards = repository.findAll()
    return render_template("home.html", bs=boards)


@app.route("/board")
def detail2():
    return "board"


@app.route("/board/<id>")
def detail(id):
    board = repository.findById(id)
    return render_template("detail.html", b=board)


# 해당파일이 직접 호출되었을때
if __name__ == "__main__":
    app.run(
        host="0.0.0.0",
        port=5000,
        debug=True
    )
