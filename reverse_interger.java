import java.util.*;
public class Integer
{
public static void main(String ar[])throws Exception
{
int i,j,n,t;
String s=new String[200];
Scanner sc=new Scanner(System.in);
s=sc.next();
n=s.Length();
char c[]=new char[n];
s.getChars(0,n,c,0);
for(i=0,j=c.length-1;i<=c.length(),j>=c.length;i++,j--)
{
t=c[i];
c[i]=c[j];
c[j]=t;
}
String l=String.copyValueOf(c);
System.out.println(l);
}

}
