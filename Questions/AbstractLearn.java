/*Create an abstract class named Person. Define an abstract method called displayInfo(). 
Create two subclasses Student and Teacher that extend the Person class. Implement the 
displayInfo() method in each subclass to display the information of a student and a
teacher, respectively. */
abstract class Person{
    String name;
    int age;
    String favSubjct;
    boolean knowledge;
    public Person(String name, int age, String favSubjct, boolean knowledge){
        this.name=name;
        this.age=age;
        this.favSubjct=favSubjct;
        this.knowledge=knowledge;
    }
    public abstract void displayInfo();
}
class Teacher extends Person{
    public Teacher(String name, int age, String favSubjct, boolean knowledge){
        super(name,age,favSubjct,knowledge);
    }
    public void displayInfo(){
        System.out.println("The name is:"+name);
        System.out.println("The age is:"+age);
        System.out.println("The favSubject is:"+favSubjct);
        System.out.println("The knowledge is:"+knowledge);
    }
}
class Student extends Person{
    public Student(String name, int age, String favSubjct, boolean knowledge) {
        super(name,age,favSubjct,knowledge);
    }
    public void displayInfo(){
        System.out.println("The name is:"+name);
        System.out.println("The age is:"+age);
        System.out.println("The favSubject is:"+favSubjct);
        System.out.println("The knowledge is:"+knowledge);
    }
}
class AbstractLearn{
    public static void main(String[] args) {
        Teacher t= new Teacher("Manisha",20,"Physics",true);
        Student s = new Student("Ayush", 18, "Maths", false);
        t.displayInfo();
        s.displayInfo();
    }
}