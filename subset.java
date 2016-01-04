import java.util.*;
public class subset
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,m,t=0;
n=sc.nextInt();
m=sc.nextInt();
int a[]=new int[n];
int b[]=new int[m];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int j=0;j<m;j++)
b[j]=sc.nextInt();

for(int i=0;i<b.length;i++)
{
for(int j=0;j<a.length;j++)
{
if(b[i]==a[j])
t++;
}
}
if(t==b.length)
System.out.println(" array b is a subset of array a");
else
System.out.println("not");
}
}
