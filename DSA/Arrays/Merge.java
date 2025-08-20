//package DSA.Arrays;

import java.util.Arrays;

public class Merge {
    // Merge Two Sorted Arrays
    public static void mergeTwoArr(int arr1[], int arr2[]) {
        // Create new merged array with combined length of arr1 + arr2
        int[] merge = new int[arr1.length + arr2.length];

        // Initialize index pointers
        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2
        int k = 0; // pointer for merge array

        // Traverse both arrays until one is exhausted
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                // If element of arr1 is smaller, add it to merge
                merge[k] = arr1[i];
                i++; // move pointer in arr1
                k++; // move pointer in merge
            } else {
                // If element of arr2 is smaller or equal, add it
                merge[k] = arr2[j];
                j++; // move pointer in arr2
                k++; // move pointer in merge
            }
        }

        // If arr2 finishes first → copy remaining elements of arr1
        while (i < arr1.length) {
            merge[k] = arr1[i];
            i++;
            k++;
        }

        // If arr1 finishes first → copy remaining elements of arr2
        while (j < arr2.length) {
            merge[k] = arr2[j];
            j++;
            k++;
        }

        // Print final merged array
        System.out.println("Merged array: " + Arrays.toString(merge));
    }

    public static void main(String[] args) {
        int arr1[] = {2, 5, 6};
        int arr2[] = {1, 2, 3, 4, 8};

        mergeTwoArr(arr1, arr2);
    }
}
