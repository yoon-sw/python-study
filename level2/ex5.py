# for문으로 리스트,튜플,딕셔너리 다루기

# 1.list안에 tuple을 뽑아보기

list1 = [
    (1, "ssr", "1234"),
    (2, "cos", "dfds")
]


for a, b, c in list1:
    print(f"{a},{b},{c}")


# 2.가장 기본 for문

for i in range(10):  # 0~9
    print(i)

# 3. 리스트안에 딕셔너리 뽑아내기
# list2 리스트에 id값만 담기
list2 = []

dic1 = [
    {"id": 1, "name": "Ssar"},
    {"id": 2, "name": "cos"},
]

list3 = [d["id"] for d in dic1]
print(list3)

tuple4 = (
    (1, 2),
    (3, 4),
    (5, 6)
)

print("==="*50)
for i, j in tuple4:
    print(i)
    print(j)
    print("*"*50)
