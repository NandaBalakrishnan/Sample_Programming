import itertools
l=[str(j) for j in input().split()]
t=list(itertools.permutations(l,2))
m=[t[i] for i in range(len(t))  if(t[i][0] < t[i][1])]
print(m)
print("distinct elements",len(m))
