#include<stdio.h>
#include<string.h>
void main()
{
int no,n,i,j,t;
scanf("%d",&n);
for(i=0;i<n;i++)
scanf("%d",&a[i]);
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
printf("highest element:%d",a[n-1]);
printf("Lowest Element:%d",a[0]);
}
