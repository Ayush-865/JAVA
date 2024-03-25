import java.util.*;
class TB
{
Scanner sc=new Scanner(System.in);
synchronized public void bookTicket()
{
int fare;
try
{
System.out.println("enter the fare of the ticket");
fare=sc.nextInt();
System.out.print("Processing...");
for(int i=0;i<8;i++)
{
System.out.print(".. ");
Thread.sleep(500);
}
System.out.println();
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("booking successfully confirmed");
}
}
class Passenger extends Thread
{
TB ticket;
Passenger(TB ticket)
{
this.ticket=ticket;
}
public void run()
{
ticket.bookTicket();
}
}
class BT
{
public static void main(String ar[])
{
TB obj=new TB();
Passenger p1=new Passenger(obj);
Passenger p2=new Passenger(obj);
p1.start();
p2.start();
}
}