class Circle
{
	public void display()
	{
		System.out.println("This s a circle");
	}
}
class Deletion
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.display();
		c=null;
		System.gc();
		System.out.println("Object is deleted");
		//c.display();
	}
}