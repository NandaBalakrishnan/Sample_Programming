import itertools
n=int(input())
k=int(input())
l=[int(j) for j in range(1,n+1)]
t=list(itertools.permutations(l,k))
print(t)
