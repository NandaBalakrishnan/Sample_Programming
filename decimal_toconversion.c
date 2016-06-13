#include<stdio.h>
int no,base,a[20],total=0,i;
void convert(int);
int main()
{
printf("Enter the number\n");
scanf("%d",&no);
printf("Enter the base\n");
scanf("%d",&base);
switch(base)
{
case 2:printf("binary conversion\n");
       convert(2);   
       break;
case 8:printf("octal conversion\n");            
       convert(8);   
       break;

case 16:printf("hexa decimal conversion\n");
       convert(16);   
       break;
}

for(i=total-1;i>=0;i--)
{
if(a[i]>9)
printf("%c",a[i]);
else
printf("%d",a[i]);
}
system("pause");    
}
void convert(int ba)
{
int temp;
while(no!=0)
{
temp=no%ba;
if(temp>9)
{
a[total++]=temp+55;
printf("%d",temp+55);
}
else
a[total++]=temp;
no/=ba;           
}     
}
