import java.util.*;

class RecursiveSquare
{
	int square(int x, int n)
	{
		if(n>0)
		{
			return x*square(x,n-1);
		}
		return 1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and power:");
		int x=sc.nextInt();
		int n=sc.nextInt();
		RecursiveSquare rs = new RecursiveSquare();
            System.out.println("Value of x^n is " + rs.square(x, n));
	}
}