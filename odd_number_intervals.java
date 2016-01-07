import java.util.*;
public class odd_number_intervals
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
for(int i=a;i<=b;i++)
{
if(i%2!=0)
System.out.println(i);
}
}
}
