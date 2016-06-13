key=[int(j) for j in input().split()]
value=[int(k) for k in input().split()]
dict={key[i]:value[i] for i in range(len(key))}
print(dict)
j=0
s=0
c=0
for j in range(len(key)):
    if(key[j]%2!=0):
        s+=dict[key[j]]
        c=c+1
print("average:",(s//c))
