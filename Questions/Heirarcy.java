/*WAP to demonstrate the following hierarchy where student class having variables Sapid, Name, and 
Roll no. and class science, commerce and arts will be having variables to read marks of three subject of 
respective scheme using readMarks() method and display result of each stream student using display() 
method in each subclass */
class Student{
    int sapid, rollno;
    String name;
    Student(int sapid, int rollno, String name){
        this.sapid=sapid;
        this.rollno=rollno;
        this.name=name;
    }
}
class Science extends Student{
    int marks;
    public Science(int sapid, int rollno, String name){
        super(sapid, rollno, name);
    }
    void getMarks(int marks){
        this.marks=marks;
    }
    void showMarks(){
        System.out.println("The marks of Science student is: "+marks);
    }
}
class Commerce extends Student{
    int marks;
    public Commerce(int sapid, int rollno, String name){
        super(sapid, rollno, name);
    }
    void getMarks(int marks){
        this.marks=marks;
    }
    void showMarks(){
        System.out.println("The marks of Commerce student is: "+marks);
    }
}
class Arts extends Student{
    int marks;
    public Arts(int sapid, int rollno, String name){
        super(sapid, rollno, name);
    }
    void getMarks(int marks){
        this.marks=marks;
    }
    void showMarks(){
        System.out.println("The marks of Arts student is: "+marks);
    }
}
public class Heirarcy {
    public static void main(String[] args) {
        Science s= new Science(6000322, 25, "Ayush");
        Commerce c= new Commerce(7000, 20, "Abhishek");
        Arts a =new Arts(8000, 50, "Joe");
        s.getMarks(100);
        c.getMarks(90);
        a.getMarks(45);
        s.showMarks();
        c.showMarks();
        a.showMarks();
    }
}
