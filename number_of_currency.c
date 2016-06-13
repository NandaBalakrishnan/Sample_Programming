#include<stdio.h>
int main()
{
    int no,a,r;
int count=0;
    printf("Enter the number\n");
    scanf("%d",&no);
    a=no;
    while(no>0)
    {
r=no/500;
if(r)
{
count+=r;
no%=500;
printf("\n 500 rupees:\t%d",r);
}
r=no/100;
if(r)
{
count+=r;
no%=100;
printf("\n 100 rupees:\t%d",r);
}
r=no/50;
if(r)
{
count+=r;
no%=50;
printf("\n 50 reupees:\t%d",r);
}
r=no/10;
if(r)
{
count+=r;
no%=10;     
printf("\n 10 rupees:\t%d",r);
}
r=no/1;
if(r)
{
count+=r;
no%=1;     
printf("\n 1 rupees:\t%d",r);
}
}
printf("\nminimum count:%d",count);
system("pause");
}
