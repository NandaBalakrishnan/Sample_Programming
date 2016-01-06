import java.util.*;
public class identical_characters {
    public static void main(String ar[])
    {
        int j=0;
    Scanner sc=new Scanner(System.in);
String p=new String();
p=sc.next();
char c[]=p.toCharArray();
char d[]=new char[100];
int n=c.length;
for(int i=0;i<n-1;i++)
{
   
if(c[i]==c[i+1])
{
   d[j++]=c[i];
d[j++]='*';

}
   
else if(i!=n)
{
d[j++]=c[i];

}
  }
d[j++]=c[n-1];
String s=String.copyValueOf(d);
System.out.println(d);
}
}
