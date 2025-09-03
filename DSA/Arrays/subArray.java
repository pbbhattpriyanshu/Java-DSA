import java.util.Scanner;

public class subArray {
    public static int maxSubArr(int[] arr) {
        int maxSum = Integer.MIN_VALUE; // Better than hardcoded -9999999
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Create an Array by taking Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an arry: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Access every index to take input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value in " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        int result = maxSubArr(arr); // Store the result
        System.out.println("Maximum subarray sum: " + result); // Print the result
        sc.close();
    }
}
