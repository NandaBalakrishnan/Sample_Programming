import java.util.*;

public class rotate_letter_m {
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
String p=sc.next();
char c[]=p.toCharArray();
char d[]=new char[c.length];
int j=0;
for(int i=k;i<c.length-1;i++)
    d[j++]=c[i];
for(int i=0;i<k;i++)
    d[j++]=c[i];
d[j++]='\0';
String q=String.copyValueOf(d);
System.out.println("result:"+q);
}
}
