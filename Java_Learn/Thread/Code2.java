/*
 Rohan is developing software for Examination department. He has created class hierarchy as 
follows
 User(Superclass)
 Properties:name, id
 Methods:setData()
 Teacher(subclass of User)
 Properties: subject, exp;
 Method: setPaper(), chkPaper()
 TeachingAssistant(subclass of Teacher)
 Method: viewPaper(), chkPaper()
Help Rohan to decide the access specifiers for Teacher class and how can he 
prevent Teaching assistant to modify the setPaper() method?
Write template of a Teacher class.
 */
class User {
    String name, id;
    public void setData(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class Teacher extends User {
    String subject;
    int exp;

    public Teacher(String name, String id, String subject, int exp) {
        setData(name, id);
        this.subject = subject;
        this.exp = exp;
    }

    protected void setPaper() {
        System.out.println("Teacher setting Paper....");
    }

    public void chkPaper() {
        System.out.println("Teacher checking Paper....");
    }
}

class TeachingAssistant extends Teacher {
    public TeachingAssistant(String name, String id, String subject, int exp) {
        super(name, id, subject, exp);
    }

    @Override
    final public void setPaper() {
        System.out.println("Teaching Assistant cannot modify setPaper() method.");
    }

    public void viewPaper() {
        System.out.println("Assistant Teacher viewing Paper....");
    }

    public void chkPaper() {
        super.chkPaper();
        System.out.println("Assistant Teacher checking Paper....");
    }
}

public class Code2 {
    public static void main(String[] args) {
        Teacher obj1 = new Teacher("Anish", "100", "Math", 5);
        TeachingAssistant obj2 = new TeachingAssistant("Ayush", "101", "Physics", 1);
        // Accessing methods
        obj1.setPaper(); // Output: Teacher setting Paper....
        obj2.setPaper(); // Output: Teaching Assistant cannot modify setPaper() method.
        obj2.viewPaper(); // Output: Assistant Teacher viewing Paper....
        obj2.chkPaper(); // Output: Teacher checking Paper....\nAssistant Teacher checking Paper....
    }
}
