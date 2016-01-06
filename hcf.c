#include<stdio.h>
#include<string.h>
int main()
{
int x,y,m,i;
printf("Insert any two number: ");
scanf("%d%d",&x,&y);
    if(x>y)
         m=y;
    else
         m=x;

    for(i=m;i>=1;i--){
         if(x%i==0&&y%i==0){
             printf("\nHCF of two number is : %d",i);
             break;
         }
    }

system("pause");    
}
