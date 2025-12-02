public class InsertionSortBinarySearch {
    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];    // element to insert
            int j = i - 1;       // last element of sorted part

            // Shift elements that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at correct position
            arr[j + 1] = key;
        }
    }

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

    public static void main(String[] args) {
        int arr[] = {7, 3, 12, 1, 9, 5};

        // Step 1: Sort first
        insertionSort(arr);

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