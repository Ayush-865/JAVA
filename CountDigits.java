import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println("The number has " + count + " digits.");
    }
}
