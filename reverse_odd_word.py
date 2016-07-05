s=[str(j) for j in input().split()]
j=1
for j in range(len(s)):
    t=s[j]
    if(j%2!=0):
        print(t)
    else:
        print(t[::-1])
    
