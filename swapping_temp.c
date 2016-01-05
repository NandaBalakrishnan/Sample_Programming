#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,t;
clrscr();
scanf("%d%d",&a,&b);
printf("before swapping:%d%d",a,b);
t=a;
a=b;
b=t;
printf("After swapping:%d%d",a,b);
getch();
}
