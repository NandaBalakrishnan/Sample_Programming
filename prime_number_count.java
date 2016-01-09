import java.util.*;
public class prime_number_count
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int a,b,c,m=0;
a=sc.nextInt();
b=sc.nextInt();
for(int i=a;i<=b;i++)
{
    c=1;
for(int j=2;j<=i;j++)
{
       if(i%j==0)
       {
        c++;   
           
       }
}
if(c==2)
{
m++;
}
}
System.out.println("count:"+m);
}
}
