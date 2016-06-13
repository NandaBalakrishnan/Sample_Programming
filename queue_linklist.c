#include<stdio.h>
int length(char *);
int main()
{
int l;
char *a=(char*)malloc(sizeof(char)*10);
int(*fp)(char*)=length;
printf("Enter the string\n");
gets(a);
l=(*fp)(a);
printf("length:%d",l);
system("pause");    
}
int length(char *p)
{
int i=0;
while(p[i]!='\0')
i++;
return i;    
}
