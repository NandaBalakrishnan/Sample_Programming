import java.util.*;
public class prime_number_or_not
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int no,c=0;
no=sc.nextInt();
for(int i=1;i<=no;i++)
{
if(no%i==0)
c++;
}
if(c==2)
System.out.println("prime number\n");
else
System.out.println("not a prime number");
}
}
