class UnderAgeException extends Exception{
	UnderAgeException(String e){
		System.out.println(e);
	}
}
public class UserDefined{
	public static void main(String[] args) {
		vote(12);
	}
	public static void vote(int age) throws UnderAgeException{
		if(age<18){
			throw new UnderAgeException("Cannot vote");
		}
		else
			System.out.println("Elligible for vote");
	} 
}