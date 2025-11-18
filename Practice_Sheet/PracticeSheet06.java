//Pattern -  Concepts
import java.util.*;
public class PracticeSheet06 {
    public static void main(String[] args) {
        //1. Box Strategy 
        //No. of rows and col are same

        int n = 5;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if (col >= row) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //2. Swap two numbers using a third variable.
        int a = 43;
        int b = 56;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of A is " + a + " and value of B is " + b);

        //3. Calculate area and perimeter of rectangle from user input.
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        double Area = length * breadth;
        double Perimeter = 2 * (length + breadth);

        System.out.println("Area of Rectangle is " + Area + " and perimeter is " + Perimeter);

        sc.close();

        //4. Print numbers 1-100 divisible by both 3 and 5
        for(int i=1; i<=100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("The numbers are " + i);
            }
        }

        //4. Find factorial of a number.
        int num = 7;
        int fact = 1;

        for(int i=num; i>=1; i--){
            fact = fact * i;    
        }

        System.out.println("The Factorial of number " + num + " is " + fact);

        //5. Reverse a number
        int nums = 456;
        int reverse = 0;

        while (nums != 0) {
            int digit = nums % 10;
            reverse = reverse * 10 + digit;
            nums = nums/10;
        }

        System.out.println("Reverse: " + reverse);

        //6. Print Fibonacci sequence up to N.

        int N = 10;
        int n1 = 0;
        int n2 = 1;

        System.out.print("Fibonacci: ");

        for(int i=1; i<=N; i++){

            System.out.print(n1 + " ");
    
            int Next = n1 + n2;
            n1 = n2;
            n2 = Next;
        }

        System.out.println();

        //7. Check if a number is prime
        int numCheck = 8;
        boolean isPrime = true;

        if (numCheck <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i * i <= numCheck; i++){
                if (numCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println( numCheck + " is prime number");
        } else {
            System.out.println(numCheck + " is NOT a prime number.");
        }

        //8. Count digits in a number
        int numbr = 34;
        int count = 0;

        int rough = numbr;

        if (rough == 0) {
            count = 1;
        } else {
            while (rough != 0) {
                rough = rough/10;
                count++;
            }
        }

        System.out.println("Digits: " + count);

        add(2,4);

    }

    //function/method - add
    public static void add(int a, int b){
        int add =  a + b;
        System.out.println("Sum: " + add);
    }
}
