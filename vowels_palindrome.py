def fun(sp):
    se=list(sp)
    count=0
    j=0
    for j in range(len(se)):
        if(se[j]=='a' or se[j]=='e' or se[j]=='i' or se[j]=='o' or se[j]=='u'):
            count=count+1
    return count
    
m=str(input())
l=list(m)
s=''.join(l[::-1])
seo=''.join(set(l))
print(seo)
pal=(m==s)
vo=fun(seo)
if(vo>=2 and pal=="true"):
    print("true")
else:
    print("false")


