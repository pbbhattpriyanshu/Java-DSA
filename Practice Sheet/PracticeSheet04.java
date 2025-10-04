import java.util.Scanner;

public class PracticeSheet04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. a++ and ++a
        // a++ --> work then value change
        // ++a --> change then / & work

        // int a = 5;
        // int b = a++; // post-increment
        // System.out.println(b); // 5
        // System.out.println(a); // 6

        // int x = 7;
        // int y = ++x; // pre-increment
        // System.out.println(y); // 8
        // System.out.println(x); // 8

        // 2. Conditional Statement (leap year)
        // int year = 2021;

        // if (year % 4 == 0) {
        //     if (year % 100 == 0) {
        //         if (year % 400 == 0) {
        //             System.out.println(year + " is a leap year");
        //         } else {
        //             System.out.println(year + " is not a leap year");
        //         }
        //     } else {
        //         System.out.println(year + " is a leap year");
        //     }
        // } else {
        //     System.out.println(year + " is not a leap year");
        // }

        // 3. Prime number 
        // int number = 49;
        // boolean isPrime = true;

        // for(int i = 2; i<=number-1; i++){
        //     if (number % i == 0) {
        //         isPrime = false;
        //         break;
        //     }     
        // }
        // System.out.println(isPrime);

        // 4. Number is Palindrome
        // int num = 121;
        // int copy = num;
        // int Palindrome_number = 0;

        // while (num > 0) {
        //     int r = num % 10;
        //     Palindrome_number = (Palindrome_number * 10) + r;
        //     num = num / 10;
        // }

        // if (copy == Palindrome_number) {
        //     System.out.println("Number " + Palindrome_number + " is Palindrome");
        // } else {
        //     System.out.println("Number " + copy + " is not Palindrome");
        // }

        // System.out.println("Result = " + Palindrome_number);

        //todo: Linear searching
        // int arr[] = {1,3,5,7,45,87,23,98,31,89,125,8,3,1,8,9,22,8,4,50,55};
        // int target = 3;
        // boolean isTarget = false;
        // int index = 0;
        // int count = 0;
        
        //loop
        // for(int i = 0; i<arr.length; i++){
        //     if (arr[i] == target) {
        //         isTarget = true;
        //         index = i;
        //         count += 1;
        //     } 
        // }
        
        // if (isTarget == true) {
        //     System.out.println("Target is found in this index: " + index + " count " + count);
        // } else {
        //     System.out.println("Target is not in this location");
        // }

        //     *
        //    **
        //   ***
        //  ****
        
        // int n = 4;
        // for (int line = 1; line <= n; line++) {
        //     for (int chars = 1; chars <= n-line; chars++) {
        //         System.out.print(" ");
        //     }
        //     for (int star = 1; star <= line; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //find Positive and negative value
        // int abc = -7;

        // if (abc >= 0) {
        //     System.out.println("Value is Positive");
        // } else {
        //     System.out.println("Value is Negative");
        // }

        //Body temperature is usually measured

        // double temperature = 46;

        // if (temperature <= 36.0) {
        //     System.out.println("Hypothermia");
        // } else if (temperature >= 36.1 && temperature <= 37.2) {
        //     System.out.println("Normal");
        // } else {
        //     System.out.println("Fever");
        // }

        //fizzBuzz
        // int xyz = 30;

        // if (xyz % 3 == 0 && xyz % 5 == 0) {
        //     System.out.println("FizzBuzz");
        // } else if (xyz % 3 == 0) {
        //     System.out.println("Fizz");
        // } else if (xyz % 5 == 0) {
        //     System.out.println("Buzz");
        // } else {
        //     System.out.println("No itself");
        // }

        //weekday/weekend
        // int day = 0;

        // if (day >= 1 && day <= 5 ) {
        //     System.out.println("Weekday");
        // } else if (day >= 6 && day <= 7) {
        //     System.out.println("Weekend");
        // } else {
        //     System.out.println("No Such Day");
        // }

        //Time Clock
        System.out.print("Enter Day, hour and mins: ");
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int min = sc.nextInt();

        //GMT -> IST = ADD 5:30

        hour += 5;
        min += 30;

        //Validation
        if (min >= 60) {
            hour ++;
            min -= 60;
        }

        if (hour >= 24) {
            day ++;
            hour -= 24;
        }

        System.out.println("Day: " + day + "," + " Hour: " + hour + "," + " min: " + min);
    }
}
