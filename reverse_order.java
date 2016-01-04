import java.util.*;
public class reverse_order
{
public static void main(String ar[])throws Exception
{
String p=new String[100];
Scanner sc=new Scanner(System.in);
p=sc.next();
String q[]=p.split("\\s");
for(int i=q.length();i>=0;i--)
System.out.println(q[i]+"\t");
}
}
