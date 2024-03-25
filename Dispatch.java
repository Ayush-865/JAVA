class A
{
	int a=89;
	public void display1()
	{
		System.out.println("In A class");
	}
}
class B extends A
{
	public void display2()
	{
		System.out.println("In A class");
	} 
}
class Dispatch
{
	public static void main(String[] args)
	{
		A obj=new B();
		obj.display1();
		System.out.println(obj.a);
	}
}
