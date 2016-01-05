import java.util.*;
public class Average
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,sum=0;
float avg=0.0;
n=sc.nextInt();
int no[]=new int[100];
for(int i=0;i<n;i++)
{
no[i]=sc.nextInt();
sum+=no[i];
}
avg=sum/n;
System.out.println("average:"+avg);
}
}
