public class InsertionSort {

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

    public static void main(String[] args) {
        int arr[] = {7, 3, 5, 1, 9};

        insertionSort(arr);

        // Print sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
