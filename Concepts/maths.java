import java.util.*;
public class maths {
    public static void main(String[] args) {
        // System.out.println(Math.PI);

        // result = Math.pow(2,4); //16.0
        // result = Math.sqrt(81); // 9.0

        // result = Math.max(2,4); //4
        // result = Math.min(2,4); //2

        // result = Math.round(4.50); // 5.0
        // result = Math.ceil(3.10); //4.0
        // result = Math.floor(3.99); //3.0

        // HYPOTENUSE c = Math.sqrt(a2 + b2);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height (side a): ");
        double height = sc.nextDouble();

        System.out.print("Enter the base (side b): ");
        double base = sc.nextDouble();

        double result = Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));

        System.out.println("The Hypotenuse (side c) is " + result + " cm");

        sc.close();

        // Printf() -- >   method in Java is used to print formatted output to the console. and use \n for next line
        
        // String name = "Piyush";
        // int age = 21;
        // String greet = "Nice to meet u";
        // System.out.printf("Hi, I am %s and I am %d years old, and %s.", name, age, greet);
    }
}
