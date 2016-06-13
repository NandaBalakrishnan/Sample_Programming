s=[str(j) for j in input().split()]
print(s)
k=0
key=[]
value=[]
for k in range(len(s)):
    t=s[k]
    print(t)
    m=[]
    s1=0
    m=t.split("#")  
    s1=int(int(m[1])+int(m[2])+int(m[3]))
    value.append(m[0])
    key.append(s1)
dict={key[j]:value[j] for j in range(len(s))}
print(dict)
q=[]
q=sorted(dict.keys())
str1=q[len(q)-1]
print(str1)
print("student name:",dict[str1])#max mark
