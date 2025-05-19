// Lecture 9 - Pattern in java
import java.util.*;
public class Functions {
//     public static void calSum(int a, int b) {   // parameters or formal parameters
//         int sum = a + b;
//         System.out.println("Sum is : " + sum);
//     }

    // public static void swap(int a, int b){
    //     // Swap - value exchange
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println(a);
    // }


    // Without parameters
    // public static void greeting() {
    //     for (int i = 1; i <= 5; i++) {
    //         System.out.println("Hello Piyush, have a nice day");
    //     }
    // }

    // public static int product(int a, int b) {
    //     int mul = a * b;
    //     System.out.println(mul);
    //     return mul;
    // }

    // public static int factorial(int num) {
    //     int f = 1;
    //     for (int i = 1; i <= num; i++){
    //         f = f * i;
    //     }
    //     return f;
    // }

    // public static int bincoffi(int n, int r) {
    //     int fact_n = factorial(n);
    //     int fact_r = factorial(r);
    //     int fact_nmr = factorial(n-r);

    //     int binCoffi = fact_n/ (fact_r * fact_nmr);

    //     return binCoffi;
    // }

    // Function overloading using by parameters
    // func to cal sum of 2 numbers
    // public static int sum(int a, int b){
    //     return a + b;
    // }

    // func to cal sum of 3 numbers
    // public static int sum (int a, int b, int c){
    //     return a + b + c;
    // }

    // Function overloading using by datatypes
    // public static float sum(float a, float b) {
    //     return a + b;
    // }

    // Check if a number is prime or not 
    // public static boolean isPrime(int num) {
    //    boolean isPrime = true;
    //    for(int i = 2; i<= num-1; i++){
    //     if (num % i == 0) {
    //         isPrime = false;
    //         break;
    //     }
    //    }
    //    return isPrime;
    // }

    // Print prime number in n range
    // public static void primeInRange(int n) {
    //     for(int i=2; i<=n; i++){
    //         if (isPrime(i)) {
    //             System.out.println(i + " ");
    //         }
    //     }
    //     System.out.println();
    // }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // calSum(a,b);        // arguments or actual parameters 
        // sc.close();


    //    int a = 12;
    //    int b = 211;

    // swap
       
    //    swap(a, b);
    //    System.out.println(a);
    //    System.out.println(b);

    // greeting();

    // Call by value --> copy of value
    // Call by reference --> original value

    // int multiply = product(12,2);
    // System.out.println("main class " + multiply);

    // System.out.println(bincoffi(5, 2));
    // System.out.println(bincoffi(10, 2));

    // System.out.println(sum(23, 43));
    // System.out.println(sum(21, 32, 1));
    // System.out.println(sum(3.3f, 4.3f));
    // System.out.println(isPrime(4));
    // primeInRange(10);
    } 
}

