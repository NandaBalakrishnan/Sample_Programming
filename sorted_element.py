l=[int(j) for j in input().split()]
m=[int(k) for k in input().split()]
s=[int(l[j]) for j in range(0,len(l)) for k in range(0,len(m)) if(l[j]==m[k])]
if(len(s)==0):
    print("answers:",-1)
else:
    print("answers:",s)
