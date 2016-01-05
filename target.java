
import java.util.*;
public class target 
{
public static void main(String ar[])throws Exception
{
    int n,i,j,t;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    t=sc.nextInt();
int a[]=new int[100];
for(i=0;i<n;i++)
    a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(t==a[i]+a[j])
    System.out.println(" sum of two elements to give a target elemets is:"+a[i]+"\t"+a[j]);
}
}

}
}
