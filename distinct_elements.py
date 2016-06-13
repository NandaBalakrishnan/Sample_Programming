import itertools
l=[str(j) for j in input().split()]
s=str(''.join(l[0:len(l)]))
print(s)
t=list(itertools.permutations(s,2))
m=[t[i] for i in range(len(t))  if(t[i][0] < t[i][1])]
print("distinct elements",m)
