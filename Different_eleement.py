n=[int(j) for j in input().split()]
n.sort()
print(n)
even=0
odd=0
l=[]
for j in range(len(n)):
    if(n[j]%2==0):
      l.append(0)
      even=even+1
    else:
        l.append(1)
        odd=odd+1
dict={l[i]:n[i] for i in range(len(n))}
if(odd>even):
    print("different element is:",dict[0])
else:
    print("different element is:",dict[1])
