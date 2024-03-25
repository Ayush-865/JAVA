class Table1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(5+"*"+i+"="+5*i);
		}
	}
}
class Table2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(7+"*"+i+"="+7*i);
		}
	}
}
class Table3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(13+"*"+i+"="+13*i);
		}
	}
}
class Thread1
{
	public static void main(String[] args) throws Exception
	{
		Table1 obj1=new Table1();
		obj1.start();
		Table2 obj2=new Table2();
		obj2.start();
		Table3 obj3=new Table3();
		obj3.start();
	}
}
