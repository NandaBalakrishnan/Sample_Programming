import itertools
s=str(input())
s1=str(input())

t=["".join(x) for x in itertools.permutations(s,len(s))]
t1=["".join(y) for y in itertools.permutations(s1,len(s1))]
for j in range(len(t)):
    print(str(t[j])+str(t1[j]))
