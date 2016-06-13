l=[int(j) for j in input().split()]
n=len(l)
inp=int(input())
s=[]
s=l[inp:n]+l[0:inp]
print(s)
