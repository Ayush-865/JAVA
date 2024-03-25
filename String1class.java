//Dhruv Mehta
//SAP-ID:60004220100
import java.util.Scanner;
public class string1class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter A String: ");
        String s=sc.nextLine();
        int i = 0,up=0,lo=0,bs=0,d=0;

for(i=0;i<s.length();i++)
        {char ch=s.charAt(i);
            if(ch>='a' &&ch<='z')
            {
                lo++;
            }
            else if(ch>='A' &&ch<='Z')
            {
                up++;
            }
            else if(ch>='0' &&ch<='9')
            {
                d++;
            }

            else
            {
                bs++;
            }
        }
System.out.println("Upper Case Letters: " + up);
System.out.println("Lower Case Letters: " + lo);
System.out.println("Digits: " + d);
System.out.println("Blank Spaces: " + bs);
    }
}
