/*.
A. Consider following simplified representation of a College Admission system and 
implement it using dynamic method dispatch.
1. Applicant (Superclass):
• Properties: name, age
• Methods: checkEligibility(), displayDetails()
2. UndergraduateApplicant (Subclass):
• Properties: highSchoolGPA, standardizedTestScore
• Methods: checkEligibility() (overrides the superclass method)
3. GraduateApplicant (Subclass):
• Properties: bachelorDegree, workExperience
• Methods: checkEligibility() (overrides the superclass method)
Create objects of both the UndergraduateApplicant and GraduateApplicant classes 
and refer to them using a common Applicant reference. Invoke overridden methods 
based on the actual object type, such as calling checkEligibility() to check the 
eligibility of an undergraduate applicant or a graduate applicant, depending on the 
actual object being referred to
 */
class Applicant{
    String name;
    int age;
    public Applicant(String name, int age){
        this.name=name;
        this.age=age;
    }
    public boolean checkEligibility(){
        if(age>18){
            return true;
        }
        else{
            return false ;
        }
    }
    public void displayDetails(){
        System.out.println("Name is: "+ this.name);
        System.out.println("Age is: "+ this.age);
    }
}
class UndergraduateApplicant extends Applicant{
    double highSchoolGPA;
    int workExperience;
    public UndergraduateApplicant(String name, int age, double highSchoolGPA, int workExperience){
        super(name,age);
        this.highSchoolGPA=highSchoolGPA;
        this.workExperience=workExperience;
    }
    public boolean checkEligibility(){
        if(highSchoolGPA>9 && workExperience>3){
            return true;
        }
        else{
            return false;
        }
    }
}
class GraduateApplicant extends Applicant{
    boolean bachelorDegree;
    int workExperience;
    public GraduateApplicant(String name, int age, Boolean bachelorDegree, int workExperience){
        super(name,age);
        this.bachelorDegree=bachelorDegree;
        this.workExperience=workExperience;
    }
    public boolean checkEligibility(){
        if(bachelorDegree==true && workExperience>3){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Code1 {
    public static void main(String[] args) {
        UndergraduateApplicant ug = new UndergraduateApplicant("Ayush", 20, 9.80 , 5);
        GraduateApplicant ga = new GraduateApplicant("Anish", 25, true, 10);

        if(ug.checkEligibility()==true){
            System.out.println("Undergrduate Applicant is qualified");
            ug.displayDetails();
        }
        else{
            System.out.println("Undergrduate Applicant is not qualified");
        }
        if(ga.checkEligibility()==true){
            System.out.println("GraduateApplicant is qualified");
            ga.displayDetails();
        }
        else{
            System.out.println("GraduateApplicant is not qualified");
        }
    }
}
