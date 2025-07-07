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
        Scanner sc = new Scanner(System.in);
        String[] name = {"Piyush", "Pankaj", "Priyanshu", "Pavan"};
        System.out.print("How many times rotation is done: ");
        int k = sc.nextInt(); // Number of times to rotate right
       
        for (int r = 0; r <  k % name.length; r++) {
            String temp = name[name.length - 1]; // Save last element
            for (int j = name.length - 1; j > 0; j--) {
                name[j] = name[j - 1]; // Shift each element right
            }
            System.out.println(name[1]);
            name[0] = temp; // Place last element at the front
        }

        // Print the rotated array
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println();

        sc.close();


    }
}
