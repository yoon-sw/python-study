# PS D:\Kiswire_Git> git init
# PS D:\Kiswire_Git> git add .
# PS D:\Kiswire_Git> git commit -m "6.15 maria To mongo 5일 마지막"
# PS D:\Kiswire_Git> git remote add origin https://github.com/yoon-sw/python-study.git
# PS D:\Kiswire_Git> git push origin master


a = 1
b = 1.2
c = 4e5

print(a)
print(b)
print(c)

# +, -, *, /, **, %, //
e = 3
f = 4
print(e+f)
print(e-f)
print(e*f)
print(e/f)
print(e**f)  # 제곱
print(e % f)  # 나머지
print(e // f)  # 몫
2. 문자열

str1 = "안녕하세요"

str2 = '안녕하세요'

str3 = '안녕하세요 "친구"'

str4 = '''
안녕하세요
친구
반가워요
'''

print(str1)
print(str2)
print(str3)
print(str4)

str5 = "="

print(str5 * 20)
print(str4)
print(str5 * 20)

str6 = "가나다라마"

print(len(str6))
print(str6[0])
print(str6[-1])
print(str6[0:3])  # 0부터 3 직전까지 문자
print(str6[2:])  # 2부터 끝까지
print(str6[:3])  # 처음부터 3 직전까지

# 문자열 함수 find, rfind, join

# 두번째 - 위치 찾기
test = "가나-다-라"

print(test.find("-", 3))
print(test.rfind("-"))

# 문제 1 끝 번호 4자리 찾아내기
phone1 = "051-777-3333"

# 문제 2 끝 번호 4자리 찾아내기
phone2 = "02-777-9999"

# 문제 3 가운데 번호 찾아내기
phone3 = "010-2222-3333"


# 문자열 삽입
username = "123"

print(",".join(username))
[출처] 파이썬 3강 - 숫자, 문자열 다루기 | 작성자 getinthere
