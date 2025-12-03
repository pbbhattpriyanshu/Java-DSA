public class PracticeSheet07 {
    //Reverse loop
    public static void revrse(int[] arr, int n){
        //two pointer array
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        //traverse 
        System.out.println("Reverse Array: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }

    //MaX Value
    public static void Max(int []arr, int n){
        int maxValue = arr[0];
        
        //loop
        for(int i=1; i<n; i++){
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        System.out.println("Max Value: " + maxValue);
    }

    //Check if array is sorted or not
    public static void CheckSorted(int []arr, int n){
        boolean isAscending = true;
        boolean isDescending = true;

        for(int i=0; i<n-1; i++){
            if (arr[i] > arr[i+1]) {
                isAscending = false;
            } else if (arr[i] < arr[i+1]) {
                isDescending = false;
            } 
        }

        if (isDescending) {
            System.out.println("Array is Sorted in Descending order");
        } else if (isAscending) {
            System.out.println("Array is Sorted in Ascending order");
        } else {
            System.out.println("Array is not sorted");
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,4,2,1,0};
        int n = arr.length;

        CheckSorted(arr, n);
    }
}
