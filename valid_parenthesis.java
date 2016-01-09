import java.util.*;
public class valid_parenthesis
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
String p=new String();
p=sc.next();
int count=0;
char c[]=p.toCharArray();
for(int i=0;i<c.length;i++)
{
if(c[i]=='(')
{
if(c[i+1]==')')
{
count++;
}
}
}
System.out.println("count:"+count*2);
}
}
