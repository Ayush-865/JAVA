import java.util.*;

class StudentNames
{
    public static void main(String[] args)
    {
        Vector<String> names = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students");
        int n = sc.nextInt();
        System.out.println("Enter names of students");
        for(int i=0; i<n; i++)
        {
            names.add(sc.next());
        }
        System.out.println("Printing names of students");
        for(int i=0; i<n; i++)
        {
            System.out.println(names.get(i)+" ");
        }
    }
}
