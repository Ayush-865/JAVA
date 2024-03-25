import java.util.*;

class Base
{
	float r;
	public Base()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		r=sc.nextFloat();
	}
}

class Der extends Base
{
	float area;
	public Der()
	{
		area=3.14f*r*r;
		System.out.println("Area of Circle = "+area);
	}
}

class SDer extends Der
{
	float vol;
	public SDer()
	{
		vol=4*r/3*area;
		System.out.println("volume of Sphere = "+vol);
	}
}

class Inheritance
{
	public static void main(String args[])
	{
		SDer d=new SDer();
	}
}