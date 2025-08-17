//package DSA.Arrays;
import java.util.Scanner;

public class search{
    //linear Search
    public static void linearSearch(int arr[], int target){
        //boolean create
        boolean isFound = false;

        //traverse 
        for(int i=0; i<arr.length; i++){
            //condition for target
            if (arr[i] == target) {
                isFound = true;
            }
        }

        //condition for output
        if (isFound) {
            System.out.println("Target is found");
        } else {
            System.out.println("Target is not found");
        }

    }
    public static void main(String[] args){
        //taking Input target
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target value: ");
        int target = sc.nextInt();

        int arr[] = {12,4,5,74,84,88,3,69,6};
        linearSearch(arr, target);
      
       sc.close();
    }
}