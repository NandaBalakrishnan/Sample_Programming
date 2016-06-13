l=[int(j) for j in input().split()]
n=int(input())
j=0
m=[int(l[j]) for j in range(len(l)) if(n!=l[j])]
print(l)
print(m)
