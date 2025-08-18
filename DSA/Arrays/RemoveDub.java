package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDub {
    // Remove Duplicates from Sorted Array
    public static void removeDublicate(int arr[]){
        //print before remove dublicate element
        System.out.println("before remove dublicate element Array " + Arrays.toString(arr));
        //slow pointer
        int j = 0;

        //traverse
        for(int i=1; i<arr.length; i++){  //found new unique
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];       // place unique
            }
        }

         int newLen = j + 1;

        // Print output here
        System.out.println("New length: " + newLen);
        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k < newLen; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println(); // line break
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

        // check if array is sorted

        // decalre and intialize
        boolean isAscending = true;
        boolean isDescending = true;

        // traverse - access every element
        for (int i = 0; i < arr.length - 1; i++) {
            // condition not desecnding
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            } else if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }

        // condition - print ascending & decending
        if (isAscending) {
            System.out.println("Array is sorted in Ascending order");
            removeDublicate(arr);
        } else if (isDescending) {
            System.out.println("Array is sorted in Descending order");
            removeDublicate(arr);
        } else {
            System.out.println("Array is not sorted means you can't remove dublicate elements");
        }

        sc.close();
    }
}
