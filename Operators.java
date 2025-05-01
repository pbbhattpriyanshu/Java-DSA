// Lecture 6 - Oprators in java
public class Operators {
    public static void main(String[] args) {
        // Symbols that tell compiler to perform some operation
        // a + b , a - b, a * b, a / b,  etc.
        // Expression --> sum = a + b  (a, b) = operands, (+) = operators, (sum) = variable

        // Types of Operators
        // 1. Arithmetic Operators (Binary / Unary)
        // Binary Operators: +, -, *, /, %
        // Unary Operators: ++, --, +, -
        // 2. Relational Operators (>, <, >=, <=, ==, !=)
        // 3. Logical Operators (&&, ||, !)
        // 4. Assignment Operators (=, +=, -=, *=, /=, %=)
        // 5. Bitwise Operators (&, |, ^, ~, <<, >>, >>>)
        
        // int a = 10;
        // int b = ++a;           // pre increment/increment(change, then use)
        // System.out.println(a);
        // System.out.println(b);

        // int a = 10;
        // int b = a++;           // post increment/decrement(use, then change)
        // System.out.println(a);
        // System.out.println(b);

        // int a = 32;
        // int b = 34;
        // System.out.println(a>b);
        // System.out.println(a<b);
        // System.out.println(a==b);
        // System.out.println(a!=b);

        // Logical table (AND)
        // S1  S2    ANS
        // T   T   =  T
        // T   F   =  F
        // F   T   =  F
        // F   F   =  F

        // Logical table (OR)
        // S1  S2    ANS
        // T   T   =  T
        // T   F   =  T
        // F   T   =  T
        // F   F   =  F

        // Logical table (NOT)
        // S1   ANS
        // T  =  F
        // F  =  T 
    } 
}
 