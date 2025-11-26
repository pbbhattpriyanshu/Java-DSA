//package DSA.Arrays;
import java.util.Scanner;

public class linearSearch{
    //linear Search
    public static void Search(int arr[], int target){
        //boolean create
        boolean isFound = false;
        int count = 0;

        //traverse 
        for(int i=0; i<arr.length; i++){
            //condition for target
            if (arr[i] == target) {
                System.out.println("At index: " + i);
                isFound = true;
            }
            count++;
        }

        //condition for output
        if (isFound) {
            System.out.println("Target is found");
            System.out.println("loop runs: " + count);
        } else {
            System.out.println("Target is not found");
        }

    }

    public static void main(String[] args){
        //taking Input target
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target value: ");
        int target = sc.nextInt();

         int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};  

        Search(arr1, target);
      
       sc.close();
    }
}