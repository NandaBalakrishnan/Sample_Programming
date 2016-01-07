import java.util.*;
public class armstrong_intervals {
    public static void main(String ar[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
    int a,b,p,r,s=0,j;
    a=sc.nextInt();
    b=sc.nextInt();
    for(int i=a;i<=b;i++)
    {
        s=0;
    p=i;
    j=p;
    while(j>0)
    {
    r=j%10;
    s=s+(r*r*r);
    j/=10;
    }
    
    if(p==s)
        System.out.println(i);
    }
    }
}
