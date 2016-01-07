import java.util.*;
public class count_sum
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,s=0;
n=sc.nextInt();
for(int i=1;i<=n;i++)
s+=i;
System.out.println("sum:"+s);
}
}
