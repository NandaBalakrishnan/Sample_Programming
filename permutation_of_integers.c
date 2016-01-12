#include <stdio.h>
#include <string.h>
int fun(char []);
void swap(char *,char *y);
void permute(char *a,int l,int r);
/* Function to swap values at two pointers */
void swap(char *x, char *y)
{
    char temp;
    temp = *x;
    *x = *y;
    *y = temp;
}

/* Function to print permutations of string
   This function takes three parameters:
   1. String
   2. Starting index of the string
   3. Ending index of the string. */
void permute(char *a, int l, int r)
{
   int i;
   if (l == r)
     printf("%s\n", a);
   else
   {
       for (i = l; i <= r; i++)
       {
          swap((a+l), (a+i));
          permute(a, l+1, r);
          swap((a+l), (a+i)); //backtrack
       }
   }
}

/* Driver program to test above functions */
int main()
{
    char str[] = "123";
    int n = fun(str);
    permute(str, 0, n-1);
system("pause");
}
int fun(char str[])
{
int i,count=0;
for(i=0;str[i]!='\0';i++)
{
count++;                         
}    
return count;
}
