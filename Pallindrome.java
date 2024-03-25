import java.util.Scanner;

class Pallindrome {
    public static void main(String[] args) {
        String str = "abbba";
        int l = 0;
        int h = str.length() - 1;
        int flag = 0;
        while (h > l) {
            if (str.charAt(l++) != str.charAt(h--)) {
                System.out.println(str + " is not a palindrome");
                return;
            } else {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println(str + " is a palindrome");
        }
    }
}

