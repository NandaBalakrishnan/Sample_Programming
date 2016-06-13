#include<stdio.h>
#include<string.h>
int main()
{
int i,j,n;
char c[20];
printf("Enter the string");
scanf("%s",c);
n=strlen(c);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j||(i+j)==(n-1))
{
printf("%c",c[j]);                  
}                 
else
printf(" ");
}
printf("\n");
}
system("pause");    
}
