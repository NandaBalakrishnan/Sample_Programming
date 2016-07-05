#include<stdio.h>
#include<conio.h>
void main()
{
int *x,*y;
int a,b;
clrscr();
printf("Enter two number\n");
scanf("%d%d",&a,&b);
x=&a;
y=&b;
printf("Addition of two numbers:%d",(*x+*y));
getch();
}
