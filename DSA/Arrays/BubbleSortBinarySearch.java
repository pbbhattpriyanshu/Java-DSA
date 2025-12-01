public class BubbleSortBinarySearch {
    // 1) Bubble sort
    public static void bbleSort(int arr[], int n){
        int phase = 0;
        for(int i=0; i<n-1; i++){
            phase++;
            for(int j=0; j<n-1-i; j++){
                //logic
                if (arr[j]>arr[j+1]) { //descending order convert sign  > / < 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //Print Array
        System.out.println("Total Phase: " + phase);
        System.out.println("Sorted Array is: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
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

    public static void main(String[] args) {
        int arr[] = {2,4,1,6,3,5};
        int n = arr.length;

        // Step 1: Sort first
        bbleSort(arr, n);


        // Step 2: Apply binary search
        int key = 3;
        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found");
        }
    }
}
