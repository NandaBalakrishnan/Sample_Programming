#include<stdio.h>
#include<conio.h>
void main()
{
int no,p,r,s;
clrscr();
scanf("%d",&no);
p=no;
while(no>0)
{
r=no%10;
s=s+(r*r*r);
no/=10;
}
if(p==s)
printf("armstrong");
else
printf("not a armstrong");
getch();
}
