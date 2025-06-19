import java.util.*;
public class Revision {
    public static void main(String[] args) {
        // if/else
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        sc.close();

    }
}
