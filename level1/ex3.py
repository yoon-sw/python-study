#PS D:\Kiswire_Git> git init
#PS D:\Kiswire_Git> git add .
#PS D:\Kiswire_Git> git commit -m "파이썬 변수,리스트, 튜플" 
#PS D:\Kiswire_Git> git remote add origin https://github.com/yoon-sw/python-study.git
#PS D:\Kiswire_Git> git push origin master

#1.리스트
list1=[1,2,3,4]
list2=[5,6,7,8]

print(list1[2])
print("="*50)

list3 = list1 + list2  #[1, 2, 3, 4, 5, 6, 7, 8]
print(list3)

# 3 스칼라
#[1,3,4] 벡터

#2차원 matrix, 3차원 tensor
#[[1, 2, 3, 4], [5, 6, 7, 8]]
list4 = [        
    list1,
    list2
]           


print(list4)
print(list4)

list5 = list1.append(10)
print(list1)

list5 = [list1 ,11]
print(list5)

del list1[0]  #Index 삭제
print(list1)

list1.remove(2) #값 삭제
print(list1)

list6 = list(range(10))     #[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
print(list6)

list7 = list(range(1,12))   #[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
print(list7)

list7[0] = 100

#2.튜플 - 리스트 같음!! 데이터 변경 불가능
print("="*50)
tuple1 = (1,2,3)
print(tuple1)

tuple2 = (4,5,6)

#(1, 2, 3, 4, 5, 6)
tuple3 = tuple1 + tuple2
print(tuple3)

#((1, 2, 3), (4, 5, 6))
tuple4 = (tuple1 , tuple2)  
print(tuple4)

#(1, 2, 3, 4, 5, 6)
tuple1 = tuple1+tuple2  
print(tuple1)

list10 = list[tuple1]
print(list10)

#3.딕셔너리







