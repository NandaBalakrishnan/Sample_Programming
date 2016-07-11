l=[int(j) for j in input().split(" ")]
k=int(input())
l.sort(reverse=False)
print(l)
s=[int(l[j]) for j in range(len(l)) if(l[j]<k)]
s1=[int(l[j]) for j in range(len(l)) if(l[j]>=k)]
print(s)
print()
s.extend(s1)
print(s)
