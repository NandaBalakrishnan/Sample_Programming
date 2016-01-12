#include<stdio.h>
int main()
{
    int hh,kk;
int a[168],b[100],c=0,j=0,o,p,q,i;
int n=1000,d,s,t;
int k=0,flag=0;
for(s=2;s<n;s++)
{
    d=1;
for(t=2;t<=s;t++)
{
if((s%t)==0)
    d++;
}
if(d==2)
    a[k++]=s;
}

printf("\n enter the number");
scanf("%d%d",&p,&q);
for(i=p;i<=q;i++)
{
printf("\ni=%d",i);
z :
if((i/2)!=0)
{
b[j]=i%2;
j++;
o=j;
i=i/2;
goto z;
}
else if((i/2)==0)
{
b[o]=i;
for(i=0;i<=o;i++)
{
if(b[i]==1)
c=c+1;
}
printf("\nc=%d",c);
}

for(hh=0;hh<168;hh++)
{
if(a[hh]!=0)
{
if(a[hh]==c)
{
flag++;   
break;
}        
}                    
}
printf("\nflag=%d",flag);
}

printf("prime number count:%d",flag);
    
system("pause");
}
