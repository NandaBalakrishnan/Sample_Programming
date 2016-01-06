#include<stdio.h>
#include<conio.h>
int num(n)
{
if(n==0)
return 0;
if(n%10==7)
return 1+num(n/10);
return num(n/10);
}
void main()
{
int no,ans=0;
clrscr();
scanf("%d",&no);
ans=num(no);
printf("%d",ans);
getch();
}
