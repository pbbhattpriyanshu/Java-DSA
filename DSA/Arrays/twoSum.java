// package DSA.Arrays;

public class twoSum {
    //Pair with Given Sum (Two-Sum problem)
    public static void twoPair(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    return;
                }
            }
        }
        System.out.println("Pair is not found");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,3,1}; //not sorted - brute force
        int target = 12;

        twoPair(arr, target);

    }
}
