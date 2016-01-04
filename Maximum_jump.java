import java.util.*;
public class Maximum_jump
{
public static void main(String ar[])throws Exception 
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++)
ar[i]=sc.nextInt();
i=1;
while(i<n-1)
{
p=ar[i];
i+=p;
}
if(i==n-1)
System.out.println("true");
else
System.out.prinltn("false");
}
}
