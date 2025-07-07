import java.util.Scanner;

public class PracticeSheet2 {
    public static void main(String[] args) {
        //Arrays
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        int number[] = new int[n];

        // n == number.length
        // number = 3,2,7,6,5

        // input the values
        for(int i=0; i < n; i++) {
            System.out.print("Enter the values: ");
            number[i] = sc.nextInt();
        };
       
        // sum of an array
        // int sum = 0;
        // for(int i=0; i < n; i++) {
        //     sum = sum + number[i];
        // };
        // System.out.println("Sum of an Array: " + sum);

        // max value in array
        int max = 0;
        for(int i=0; i < n; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        };
        System.out.println("Max value: " + max);

        // min value in array
        // int min = Integer.MIN_VALUE;
        // for(int i=0; i < n; i++) {
        //     if (number[i] < min) {
        //         min = number[i];
        //     }
        // };
        // System.out.println("Min value: " + min);

        // Swap an array

        // int [] arr = {10,20,30,40,50,60,70,80,90};  // index - 8
        // int sp = 0;
        // int fp = arr.length-1;

        // swapArr(arr, sp, fp);

        // // Print the reversed array
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        

        // sc.close();

    }
    // public static void swapArr(int [] arr,int sp, int fp) {
    //     while (sp < fp) {
    //         int temp = arr[sp];
    //         arr[sp] = arr[fp];
    //         arr[fp] = temp;
    //         sp++;
    //         fp--;
    //     }
    // }
}
