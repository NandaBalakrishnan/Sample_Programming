t=str(input())#read string
k=str(input())#read substring
if(k in t):#check whether string is there 
    print(t.find(k))#print index
else:
    print("-1")#print -1
