package DSA.Arrays;
import java.util.Scanner;

// Find the maximum element in an array
public class MaxValue {
    // Max Value and 2 Max value
    public static void max(int arr[]) {
        // Assume
        int max_Value = Math.max(arr[0], arr[1]);
        int max2_Value = Math.min(arr[0], arr[1]);

        // Access every element
        for (int i = 2; i < arr.length; i++) {
            // compare with max value
            if (max_Value < arr[i]) {
                max2_Value = max_Value;
                max_Value = arr[i];
            } else if (arr[i] > max2_Value & arr[i] != max_Value) {
                max2_Value = arr[i];
            }
        }
        System.out.println("First Max value in this Array is " + max_Value + " and Second Max value is " + max2_Value);
    }

    public static void main(String[] args) {
        // Create an by taking Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an arry: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Validate Check
        if (arr.length > 2) {
            // Access every index to take input
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the value in " + i + " index: ");
                arr[i] = sc.nextInt();
            }
            max(arr);
        } else {
            System.out.println("Please Increase the Length of an Array");
        }

       sc.close();
    }
}
