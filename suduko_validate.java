import java.util.*;
public class suduko
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
boolean b=True;
int ar[][]=new int[9][9];
for(int i=0;i<9;i++)
{
for(int j=0;j<9;j++)
{
arr[i][j]=sc.nextInt();
}
}
int sum=0,sum1=0;
for(int i=0;i<9;i++)
{
for(int j=0;j<9;j++)
{
sum+=a[i][j];
sum1=a[j][i];
}
if(sum!=45 || sum1!=45)
{
b=False;
break
}
if(b)
System.out.println(valid);
else
System.out.println("Not a valid");


}
}
