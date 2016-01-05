#include<stdio.h>
#include<conio.h>
void main()
{
int no,r,s=0;
clrscr();
scanf("%d",&no);
while(no>0)
{
r=no%10;
s=(s*10)+r;
no/=10;
}
printf("reverse of a given number is :%d",s);
getch();
}
