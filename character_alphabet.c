#include<stdio.h>
#include<conio.h>
void main()
{
char c;
clrscr();
scanf("%c",&c);
if(((int)c>=65&&(int)c<=90)||((int)c>=97&&(int)c<=122))
printf("character");
else
printf("not a character");
getch();
}
