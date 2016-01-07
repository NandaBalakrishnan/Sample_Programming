import java.util.*;
public class swap_bitwise
{
public static void main(String ar[])throws Exception
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Before Swapping:a="+a+"\tb="+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("After Swapping:a="+a+"\tb="+b);
}
}
