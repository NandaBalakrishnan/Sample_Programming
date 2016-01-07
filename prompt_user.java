import java.util.*;
public class prompt_user
{
public static void main(String ar[])throws Exception
{
int no;
Scanner sc=new Scanner(System.in);
no=sc.nextInt();
System.out.println("Enter the roll numnber\n");
for(int i=1;i<=100;i++)
{
if(no>=i&&no<=i)
{
no=sc.nextInt();
}
}
System.out.println("valid input:"+no);
}
}
