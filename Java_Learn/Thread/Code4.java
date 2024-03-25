/*WAP to Create Super class DJSCE having parameterised Constructor with fields Sap_ID and Division 
and abstract method getStudentInfo(). Create sub class with name Department of super class 
DJSCE which will override getStudentInfo() from superclass & which can get details of an students 
like his rollNo,name, class & Pointr etc.
Use super() method to access the Super class constructor to assign sap Id and division to student.
Create Subclass of Department with name Students and display all the details of studnets using method 
DisplayStudentInfo(). */
abstract class DJSCE {
    protected String sapID;
    protected String division;

    public DJSCE(String sapID, String division) {
        this.sapID = sapID;
        this.division = division;
    }

    public abstract void getStudentInfo();
}

class Department extends DJSCE {
    private int rollNo;
    private String name;
    private String className;
    private double point;

    public Department(String sapID, String division, int rollNo, String name, String className, double point) {
        super(sapID, division);
        this.rollNo = rollNo;
        this.name = name;
        this.className = className;
        this.point = point;
    }

    @Override
    public void getStudentInfo() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Point: " + point);
    }
}

class Students extends Department {
    public Students(String sapID, String division, int rollNo, String name, String className, double point) {
        super(sapID, division, rollNo, name, className, point);
    }

    public void displayStudentInfo() {
        System.out.println("Student Information:");
        super.getStudentInfo();
    }
}

public class Code4 {
    public static void main(String[] args) {
        Students student = new Students("2021001", "A", 1, "John Doe", "10th", 4.5);
        student.displayStudentInfo();
    }
}
