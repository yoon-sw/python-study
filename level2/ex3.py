
t1 = ("username","password","gender")
t2 = ("ssar","1234","남")

d1 = {}

# enumerate => index, key return
for i,k in enumerate(t1):  
    d1[k] = t2[i]

print(d1)
