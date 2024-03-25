import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();
        System.out.print("Enter a character to count: ");
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Frequency of character " + ch + " in the given line of text is " + count);
    }
}
