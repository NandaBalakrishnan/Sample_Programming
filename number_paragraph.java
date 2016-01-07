import java.util.*;
public class number_paragraph
{
public static void main(String ar[])throws Exception
{
int lines=0;
Scanner sc=new Scanner(System.in);
String p=String();
p=sc.next();
if(p.length==0)
System.out.println("number of lines in the paragraph is:1");
char c[]=p.toCharArray();
for(int i=0;i<c.length;i++)
{
if(c[i]-'0'=='\n'||c[i]-'0'=='\r')
lines++;
}
System.out.println("number of lines in the paragraph:"+lines);
}
}
