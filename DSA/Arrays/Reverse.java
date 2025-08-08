package DSA.Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class Reverse {
    //Reverse an array in place
    // Pattern learned: Two-pointer swapping.
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        System.out.println("Original Array " + Arrays.toString(arr));

        //loop
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            //update
            start++;
            end--;
        }
        System.out.println("Reverse Array " + Arrays.toString(arr));
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

        reverse(arr);
        sc.close();
    }
}
