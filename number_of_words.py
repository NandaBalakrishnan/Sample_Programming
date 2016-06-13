n=[str(k) for k in input().split()]
m=int(input())
dict={n[i]:len(n[i]) for i in range(0,len(n))}
p=0
for i in range(len(n)):
    if(len(n[i])!=m):
        p=p+1
print("number of elements:",p)  
