import java.util.*;
public class climbing
{
public static void main(String ar[])throws Exception
{
climbing c=new climbing();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int res=c.countways(n+1);
System.out.println("result:"+res);
}
int countways(int m)
{
if(m<=1)
return m;
return countways(m-1)+countways(m-2);
}

}
