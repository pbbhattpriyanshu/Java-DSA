public class PracticeSheet04 {
    public static void main(String[] args) {
        // 1. a++ and ++a
        // a++ --> work then value change
        // ++a --> change then / & work

        int a = 5;
        int b = a++; // post-increment
        System.out.println(b); // 5
        System.out.println(a); // 6

        int x = 7;
        int y = ++x; // pre-increment
        System.out.println(y); // 8
        System.out.println(x); // 8

        // 2. Conditional Statement (leap year)
        int year = 2021;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }

        // 3. Prime number 
        int number = 49;
        boolean isPrime = true;

        for(int i = 2; i<=number-1; i++){
            if (number % i == 0) {
                isPrime = false;
                break;
            }     
        }
        System.out.println(isPrime);
    }
}
