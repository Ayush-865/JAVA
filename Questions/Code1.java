/*Create an abstract class named BankAccount. Define an abstract method called 
withdraw(). Create two subclasses SavingsAccount and CheckingAccount that extend the 
BankAccount class. Implement the withdraw() method in each subclass to withdraw
money from a savings account and a checking account, respectively. */
abstract class BankAccount{
    
    public abstract void withdraw(int x);
}
class SavingsAccount extends BankAccount{
    public void withdraw(int x) {
        System.out.println("The amount withdrawn from Savings account is: "+x);
    }
}
class CheckingAccount extends BankAccount{
    public void withdraw(int x) {
        System.out.println("We are checking account ");
    }
}
public class Code1 {
    public static void main(String[] args) {
        SavingsAccount sa= new SavingsAccount();
        CheckingAccount ca = new CheckingAccount();  
        sa.withdraw(100000);
        ca.withdraw(100);     
    }
}
 