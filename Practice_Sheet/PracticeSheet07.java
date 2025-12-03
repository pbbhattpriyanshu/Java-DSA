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
    public static void main(String[] args) {
        int [] arr = {45,8,3,12,56,2,3,4,5};
        int n = arr.length;

        Max(arr, n);
    }
}
