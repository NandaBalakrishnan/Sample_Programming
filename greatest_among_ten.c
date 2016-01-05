#include<stdio.h>
#include<conio.h>
void main()
{
int a[10],i,j,t;
clrscr();
for(i=0;i<10;i++)
scanf("%d",&a[i]);
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(a[j]>a[i])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
printf("Largest among ten integers is:%d",a[0]);
getch();
}
