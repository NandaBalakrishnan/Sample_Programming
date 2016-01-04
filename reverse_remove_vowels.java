import java.util.*;
public class reverse_remove_vowels 
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
char b[]=new char[c.length()];
j=0;
for(int i=0;i<c.length();i++)
{
if(c[i]!='a'||c[i]!='e'||c[i]!='i'||c[i]!='o'||c[i]!='u'||c[i]!='A'||c[i]!='E'||c[i]!='I'||c[i]!='O'||c[i]!='U')
{
b[j++]=c[i];
}
}
b[j++]='\0';
String p=String.copyValueOf(b);

System.out.println("Reverse string and After removal of vowels is:"+p);
}
}
