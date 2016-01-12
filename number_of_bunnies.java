import java.util.*;
public class number_of_bunnies
{
int s=0;
public static void main(String ar[])throws Exception
{
   int res;
number_of_bunnies k=new number_of_bunnies();
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
res=k.number(n);
System.out.println("result:"+res);
}
public int number(int n1)
{
if(n1>0)
{
    s+=2;

    number(n1-1);

}
return s;
}
}
