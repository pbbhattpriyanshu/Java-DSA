package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
    // Rotate array by k positions
    public static void rotateFront(int arr[], int rotation) {
        rotation = rotation % arr.length;
        int count = 0;

        // Times - Rotation
        for (int j = 1; j <= rotation; j++) {
            // temp value for 0 index
            int temp = arr[0];

            // loop access all element
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            // push element
            arr[arr.length - 1] = temp;

            count = count + 1;
        }

        System.out.println("Array " + Arrays.toString(arr) + " Rotation: " + count); 
    }

    public static void main(String[] args) {
        // Create an Array by taking Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an arry: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Rotation - Input
        System.out.print("Enter How many time Array will Rotate: ");
        int rotation = sc.nextInt();

        // Access every index to take input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value in " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        rotateFront(arr, rotation);
        sc.close();
    }
}
