def fun(m):
    m.sort()
    n=len(m)
    print("m",m[n-1])
    return m[n-1]

l=[int(j) for j in input().split()]
s=[]
p=[]
j=0
d=len(l)
print("d",d)
while(j<d-1):
    s=l[j+1:d]
    p.insert(j,fun(s))
    j=j+1
p.insert(j,0)    
print(p)
