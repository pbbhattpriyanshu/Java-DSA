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

    public static void main(String[] args) {

    }
}
