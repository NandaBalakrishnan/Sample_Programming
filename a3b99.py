a=input()
i=0
while(i<len(a)):
    t=a[i]
    if((i+2)<len(a)):
        if(a[i+2].isdigit()):
            s=int(a[i+1:i+3])
            i=i+3
            j=0
            for j in range(s):
                print(t)
        else:
            s=int(a[i+1])
            j=0
            i=i+2
            for j in range(s):
            print(t)
    else:
            s=int(a[i+1])
            j=0
            i=i+2
            for j in range(s):
            print(t)
    
