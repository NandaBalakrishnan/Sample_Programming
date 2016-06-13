l=[str(j) for j in input().split()]
count=0
for k in range(len(l)):
    t=l[k]
    m=list(t)
    for s in range(len(m)):
        if(m[s].isnumeric()):
            count=count+int(m[s])
print("count:",count)
            
        
