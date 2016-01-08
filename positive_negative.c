#include<stdio.h>
void main()
{
int n;
clrscr();
scanf("%d",&n);
if(n>0)
printf("positive");
else if(n==0)
printf("zero");
else
printf("negative");
getch();
}
