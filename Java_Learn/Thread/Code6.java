/*Write a Java program to calculate the salaries of different types of employees using 
dynamic method dispatch. Create a base class called "Employee" with a method called 
"calculateSalary()" that returns zero. Derive classes such as "Manager," "Engineer," and 
"Salesperson" from the Employee class and override the "calculateSalary()" method in 
each derived class to calculate the salary based on the employee's specific role. 
Demonstrate dynamic method dispatch by creating objects of each class and calling the 
"calculateSalary()" method for different employees. */
class Employee {
    String name;
    Employee(String name){
        this.name=name;
    }
    public int calculateSalary(){
        return 0;
    }
}
class Manager extends Employee{
    int salary;
    Manager(String name, int salary){
        super(name);
        this.salary=salary;
    }
    public int calculateSalary(){
        return salary;
    }
}
class Engineer extends Employee{
    int salary;
    Engineer(String name, int salary){
        super(name);
        this.salary=salary;
    }
    public int calculateSalary(){
        return salary;
    }
}
class Salesperson extends Employee{
    int salary;
    Salesperson(String name, int salary){
        super(name);
        this.salary=salary;
    }
    public int calculateSalary(){
        return salary;
    }
}
public class Code6 {

    public static void main(String[] args) {
        Employee obj1 = new Engineer("Ayush", 100000);
        Employee obj2=new Manager("Avait", 200000);
        Employee obj3=new Salesperson("Joe", 300000);
        System.out.println("Salary of Engineer is :"+obj1.calculateSalary());
        System.out.println("Salary of Manager is :"+obj2.calculateSalary());
        System.out.println("Salary of SalesPerson is :"+obj3.calculateSalary());
    }
}
