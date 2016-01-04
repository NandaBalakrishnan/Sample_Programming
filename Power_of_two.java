import java.util.*;
public class Power_of_two
{
public static void main(String ar[])throws Exception
{
int n;
String p;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
p=power(n);
System.out.println("given number is"+p+"a power of 2");
}
public String power(int no)
{
if(no==0)
return "not";
while(no!=1)
{
if(no%2!=0)
return "not";
n/=2;
}
return "";
}
}
