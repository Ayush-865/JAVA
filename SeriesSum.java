import java.util.*;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * i);
        }

        System.out.println("Sum of the series: " + sum);
    }
}
