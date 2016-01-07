import java.util.*;
public class sum_equal_zero
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]+a[j]==0)
System.out.println("elements are"+a[i]+"\t"+a[j]);
}
}
}
}
