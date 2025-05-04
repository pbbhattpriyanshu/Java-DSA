
// Lecture 8 - loops in java
import java.util.*;

public class loops {
    public static void main(String[] args) {
        // Repeatative task

        // While loop
        // int count = 0;
        // while (count <= 10) {
        // System.err.println(count);
        // count++;
        // }

        // Print sum from 1 to n (n given by user)

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Number");
        // int num = sc.nextInt();
        // int i = 1;
        // int sum = 0;

        // while (i <= num) {
        // sum = sum + i;
        // i++;
        // }
        // System.out.println("The loop is end and Sum is : "+ sum);
        // sc.close();

        // for loop
        // for(initialisation; condition; updation) {
        // // work
        // }

        // for(int i = 1; i<=5; i++){
        // System.out.println("Hello World");
        // }

        // Print Square Print
        // for(int i = 1; i<=4; i++){
        // System.out.println("****");
        // }

        // Print reverse of a number 10899

        // int n = 10899;
        // int rev = 0;
        // while (n > 0) {
        // int lastDigit = n % 10;
        // rev = (rev *10) + lastDigit;
        // n = n / 10;
        // }
        // System.out.println(rev );

        // do-while loop
        // int counter = 1;
        // do {
        // System.out.println("My name is piyush");
        // counter++;
        // } while (counter < 4);

        // Break Statement
        // To exit the loop
        // Print 1 to 5 numbers but exit form 3 number

        // for(int i=1; i<=5; i++){
        // if (i == 3) {
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("I am out of the loop");

        // keep entering number till user enters a multiple of 10

        // Scanner sc = new Scanner(System.in);
        // do {
        // System.out.println("Enter your number : ");
        // int num = sc.nextInt();
        // if (num % 10 == 0) {
        // System.out.println("The number is multiple of 10");
        // break;
        // }
        // System.out.println(num);
        // } while(true);
        // sc.close();

        // Practice question

        // Generate an n x n matrix filled with prime numbers in a spiral order,
        // starting from the top-left corner.
        // int n = 5;
        // int[][] matrix = new int[n][n];
        // int num = 2, top = 0, bottom = n - 1, left = 0, right = n - 1;

        // while (top <= bottom && left <= right) {
        // for (int i = left; i <= right; i++) matrix[top][i] = nextPrime(num++);
        // top++;
        // for (int i = top; i <= bottom; i++) matrix[i][right] = nextPrime(num++);
        // right--;
        // for (int i = right; i >= left; i--) matrix[bottom][i] = nextPrime(num++);
        // bottom--;
        // for (int i = bottom; i >= top; i--) matrix[i][left] = nextPrime(num++);
        // left++;
        // }

        // for (int[] row : matrix) {
        // for (int val : row) System.out.print(val + "\t");
        // System.out.println();
        // }
        // }

        // static int nextPrime(int start) {
        // while (!isPrime(start)) start++;
        // return start;
        // }

        // static boolean isPrime(int n) {
        // if (n < 2) return false;
        // for (int i = 2; i <= Math.sqrt(n); i++)
        // if (n % i == 0) return false;
        // return true;

        // Given a number n, generate the sequence n = n + reverse(n) until a number
        // repeats. Detect when a cycle occurs and count steps.
        // int n = 89;
        // Set<Integer> seen = new HashSet<>();
        // int steps = 0;

        // while (!seen.contains(n)) {
        //     seen.add(n);
        //     int rev = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
        //     n = n + rev;
        //     steps++;
        // }

        // System.out.println("Cycle detected at: " + n);
        // System.out.println("Steps: " + steps);

        // Continue Statement
        // to skip an iteration

        //  for(int i=1; i<=5; i++){
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        //  }
        
        // Display all numbers entered by user except multiples of 10

        // Scanner sc = new Scanner(System.in);

        // do {
        //     System.out.println("Enter the number: ");
        //     int num = sc.nextInt();
        //     if (num % 10 == 0) {
        //         continue;
        //     }
        //     System.out.println("your number was : " +num);
        // } while (true);

        
    }
}
