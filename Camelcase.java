import java.util.*;
public class Camelcase
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    String p=new String();
    p=sc.next();
    StringBuffer a = new StringBuffer();
   for (String s:p.split(" ")) {
    a.append(Character.toUpperCase(s.charAt(0)));
     if (s.length() > 1) {
         a.append(s.substring(1, s.length()).toLowerCase());
      }
    }
   System.out.println(a);
}
}
