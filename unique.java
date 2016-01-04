public class unique {
    public static void main(String ar[])throws Exception
{
int n,p;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int ar1[]=new int[n];
for(int i=0;i<n;i++)
ar1[i]=sc.nextInt();
for(int i=0;i<n;i++)
{
p=ar1[i];
for(int j=i+1;j<n;j++)
{
if(p==ar1[j])
System.out.println("first repeated integer is:"+p);
break;
}
}
}
}
