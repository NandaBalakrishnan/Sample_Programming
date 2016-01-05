#include<stdio.h>
#include<conio.h>
void main()
{
int no,r,c=0;
clrscr();
scanf("%d",&no);
while(no>0)
{
r=no%10;
c++;
no/=10;
}
printf("number of digits:%d",c)
getch();
}
