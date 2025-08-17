package DSA.Arrays;
    
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

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
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
        int[] arr1 = {2, 4, 6, 8, 10}; 
        int[] arr2 = {10, 12, 6, 4, 2};  
        int[] arr3 = {5, 3, 8, 6, 2};   

        search(arr1, 8);
        search(arr2, 8);
        search(arr3, 8);
    }
}

