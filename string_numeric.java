import java.util.*;
public class string_numeric
{
public static void main(String ar[])
{
String a;
int count=0;
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
char c[]=a.toCharArray();
for(int i=0;i<c.length;i++)
{
if(((c[i]>(c[i]-'0'))&&((c[i]-'0')<9))||c[i]=='e'||c[i]=='.')
{
count++;
}
}
if(count==a.length())
System.out.println("true");
else
System.out.println("false");
}
}
