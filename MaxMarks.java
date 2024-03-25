import java.util.*;

class MaxMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][4];
        int[] max = new int[100];
        int highest = 0;
        int index = -1;
        System.out.println("Enter no of students");
        int n = sc.nextInt();
        System.out.println("Enter elements of Table");
        for(int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            arr[i][3] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            max[i] = arr[i][1] + arr[i][2] + arr[i][3];
            if(max[i] > highest) {
                highest = max[i];
                index = i;
            }
        }
        System.out.println("The highest marks are "+highest+" of roll no "+arr[index][0]);
    }
}
