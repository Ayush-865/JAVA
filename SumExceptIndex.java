import java.util.*;

class SumExceptIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] ans = new int[100];
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        for(int i=0; i<n; i++) {
            ans[i] = sum - arr[i];
            System.out.print(ans[i] + " ");
        }
    }
}
