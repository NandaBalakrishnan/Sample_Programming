#include<stdio.h>
#include<conio.h>
void main()
{
int i=0,flag=0;
char a[100],b[100];
clrscr();
scanf("%s%s",a,b);
while(a[i]!='\0'&&b[i]!='\0')
{
if(a[i]!=b[i])
{
flag=1;
break;
}
i++;
}
if(flag==0&&a[i]!='\0'&&b[i]!='\0')
printf("strings are equals");
else 
printf("strings are not equals");
getch();
}
