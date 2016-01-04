import java.util.*;
public class Factorial
{
public static void main(String ar[])throws Exception
{
int n,f=1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
f*=i;
}
System.out.println("factorial of a given number +n+"is:"+f);
}
}
