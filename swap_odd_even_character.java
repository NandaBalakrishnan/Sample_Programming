import java.util.*;
public class swap_odd_even_character
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
String p=new String();
p=sc.next();
String evenStr,oddStr;
for(int i=0;i<p.length-2;i+=2)
{
evenStr=p.charAt(i+1)+s.charAt(i);
}
if(p.length%2!=0)
{
System.out.println(evenStr+s.charAt(p.length-1));
}
else
System.out.println(evenStr);
}
}
