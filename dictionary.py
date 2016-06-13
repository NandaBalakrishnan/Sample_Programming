l=[str(j) for j in input().split()]
print(l)
m=[]
for k in range(len(l)):
    t=l[k]
    m.append((t[0:3]).upper())
print(m)
i=0
j=0
if(len(m)==len(l)):
    dict={m[j]:l[j] for j in range(len(m))}
print(dict)
