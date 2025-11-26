//package DSA.Arrays;
    
public class SearchWithSortedCheck {

    // Check if array is ascending
    public static boolean isAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    // Check if array is descending
    public static boolean isDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) return false;
        }
        return true;
    }

    // Binary Search for Ascending
    public static void binarySearchAscending(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int count = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            count++;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                System.out.println("loop runs: " + count);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    // Binary Search for Descending
    public static void binarySearchDescending(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] > key) {
                low = mid + 1; // reverse logic
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    // Wrapper function
    public static void search(int[] arr, int key) {
        if (isAscending(arr)) {
            System.out.println("Array is sorted Ascending → Binary Search...");
            binarySearchAscending(arr, key);
        } else if (isDescending(arr)) {
            System.out.println("Array is sorted Descending → Binary Search...");
            binarySearchDescending(arr, key);
        } else {
            System.out.println("Array is not sorted → Binary Search not possible.");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};  

        search(arr1, 91);
    }
}

