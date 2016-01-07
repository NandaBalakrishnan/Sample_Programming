import java.util.*;
public class special_character
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
String p=new String();
int k=0;
p=sc.next();
char c[]=p.toCharArray();
for(int i=0;i<c.length;i++)
{
if(c[i]-'0'>=10&&c[i]-'0'<=32)
k++;
}
System.out.println("number of special characters is:"+k);
}
}
