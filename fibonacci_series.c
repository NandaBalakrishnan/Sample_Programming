#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c,no;
clrscr();
scanf("%d",&no);
printf("0\n1");
for(i=0;i<no;i++)
{
c=a+b;
a=b;
b=c;
printf("%d\n",c);
}
getch();
}
