public class SelectionSort {
    //Selection Sort
    public static void SSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        //Print Array
        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,1,9,7,8,2};
        int n = arr.length;

        SSort(arr, n);
    }    
}
