//package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zero_end {
    //Move all zeros to the end without changing order
    // Pattern learned: Two-pointer swapping.
    public static void moveZeros(int arr[]){
        int j = 0;

        //loop for accessing element
        for(int i=0; i<arr.length; i++){
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        //loop for remaning element Zero push
        for(; j<arr.length; j++){
            arr[j] = 0;
        }
        System.out.println("Array " + Arrays.toString(arr));
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
        
        moveZeros(arr);
        sc.close();
    }
}
