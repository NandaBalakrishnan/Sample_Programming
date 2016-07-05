l=[int(j) for j in input().split()]
n=len(l)
inp=int(input())
s=[]
s=l[inp:n]+l[0:inp]
#s1=l[0:inp-1]
print(s)
