# 클래스

class User:
    username = "ssar"
    password="1234"

u = User()
print(u.username)
print("=="*50)

class Person:
    #생성자 선언 __init__  
    def __init__(self, username,password): 
        self.username = username
        self.password = password

p = Person("ssar","!2334")
print("이름 : "+p.username)


