/*WAP to Create Super class RBIBank having parameterised Constructor with fields IFSC_code, Location 
and abstract method getBankDetails(). Create 2 Subclass SBIBank & AXISBank which will override 
getBankDetails() from superclass & which can get details of Bank like, bankName, homeLoanROI, 
numberOfCustomers, numberOfEmployees etc.
Use super() method to access the Super class constructor to assign IFSC_code and location to each bank.
Display Both Bank Details details by displayBankInfo() method in each subclass.
 */
abstract class RBIbank{
    String ifsc_code;
    String location;
    public RBIbank(String ifsc_code, String location){
        this.ifsc_code=ifsc_code;
        this.location=location;
    }
    public abstract void getBankDetails(String bankname, double homeLoanROI, int numberOfCustomers, int numberOfEmployees);
    public abstract void displayBankInfo();
}
class SBI extends RBIbank{
    String bankname;
    double homeLoanROI;
    int numberOfCustomers, numberOfEmployees;
    public SBI(String ifsc_code, String location){
        super(ifsc_code, location);
    }
    public void getBankDetails(String bankname, double homeLoanROI, int numberOfCustomers, int numberOfEmployees){
        this.bankname=bankname;
        this.homeLoanROI=homeLoanROI;
        this.numberOfCustomers=numberOfCustomers;
        this.numberOfEmployees=numberOfEmployees;
    }
    public void displayBankInfo(){
        System.out.println("ifsc code is "+ifsc_code);
        System.out.println("location is  "+location);
        System.out.println("bankname is "+bankname);
        System.out.println("homeLoanROI is "+homeLoanROI);
        System.out.println("number of customers  is "+numberOfCustomers);
        System.out.println("number of employees is "+numberOfEmployees+"\n");
    }
}
class AxisBank extends RBIbank{
    String bankname;
    double homeLoanROI;
    int numberOfCustomers, numberOfEmployees;
    public AxisBank(String ifsc_code, String location){
        super(ifsc_code, location);
    }
    public void getBankDetails(String bankname, double homeLoanROI, int numberOfCustomers, int numberOfEmployees){
        this.bankname=bankname;
        this.homeLoanROI=homeLoanROI;
        this.numberOfCustomers=numberOfCustomers;
        this.numberOfEmployees=numberOfEmployees;
    }
    public void displayBankInfo(){
        System.out.println("ifsc code is "+ifsc_code);
        System.out.println("location is  "+location);
        System.out.println("bankname is "+bankname);
        System.out.println("homeLoanROI is "+homeLoanROI);
        System.out.println("number of customers  is "+numberOfCustomers);
        System.out.println("number of employees is "+numberOfEmployees);
    }
}
public class Code5 {
    public static void main(String[] args) {
        RBIbank obj1 = new SBI("SBI0000", "Vasai");
        RBIbank obj2 = new AxisBank("AXIS0000", "Mumbai");
        obj1.getBankDetails("SBI", 9.2, 10000000, 10000);
        obj2.getBankDetails("AxisBank", 9.8, 100000, 5000);
        obj1.displayBankInfo();
        obj2.displayBankInfo();
    }
}
