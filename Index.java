import java.io.*;
public class Index
{
public static void main(String ar[])throws Exception
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int ar[]=new int[n];
for(i=0;i<n;i++)
ar[i]=sc.nextInt();
for(i=0;i<n;i++)
{
if(ar[i]==i)
System.out.println("the number"+ar[i]+"is equals to its index"+i);
}
}
}
