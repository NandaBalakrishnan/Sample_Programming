l=[int(j) for j in input().split()]
m=[int(k) for k in input().split()]
l.extend(m)
l.sort()
leng=len(l)
print("middle element:",l[leng//2])
