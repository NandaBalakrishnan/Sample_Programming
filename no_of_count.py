l=[int(j) for j in input().split(" ")]
k=int(input())
count=0
j=0
s=0
l.sort(reverse=True)
print(l)
while k>0:
    s=k/l[j]
    print(s)
    if(s):
        count+=s
    k=k%l[j]
    j=j+1
print(int(count))
 
