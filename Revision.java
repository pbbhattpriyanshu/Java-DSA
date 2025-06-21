import java.util.*;
public class Revision {
    public static void main(String[] args) {
        // if/else
        Scanner sc = new Scanner(System.in);

        boolean isStudent = true;
        boolean isAdult;
        // double discountPercent = 30;

        System.out.print("Enter the actual cost: ");
        double price = sc.nextDouble();
        

        if (isStudent) {
            double discountAmount = (75.0 / 100) * price;
            double finalPrice = price - discountAmount;
            System.out.printf("Final price after discount: %.2f\n", finalPrice);

        } else {
            double discountAmount = (15.0 / 100) * price;
            double finalPrice = price - discountAmount;
            System.out.printf("Final price after discount: %.2f\n", finalPrice);
        }
        sc.close();
    }
}
