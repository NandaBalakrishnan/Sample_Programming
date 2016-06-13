def fun_vowel(m):
    s=0
    l=list(m)
    for j in range(len(l)):
        if(l[j]=='a' or l[j]=='e' or l[j]=='o' or l[j]=='i' or l[j]=='u' or l[j]=='A' or l[j]=='E' or l[j]=='I' or l[j]=='O' or l[j]=='U'):
            s=s+1
    return s   
s1=input()
ans=fun_vowel(s1)
print("number of vowel:",ans)
