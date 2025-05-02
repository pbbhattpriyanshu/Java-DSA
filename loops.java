// Lecture 8 - loops in java
import java.util.*;
public class loops {
    public static void main(String[] args) {
        // Repeatative task

        // While loop
        // int count = 0;
        // while (count <=  10) {
        //     System.err.println(count);
        //     count++;
        // }

        // Print sum from 1 to n  (n given by user)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println("The loop is end and Sum is : "+ sum);
        sc.close(); 
    }
}
