import java.util.*;
class MarksOutOfBoundsException extends Exception
{
	public MarksOutOfBoundsException(String s)
	{
		System.out.println(s);
	}
}
class CreateException
{
	public static void check(int a) throws MarksOutOfBoundsException //or Exception
	{
		if(a<0 || a>100)
			throw new MarksOutOfBoundsException("Invalid Marks");
		else
			System.out.println("Your marks is valid "+a);
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=obj.nextInt();
		try{
			check(marks);
		}
		catch(MarksOutOfBoundsException e){
			System.out.println(e);
		}
	}
}
