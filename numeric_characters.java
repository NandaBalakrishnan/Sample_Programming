import java.util.*;
public class numeric_characters
{
public static void main(String ar[])throws Exception
{
int k=0;
Scanner sc=new Scanner(System.in);
String p=new String();
p=sc.next();
char c[]=p.toCharArray();
for(int i=0;i<c.length;i++)
{
if(c[i]-'0'>=0&&c[i]-'0'<=9)
k++;
}
System.out.println("number of numeric characters is:"+k);
}
}
