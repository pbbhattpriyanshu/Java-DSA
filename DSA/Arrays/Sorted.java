package DSA.Arrays;
import java.util.Scanner;

public class Sorted {
    public static void checkSorted(int arr[]) {
        //decalre and intialize
        boolean isAscending = true;
        boolean isDescending = true;

        //traverse - access every element 
        for(int i=0; i<arr.length-1; i++){
            //condition not desecnding
            if (arr[i] < arr[i+1]) {
                isDescending = false;
            } else if (arr[i] > arr[i+1]) {
                isAscending = false;
            }
        }

        //condition - print ascending & decending
        if (isAscending) {
            System.out.println("Array is sorted in Ascending order");
        } else if (isDescending) {
            System.out.println("Array is sorted in Descending order");
        } else {
            System.out.println("Array is not sorted");
        }
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
            checkSorted(arr);
        } else {
            System.out.println("Please Increase the Length of an Array");
        }

       sc.close();
    }
}
