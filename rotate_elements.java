import java.util.*;
public class rotate_elements
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,k;
n=sc.nextInt();//number of elements
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();//read array
k=sc.nextInt();//rotate right by k steps
for(int i=k;i<n;i++)//print elements from k to n
System.out.println(a[i]);
for(int i=0;i<k;i++)//print elements from 0 to n
System.out.println(a[i]);
}
}
