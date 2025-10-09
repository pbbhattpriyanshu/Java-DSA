import java.util.Scanner;

public class PracticeSheet03 {
    public static void main(String[] args) {
        //Reverse array with range of indx

        // int [] arr = {-3,4,2,8,3,9,6,2,8,10}; // 9 - index

        // range indx 3 to indx 7

        // int sp = 3;
        // int ep = 7;

        // while (sp < ep) {
        //     int temp = arr[sp];
        //     arr[sp] = arr[ep];
        //     arr[ep] = temp;
        //     sp++;
        //     ep--;
        // };
        
        // for(int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // };

        // Rotate the array

        // RIGHT ROTATION
        // Scanner sc = new Scanner(System.in);
        // String[] name = {"Piyush", "Pankaj", "Priyanshu", "Pavan"};
        // System.out.print("How many times rotation is done: ");
        // int k = sc.nextInt(); // Number of times to rotate right
       
        // for (int r = 0; r <  k % name.length; r++) {
        //     String temp = name[name.length - 1]; // Save last element
        //     for (int j = name.length - 1; j > 0; j--) {
        //         name[j] = name[j - 1]; // Shift each element right
        //     }
        //     System.out.println(name[1]);
        //     name[0] = temp; // Place last element at the front
        // }

        // // Print the rotated array
        // for (int i = 0; i < name.length; i++) {
        //     System.out.print(name[i] + " ");
        // }
        // System.out.println();

        // sc.close();

        // int [] arr = {1,3,-2,6};
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for(int i=0; i<arr.length; i++){
        //     if (max < arr[i]) {
        //         max = arr[i];
        //     }
        //     if (min > arr[i]) {
        //         min = arr[i];
        //     }
        // } System.out.println("Max value: " + max); // 6
        //  System.out.println("Min value: " + min); // -2
        
        // int countMin = 0;
        // int countMax = 0;
        // for(int j = 0; j<arr.length; j++){
        //     if (arr[j] == max) {
        //         countMax++;                
        //     }
        //     if (arr[j] == min) {
        //         countMin++;                
        //     }
        // }

        // int validMin = arr.length - countMax;
        // int validMax = arr.length - countMin;
        // System.out.println("Valid Minimum numbers: " + validMin); //3
        // System.out.println("Valid Maximum numbers: " + validMax); //3

        // Pair of an array

        int [] arr = {3,5,2,7,5}; // 4
        int k = 12;
        int n = 3;

        for(int i=0; i<=n; i++) {
            for(int j=i+1; j<=n+1; j++) {
                if (arr[i]+ arr[j] == k) {
                    System.out.println("Sum is found: " + "(" + i + "," + j + ")" );
                };
            };
        };

    }
}
