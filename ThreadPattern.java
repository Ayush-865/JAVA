class A extends Thread
{
	public void run() 
	{
		try{
				for(int i=1;i<=8;i++)
				{
					System.out.print("/");
					Thread.sleep(498);
				}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		try{
			for(int i=1;i<=8;i++)
			{
				System.out.print("*");
				Thread.sleep(498);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
class ThreadPattern
{
	public static void main(String[] args) 
	{
		A obj1=new A();
		obj1.start();
		B obj2=new B();
		obj2.start();
	}
}
