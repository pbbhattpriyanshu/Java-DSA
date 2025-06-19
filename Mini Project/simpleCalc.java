import java.util.*;
public class simpleCalc {
    public static void main(String[] args) {
        // Simple Calculator
        // +, -, *, /, %
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter operators ( +, -, *, /, %)");
        char operators = sc.next().charAt(0);

        switch (operators) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Wrong Operators");
        }

        sc.close();
    }
}
