l=str(input())
s=set(l)
n=len(s)
print(s)
j=0
m={}
for j in range(n):
    t=list(s)[j]
    print(t)
    m.update({t:l.count(t)})
print(m)
key=[]
val=[]
j=0
for k,v in m.items():
    key.insert(j,str(k))
    val.insert(j,v)
    print(str(key[j])+""+str(val[j]),end="")
    j=j+1
    

