def fun(l):
    s=list(bin(l)[2:])
    print(s)
    for j in range(len(s)):
        if(s[j]=='1'):
            print("position",j)
            break

def main():
    l=int(input())
    fun(l)
main()
