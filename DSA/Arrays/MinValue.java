package DSA.Arrays;
import java.util.Scanner;
public class MinValue {
    // Mix Value
    public static void min(int arr[]) {
        // Assume
        int min_Value = arr[0];

        // Access every element
        for (int i = 1; i < arr.length; i++) {
            // compare with max value
            if (min_Value > arr[i]) {
                min_Value = arr[i];
            }
        }
        System.out.println("Min value in this Array is " + min_Value);
    }
    public static void main(String[] args) {
        // Create an by taking Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an arry: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Validate Check
        if (arr.length > 1) {
            // Access every index to take input
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the value in " + i + " index: ");
                arr[i] = sc.nextInt();
            }
            min(arr);
        } else {
            System.out.println("Please Increase the Length of an Array");
        }

       sc.close();
    }
}
