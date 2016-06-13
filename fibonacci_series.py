n=int(input())
s=1
a,b=0,1
for j in range(0,n-1):
    c=a+b  
    s=s+c
    a,b=b,c
print("sum:",s)
