import java.util.*;
public class count_alpha_number_char
{
public static void main(String ar[])throws Exception
{
int n=0,a=0;//number and characters
Scanner sc=new Scanner(System.in);
String p=new String();//string
p=sc.next();
char c[]=p.toCharArray();//convert string to character
for(int i=0;i<c.length;i++)
{
if(c[i]-'0'>=0&&c[i]-'0'<=9)
n++;
if(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z')
a++;
}
System.out.println("Number of numerical is"+n);
System.out.println("Number of Character is:"+a);
}
}
