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

        // 4. Number is Palindrome
        int num = 121;
        int copy = num;
        int Palindrome_number = 0;

        while (num > 0) {
            int r = num % 10;
            Palindrome_number = (Palindrome_number * 10) + r;
            num = num / 10;
        }

        if (copy == Palindrome_number) {
            System.out.println("Number " + Palindrome_number + " is Palindrome");
        } else {
            System.out.println("Number " + copy + " is not Palindrome");
        }

        System.out.println("Result = " + Palindrome_number);

        //todo: Linear searching
        int arr[] = {1,3,5,7,45,87,23,98,31,89,125,8,3,1,8,9,22,8,4,50,55};
        int target = 3;
        boolean isTarget = false;
        int index = 0;
        int count = 0;
        
        //loop
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == target) {
                isTarget = true;
                index = i;
                count += 1;
            } 
        }
        
        if (isTarget == true) {
            System.out.println("Target is found in this index: " + index + " count " + count);
        } else {
            System.out.println("Target is not in this location");
        }

    }
}
