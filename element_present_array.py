l=[int(j) for j in input().split()]
k=int(input())
count=False
for j in range(len(l)):
    if(l[j]==k):
        count=True
    else:
        continue

if(count):
    print("Element is present")
else:
    print("Element not present")
