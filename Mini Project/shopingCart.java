import java.util.*;
public class shopingCart {
    public static void main(String[] args) {
        // Shoping Cart Program
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would like to buy?: ");
        item = sc.nextLine();

        System.out.print("What is the price?: ");
        price = sc.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("\n---------------BILL----------------");
        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
        sc.close();

    }
}

