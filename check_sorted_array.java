import java.util.*;
public class check_sorted_array
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n;i++)
{
if(a[i]>a[i+1])
continue;
else
System.out.println("not in shorted order");
}
System.out.println("sorted order");
}
}
