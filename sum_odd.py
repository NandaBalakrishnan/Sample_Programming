l=list(input())
print(l)
s=[int(l[j]) for j in range(len(l)) if(int(l[j])%2!=0)]
p=sum(s)
if(p%2!=0):
    print("1")
else:
    print("-1")

