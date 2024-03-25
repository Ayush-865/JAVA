import java.util.Scanner;

class CountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int upperCount = 0, lowerCount = 0, spaceCount = 0, digitCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (ch == ' ') {
                spaceCount++;
            }
        }
        
        System.out.println("Uppercase characters: " + upperCount);
        System.out.println("Lowercase characters: " + lowerCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Spaces: " + spaceCount);
    }
}
