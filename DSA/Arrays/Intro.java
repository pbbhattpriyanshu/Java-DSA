package DSA.Arrays;
import java.util.Scanner;

//Questions 🟢 Easy Level

// Calculate sum & average of elements

// Count how many numbers are even/odd

// Check if an array is sorted or not

public class Intro {
    // Sum of an Array
    public static void sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of an Array is " + sum);
    }

    // Average of an Array
    public static void avg(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("Average of an Array is " + avg);
    }

    // Swap the values
    public static void swap(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println("After Swaping index 0 = " + arr[0] + " and index 1 = " + arr[1]);
    }

    //Check Even/Odd numbers in an array
    public static void checkEvenOrOdd(int arr[]){
        int evenCount = 0;
        int oddCount = 0;
        //Access all elements
        for(int i=0; i<arr.length; i++){
            //check for even
            if (arr[i] % 2 == 0) {
                evenCount = evenCount + 1;
            }
            //odd
            else {
                oddCount = oddCount + 1;
            }
        }
        System.out.println("In an Array " + evenCount + " are Even Elements and " +  oddCount + " are Odd Elements");
    }

    //Check Array is sorted or not
    public static void checkSorted(int arr[]) {
        boolean ascending = true;
        boolean descending = true;

        //access all values        
        for(int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]) ascending = false;
            if (arr[i] < arr[i+1]) descending = false;
        }
        //Condition - Print
        if (ascending || descending) System.out.println("Array is sorted");
        else System.out.println("Not sorted");
    }

    public static void main(String[] args) {
        // Syntax - type [] name = new type [size]

        int[] ary = { 1, 2, 3, 4, 5, 6, 7 };

        ary[3] = 23; // mutate

        // total length
        // System.out.println("length of array: " + ary.length);

        // print
        // for(int i=0; i<ary.length; i++){
        // System.out.println(ary[i]);
        // };

        // Create an by taking Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an arry: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Access every index to take input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value in " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        // Call
        // sum(arr);
        // avg(arr);
        checkEvenOrOdd(arr);
        checkSorted(arr);

        sc.close();

    }
}
