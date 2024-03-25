import java.util.*;

public class Division{
	public static void performDivision(int a , int b){
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException x){
			System.out.println("Cannot divide by 0");
		}
		catch(Exception y){
			System.out.println("All error handled gracefully");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			int a = sc.nextInt();
			int b= sc.nextInt();
			performDivision(a,b);
		}
		catch(InputMismatchException z){
			System.out.println("Enter only integer");
		}
	}
}