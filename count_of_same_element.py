l=[int(j) for j in input().split()]
m=[int(k) for k in input().split()]
s=[int(l[i]) for i in range(len(l)) for j in range(len(m)) if(l[i]==m[j])]
print("count:",(len(s)+len(s)))
