import java.util.*;

class MethodOverloading
{
	int area(int l)
	{
		return l*l;
	}
	int area(int l, int b)
	{
		return l*b;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		MethodOverloading obj = new MethodOverloading();
		System.out.println("Enter side of square: ");
		int side=sc.nextInt();
		System.out.println("Enter length and width of rectangle:");
		int length=sc.nextInt();
		int width=sc.nextInt();
		System.out.println("The area of square is "+obj.area(side));
		System.out.println("The area of rectngle is "+obj.area(length,width));
	}
}
