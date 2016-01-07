import java.util.*;
public class strcat
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
String p=new String();
String q=new String();
char c[]=p.toCharArray();
char d[]=p.toCharArray();
char e[]=new char(c.length+d.length);
for(int i=0;i<c.length;i++)
e[i]=c[i];
for(j=i;j<d.length;j++)
e[i]=d[i];
e[i]='\0';
String l=String.copyvalueOf(e);
System.out.println("concatenation of two String is"+l);
}
}
