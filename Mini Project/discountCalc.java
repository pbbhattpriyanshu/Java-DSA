import java.util.*;

public class discountCalc {
    public static void main(String[] args) {
        // Discount calculator
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the orignal price: ");
        double orignalPrice = sc.nextDouble();

        System.out.print("Enter the discount in % (like 23):  ");
        double discountPercent = sc.nextDouble();

        double discountAmount = (discountPercent / 100) * orignalPrice;
        double finalPrice = orignalPrice - discountAmount;

        System.out.println("After Discount, You pay: " +finalPrice);
        System.out.println("You'r saving: " + discountAmount);
        sc.close();
    }
}
