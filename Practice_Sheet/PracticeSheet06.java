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
    }
}
