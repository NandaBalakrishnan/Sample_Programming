import itertools
s=str(input())
s1=str(input())
s2=(s+s1).strip("")
t= ["".join(x) for x in itertools.permutations(s2,len(s2))]
print(t)
