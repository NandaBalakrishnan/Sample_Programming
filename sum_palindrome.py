l=input()
n=0
for ch in l:
    n+=int(ch)
print(n)
k=n
s=0
while n>0:
    r=n%10
    s+=(s*10)+r
    n/=10
print(s)
if(k==s):
    print("palindrome")
else:
    print("not a palindrome")
