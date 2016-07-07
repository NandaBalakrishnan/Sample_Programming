l=[int(j) for j in input().split()]
k=int(input())
for i in range(0,len(l)):
    for j in range(i+1,len(l)):
        if((l[i]+l[j])==k):
            print(l[i])
            print(l[j])
        else:
            continue
