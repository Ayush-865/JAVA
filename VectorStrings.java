import java.util.*;

class VectorStrings
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Vector<String> vec = new Vector<String>();
             int n;
             System.out.println("Enter the number of strings: ");
             n = sc.nextInt();
		System.out.println("Enter the string elements of vector: ");
		for(int i=0; i<=n; i++)
		{
			vec.add(sc.nextLine());
		}
		System.out.print("Enter new string: ");
		String newStr = sc.nextLine();
		if (vec.contains(newStr))
		{
			vec.remove(newStr);
			System.out.print(newStr+" is removed");
			System.out.print(vec);
		}
		else
		{
			vec.add(newStr);
			System.out.print(newStr+" is added");
			System.out.print(vec);
		}
	}
}
