n=input()
l=list(n)
print(l)
s=0
j=0
m=[int(l[j])*int(l[j]) for j in range(len(l))]
for k in range(len(m)):
    s+=int(m[k])
print("sum:",s)    
