import java.util.*;
public class number_of_words
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
String p=new String();
p=sc.next();
String q[]=p.split("\\s");
System.out.println("number of words in a given line is:"+q.length);
}
}
