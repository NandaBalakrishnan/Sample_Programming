l=[int(j) for j in input().split(" ")]
k=[int(j) for j in input().split(" ") ]
ans=[x+y for x,y in zip(l,k)]
for j in range(len(ans)):
    print(ans[j])
