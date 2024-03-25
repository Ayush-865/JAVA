import java.util.*;
class ExceptionArray
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		try
		{
			System.out.println(arr[7]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End of program");
	}
}