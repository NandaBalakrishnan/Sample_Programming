import java.util.*;
public class remove_character {
    public static void main(String ar[])throws Exception
    {
    Scanner sc=new Scanner(System.in);
    String p,q;
    p=sc.next();
    q=sc.next();
    char c[]=p.toCharArray();
    char d[]=q.toCharArray();
    char e[]=new char[c.length+d.length];
    int k=0;
    for(int i=0;i<d.length;i++)
    {
    for(int j=0;j<c.length;j++)
    {
    if(d[i]==c[j])
    {
        System.out.println(c[j]);
        c[j]=' ';
    }
    }
    }
    for(int i=0;i<c.length;i++)
    {
    if(c[i]!=' ')
    {
        e[k++]=c[i];
    System.out.println(e[k]);
    }
    }
    e[k++]='\0';
    String s=String.copyValueOf(e);
    System.out.println("result"+s);
    }
}
