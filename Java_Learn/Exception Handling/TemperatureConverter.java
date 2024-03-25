import java.util.*;
class InvalidTemperatureException extends Exception{
	InvalidTemperatureException(String s){
		System.out.println(s);
	}
}
class InvalidConversionException extends Exception{
	InvalidConversionException(String s){
		System.out.println(s);
	}
}
class TemperatureConverter{
	public static void convertToFahrenheit(double x) throws InvalidConversionException{
		double answer= (9.0/5.0)*(x)+32;
		if(answer<-459.67){
			throw new InvalidConversionException("Invalid calculation");
		}
		else{
			System.out.println(answer);
		}
	}
	public static void main(String[] args) throws InvalidTemperatureException, InvalidConversionException{
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		if(a<-273.15){
			throw new InvalidTemperatureException("Enter valid temp");
		}
		else{
			convertToFahrenheit(a);
		}
	}
}