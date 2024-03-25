import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "this is toString()";
    }
    public String getMessage(){
        return "this is getMessage";
    }
}
public class Exception1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0){
            try{
                throw new ArithmeticException("This is exception");
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }
        else{
                try{
                    throw new MyException();
                }
                catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                }
        }

    }
}
