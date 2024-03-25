import java.util.*;
class input
{
static int n,a[];
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
a=new int[n];
fibo f=new fibo();
Thread t=new Thread(f);
t.start();
int ctr=0;
while(t.isAlive())
{
try
{
System.out.print(ctr++);
Thread.sleep(1);
}
catch(Exception e)
{
}
}
for(int i=1;i<n;i++)
{
System.out.print(" "+a[i]);
}
}
}
class fibo extends input implements Runnable
{
public void run()
{
a[0]=0;
a[1]=1;
for(int i=2;i<n;i++)
{
a[i]=a[i-1]+a[i-2];
}
}
}