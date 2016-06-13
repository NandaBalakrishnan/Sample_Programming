l=[int(j) for j in input().split()]
m=[int(k) for k in input().split()]
s=[int(l[j]) for j in range(len(l)) for k in range(len(m)) if(l[j]==m[k])]
sum=0
print(l)
print(m)
print(s)
for i in range(len(s)):
    sum=sum+s[i]
print("sum:",sum)
 
