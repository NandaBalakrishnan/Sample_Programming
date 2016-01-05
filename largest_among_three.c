#include<stdio.h>
#include<string.h>
void main()
{
int a,b,c;
clrscr();
scanf("%d%d%d",&a,&b,&c);
if((a>b)&&(a>c))
printf("A is Largest");
else if((b>c))
printf("B is Largest");
else
printf("C is Largest");
getch();
}
