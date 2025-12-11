public class PracticeSheet08 {
    // COUNT VOWELS IN A STRING
    public static void countVowels(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Total vowels = " + count);
    }

    // SUM OF DIGITS OF A NUMBER
    public static void sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }

    // FACTORIAL OF A NUMBER
    public static void factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial not possible for negative numbers");
            return;
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }

    // PALINDROME NUMBER CHECK
    public static void isPalindrome(int n) {
        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (rev == original)
            System.out.println(original + " is Palindrome");
        else
            System.out.println(original + " is NOT Palindrome");
    }

    // PRIME NUMBER CHECK
    public static void isPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is NOT Prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is NOT Prime");
                return;
            }
        }

        System.out.println(n + " is Prime");
    }

    // Count digits in a number
    public static void countDigits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Total digits = " + count);
    }

    // Reverse a number
    public static void reverseNumber(int n) {
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reversed number = " + rev);
    }

    // Count spaces in a string
    public static void countSpaces(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Total spaces = " + count);
    }

    // Count consonants in a string
    public static void countConsonants(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // alphabet only
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    count++;
                }
            }
        }

        System.out.println("Total consonants = " + count);
    }

    // Count words in a string
    public static void countWords(String s) {
        String[] parts = s.trim().split("\\s+");
        System.out.println("Total words = " + parts.length);
    }

    // Find Largest Element in Array
    public static void largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > max)
                max = x;
        }

        System.out.println("Largest element = " + max);
    }

    //Find Smallest Element in Array
    public static void smallestElement(int[] arr) {
    int min = Integer.MAX_VALUE;

    for (int x : arr) {
        if (x < min)
            min = x;
    }

    System.out.println("Smallest element = " + min);
}

    public static void main(String[] args) {

    }
}
