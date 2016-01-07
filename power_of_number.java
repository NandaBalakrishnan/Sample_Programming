import java.util.*;
public power_of_number
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int no,pow,ans=1;
no=sc.nextInt();
pow=sc.nextInt();
for(int i=0;i<pow;i++)
{
ans*=no;
}
System.out.println("power of given number is:"+ans);
}
}
