import java.util.*;

class Staff
{
	int code;
	String name;
	Scanner sc = new Scanner (System.in);
}
class Teacher extends Staff
{
	String subject;
	int experience;
	public void read()
	{
		System.out.println("Enter name of the teacher: ");
		name=sc.nextLine();
		System.out.println("Enter code of the teacher: ");
		code=sc.nextInt();
		sc.nextLine(); // Consume the newline character
		System.out.println("Enter subject of the teacher: ");
		subject=sc.nextLine();
		System.out.println("Enter years of experience of the teacher: ");
		experience=sc.nextInt();
		System.out.println("");
	}
	public void display(){
		System.out.println("The name of the teacher is: "+name);
		System.out.println("The code of the teacher is: "+code);
		System.out.println("The subject of the teacher is: "+subject);
		System.out.println("The years of experience of the teacher is: "+experience);
	}
}
class Officer extends Staff{
	String grade;
	String department;
	public void read(){
		System.out.println("Enter name of the Officer: ");
		name=sc.nextLine();
		System.out.println("Enter code of the Officer: ");
		code=sc.nextInt();
		sc.nextLine(); // Consume the newline character
		System.out.println("Enter grade of the officer: ");
		grade=sc.nextLine();
		System.out.println("Enter department of the officer: ");
		department=sc.nextLine();
		System.out.println("");
	}
	public void display(){
		System.out.println("The name of the Officer is: "+name);
		System.out.println("The code of the Officer is: "+code);
		System.out.println("The grade of the Officer is: "+grade);
		System.out.println("The department of the Officer is: "+department);
	}
}
class Typist extends SStaff
{
	int speed;
	int experience;
}

class Regular extends Typist
{
	int salary;
	public void read()
	{
		System.out.println("Enter name of the Regular Typist: ");
		name=sc.nextLine();
		System.out.println("Enter code of the Regular Typist: ");
		code=sc.nextInt();
		System.out.println("Enter speed of the Regular Typist: ");
		speed=sc.nextInt();
		System.out.println("Enter years of experience of the Regular Typist: ");
		experience=sc.nextInt();
		System.out.println("Enter salary of the Regular Typist: ");
		salary=sc.nextInt();
		System.out.println("");
	}
	public void display()
	{
		System.out.println("The name of the Regular Typist is: "+name);
		System.out.println("The code of the Regular Typist is: "+code);
		System.out.println("The speed of the Regular Typist is: "+speed);
		System.out.println("The years of experience of the Regular Typist is: "+experience);
		System.out.println("The salary of the Regular Typist is: "+salary);
	}
}
class Casual extends Typist
{
	int dailywages;
	public void read()
	{
		System.out.println("Enter name of the Casual Typist: ");
		name=sc.nextLine();
		System.out.println("Enter code of the Casual Typist: ");
		code=sc.nextInt();
		System.out.println("Enter speed of the Casual Typist: ");
		speed=sc.nextInt();
		System.out.println("Enter years of experience of the Casual Typist: ");
		experience=sc.nextInt();
		System.out.println("Enter daily wages of the Casual Typist: ");
		dailywages=sc.nextInt();
		System.out.println("");
	}
	public void display()
	{
		System.out.println("The name of the Casual Typist is: "+name);
		System.out.println("The code of the Casual Typist is: "+code);
		System.out.println("The speed of the Casual Typist is: "+speed);
		System.out.println("The years of experience of the Casual Typist is: "+experience);
		System.out.println("The dailt wages of the Casual Typist is: "+dailywages);
	}
}
public class Student{
	public static void main(String[] args) 
	{
		Teacher t= new Teacher();
		Officer o = new Officer();
		Regular r = new Regular();
		Casual c = new Casual();
		t.read();
		o.read();
		r.read();
		c.read();
		System.out.println("");
		t.display();
		System.out.println("");
		o.display();
		System.out.println("");
		r.display();
		System.out.println("");
		c.display();
	}
}