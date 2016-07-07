l=[int(j) for j in input().split()]
l.sort()
n=len(l)
s=n/2
a=l[0:int(s)]
b=l[int(s)+1:int(n)]
l[int(s)+1:int(n)]=b[::-1]
print(l)
