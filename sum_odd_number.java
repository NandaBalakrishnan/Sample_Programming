import java.util.*;
public class sum_odd_number
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int s=0;
for(int i=1;i<=15;i++)
s+=i;
for(int i=15;i<=45;i++)
{
if(i%2!=0)
s+=i;
}
System.out.println("sum:"+s);
}
}
