import java.util.*;
public class TaxCal {
    public static void main(String[] args) {
        
        // Income Tax Calculator (if-else and else-if)
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter your Income: ");
        int income = sc.nextInt();
        float per20 = income * (0.2f);
        float per30 = income * (0.3f);
        if (income < 700000) {
            System.out.println("Tax is Zero");
        }
        else if (income >= 700000 && income <= 1400000) {
            System.out.println("Your Tax is : " + per20);
        }
        else {
            System.out.println("Your Tax is : " + per30);
        }
        System.out.println("Thank you, Please visit again");  


        sc.close();
    }
}
