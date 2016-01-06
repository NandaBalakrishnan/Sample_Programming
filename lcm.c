#include<stdio.h>
int main(){
  int n1,n2,x,y;
  printf("\nEnter two numbers:");
  scanf("%d %d",&n1,&n2);
  x=n1,y=n2;
  while(n1!=n2){
      if(n1>n2)
           n1=n1-n2;
      else
      n2=n2-n1;
  }
  printf("L.C.M=%d",(x*y)/n1);
system("pause");
}
