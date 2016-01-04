#include<stdio.h>
#include<string.h>
int main()
{
int n,t,i,j,l=9,c=0;
scanf("%d",&n);
int ar[n+10];
for(i=0;i<n;i++)
scanf("%d",&ar[i]);
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(ar[i]<ar[j])
{
t=ar[i];
ar[i]=ar[j];
ar[j]=t;
}
}
}
for(i=0;i<n;i++)
{
if(ar[i]==9)
{
c++;
}
}
for(i=0;i<c;i++)
printf("%d\t",l);
for(i=0;i<n;i++)
{
if(ar[i]!=9)
printf("%d\t",ar[i]);
}
system("pause");
}

