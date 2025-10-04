// Lecture 7 - Conditional Statement in java
import java.util.* ;
public class ConditionalSt {
    public static void main(String[] args) {
        // if-else Statements
        /*
         * if(condition){
         * work }
         * else {
         * work}
         */

        // Example 1
        // int age = 13;
        // if (age >= 18) {
        //     System.out.println("You are adult");
        // } if (age >= 13 && age < 18) {
        //     System.out.println("Teenager");
        // } else {
        //     System.out.println("Not adult");
        // }
        // Example 2
        // int A = 1;
        // int B = 3;

        // if (A > B) {
        //     System.out.println("A is greater then B");
        // } else {
        //     System.out.println("B is greater then A");
        // }

        // Example 3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number : ");
        // int num = sc.nextInt();

        // if (num % 2 == 0) {
        //     System.out.println(num +" is Even numner");
        // } else {
        //     System.out.println(num +" is odd number");
        // }
        // sc.close();   

        // else if Statement

        // Example
        // Scanner sc = new Scanner(System.in); 
        // int percent = sc.nextInt();
        // if (percent >= 60) {
        //     System.out.println("You are Pass with 1ST Division");
        // } 
        // else if (percent >= 33) {
        //     System.out.println("You are Pass with 2ND Division");
        // }
        // else {
        //     System.out.println("Sorry, You are Fail! Better luck next time");
        // }
        // sc.close();

        // Income Tax Calculator
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please Enter your Income");
        // int income = sc.nextInt();
        // float per20 = income * (0.2f);
        // float per30 = income * (0.3f);
        // if (income < 700000) {
        //     System.out.println("Tax is Zero");
        // }
        // else if (income >= 700000 && income <= 1400000) {
        //     System.out.println("Your Tax is : " + per20);
        // }
        // else {
        //     System.out.println("Your Tax is : " + per30);
        // }
        // System.out.println("Thank you, Please visit again");  

        // Switch Statement 
        // int number = 2;
        // switch (number) {
        //     case 1:
        //         System.out.println("Samaso");
        //         break;
        //     case 2: 
        //         System.out.println("Burgur");
        //         break;
        //     case 3:
        //         System.out.println("Mango shake");
        //     default:
        //         System.out.println("We are dreaming");
        // }

        // Example 2 

        String day = "Tuesday";

        switch (day) {
            case "Monday":
                System.out.println("Monday = Boring day 🥴");
                break;
            case "Tuesday":
                System.out.println("Tuesday = Still recovering 😑");
                break;
            case "Wednesday":
                System.out.println("Wednesday = Midweek hustle 💪");
                break;
            case "Thursday":
                System.out.println("Thursday = Almost there 😌");
                break;
            case "Friday":
                System.out.println("Friday = Weekend vibes starting 😎");
                break;
            case "Saturday":
                System.out.println("Saturday = Fun day! 🎉");
                break;
            case "Sunday":
                System.out.println("Sunday = Relax and chill 😴");
                break;
            default:
                System.out.println("Not a valid day!");
        }

    }
}
