import java.util.*;
public class reverse
{
public static void main(String ar[])throws Exception
{
int i,j,n,t;
String a[]=new String[100];
Scanner sc=new Scanner(System.in);
a=s.next();
n=a.length();
char c[]=new char[n];
a.getchars(0,n,c,0);
for(i=0,j=c.length()-1;i<=c.length()/2,j>=c.length()/2;i++,j--)
{
t=c[i];
c[i]=c[j];
c[j]=t;
}
String p=String.copyValueOf(c);
System.out.println("Reverse string is:"+p);
}
}

