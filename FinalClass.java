final class A
{
	public final void show()
	{
		System.out.println("In A class");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("In B class");
	}
}
class FinalClass
{
	public static void main(String[] args)
	{
		B obj=new B();
		obj.show();
	}
}
