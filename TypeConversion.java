// Lecture 5 - Type Conversion in java
public class TypeConversion {
    public static void main(String[] args) {
        // Conversion happens when:
        // a. type compatible
        // b. destination type > source type

        // int a = 24;
        // long b = a;
        // long a = 24;
        // int b = a;   // error: incompatible types: possible lossy conversion from long to int
        // System.out.println(b); 
         

        // Size chart 
        // byte -> short -> char -> int -> float -> long -> double

        // Type Casting (narrowing conversion)

        // int marks = (int)(99.99f); 
        // System.out.println(marks);

        // Type Promotion in expressions (multi-datatypes)

        // 1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.

        // char a = 'a'; // 97
        // char b = 'b'; // 98
        // System.out.println(b-a); // 1

        // 2. if one operand is long, float or double the whole expression is promoted to long, float, double respectively.

        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans); 
    }
}
