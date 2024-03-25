/*Create an abstract class named BankAccount. Define an abstract method called 
withdraw(). Create two subclasses SavingsAccount and CheckingAccount that extend the 
BankAccount class. Implement the withdraw() method in each subclass to withdraw
money from a savings account and a checking account, respectively. */
public abstract class BankAccount{
    
    public abstract void withdraw(int x);
}
public class SavingsAccount extends BankAccount{
    public void withdraw(int x) {
        System.out.println("The amount withdrawn from Savings account is: "+x);
    }
}
public class CheckingAccount extends BankAccount{
    public void withdraw(int x) {
        System.out.println("The amount withdrawn from Savings account is: "+x);
    }
}
public class Code2 {
    public static void main(String[] args) {
        
    }
}
