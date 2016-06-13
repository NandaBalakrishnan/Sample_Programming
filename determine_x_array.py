import itertools
l=[str(j) for j in input().split()]
t=list(itertools.permutations(l,2))
print(t)
s=int(input())
m=[t[i] for i in range(len(t))  if((int(t[i][0])+int(t[i][1]))==s)]
print(m)
