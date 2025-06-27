import java.util.Scanner;

public class banking {
    static Scanner sc = new Scanner(System.in);

    // Showbalance()
    static void showBalance(double balance) {
        System.out.printf("TOTAL BALANCE: ₹%.2f\n", balance);
    };

    // deposit()
    static double deposit() {
        System.out.print("Enter amount to deposit: ");
        double deposit = sc.nextDouble();

        if (deposit < 200) {
            System.out.println("Invalid amount (Min amount: 200).");
            return 0;
        } else {
            System.out.println("Deposited successfully!");
            return deposit;
        }
    };

    // Withdraw
    static double withdraw(double balance) {
        System.out.print("Enter amount to withdraw: ");
        double withdraw = sc.nextDouble();

        if (withdraw > 0 && withdraw <= balance) {
            System.out.println("Withdrawn successfully!");
            return withdraw;
        } else {
            System.out.println("Invalid or insufficient balance.");
            return 0; 
        } 
    }

    public static void main(String[] args) {

        double balance = 0.01;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("*******************");
            System.out.println("STATE BANK OF INDIA");
            System.out.println("*******************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*******************");

            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit();
                    System.out.printf("TOTAL BALANCE: ₹%.2f\n", balance);
                    break;
                case 3:
                    balance -= withdraw(balance);
                    System.out.printf("TOTAL BALANCE: ₹%.2f\n", balance);
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("INVALID OPTION");
                    break;
            }
        }
        sc.close();
    }
}