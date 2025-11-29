public class SelectionSortBinarySearch {

    // 1) Selection Sort (Ascending)
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;   // assume current index has smallest

            // find actual smallest element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { 
                    minIndex = j;
                }
            }

            // swap only if needed
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // 2) Binary Search
    public static int binarySearch(int arr[], int key) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;        // found
            }

            if (arr[mid] < key) {
                low = mid + 1;     // search right side
            } else {
                high = mid - 1;    // search left side
            }
        }
        return -1; // not found
    }

    // MAIN
    public static void main(String[] args) {

        int arr[] = {7, 3, 12, 1, 9, 5};

        // Step 1: Sort first
        selectionSort(arr);

        // Print sorted array
        System.out.println("Sorted Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Step 2: Apply binary search
        int key = 9;
        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found");
        }
    }
}
