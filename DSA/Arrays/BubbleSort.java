public record BubbleSort() {
    //Bubble Sort - Ascending order
    public static void bbleSort(int arr[], int n){
        //Phase loop
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                //logic
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //Print Array
        System.out.println("Sorted Array is: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int []arr = {2,3,4,1};
        int n = arr.length;

        bbleSort(arr, n);

    }
}
