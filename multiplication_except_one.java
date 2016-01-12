import java.util.*;
public class multiplication_except_one
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,k,prod=1;//read n,k and initialize prod=1
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];//declare array
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(i!=k)
prod*=a[i];//multiplication should be done when i!=k
}
System.out.println("output:"+prod);//display the output
}
}
