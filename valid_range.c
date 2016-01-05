#include<stdio.h>
#include<conio.h>
void main()
{
int n;
clrscr();
scanf("%d",&n);
if(n>=1&&n<=9)
printf("%d",n);
else
printf("you entered number is not in range");
getch();
}
