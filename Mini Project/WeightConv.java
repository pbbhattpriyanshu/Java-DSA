import java.util.*;
public class WeightConv {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM
        Scanner sc = new Scanner(System.in);

        // Declare variables
        double weight;
        double newWeight;
        int choice;

        // Welcome messages
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert pounds to kg");
        System.out.println("2: Convert kg to pounds");

        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        // Option 1,2 and other
        if (choice == 1) {
            System.out.print("Enter the weight in pounds: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.45359237;
            System.out.printf("\n %.f pound = %.f kilogram", weight, newWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight in Kg: ");
            weight = sc.nextDouble();
            newWeight = weight / 0.45359237;
            System.out.printf("\n %.0f kilogram = %.11f pound", weight, newWeight);
        } else {
            System.out.println("That was not a valid choice!!!!");
        }

        sc.close();
    }
}
