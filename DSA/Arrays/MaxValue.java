package DSA.Arrays;

import java.util.Scanner;

public class MaxValue {
    // Max Value
    public static void max(int arr[]) {
        // Assume
        int max_Value = arr[0];

        // Access every element
        for (int i = 1; i < arr.length; i++) {
            // compare with max value
            if (max_Value < arr[i]) {
                max_Value = arr[i];
            }
        }
        System.out.println("Max value in this Array is " + max_Value);
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
            max(arr);
        } else {
            System.out.println("Please Increase the Length of an Array");
        }

       sc.close();
    }
}
