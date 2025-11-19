//package Logic_Sheet.Phase1;

//Goal: Understand how to make decisions using conditions. 
//Topics covered: Relational operators, logical operators, nested if, multiple conditions. 
//Target Questions: 10 

//Level 1: Simple Conditions (Getting started) 


public class Simple_Conditions {
    //1. Take a number and print whether it’s positive, negative, or zero.
    
    //function to check the number
    public static void checkNumber(int number){
        if (number == 0) {
            System.out.println("The given number is equal to Zero.");
        } else if (number > 0) {
            System.out.println("The given number is Positive");
        } else {
            System.out.println("The given number is Negative");
        }
    }

    //2. Check if a number is even or odd.
    public static void checkNum(int number){
        if (number % 2 == 0) {
            System.out.println("The given number is Even");
        } else {
            System.out.println("The given number is Odd");
        }
    }

    //3. Check if a number is divisible by 5.
    public static void numby5(int number){
        if (number % 5 == 0) {
            System.out.println("The given number is easily divisible by 5");
        } else{
            System.out.println("Did not divisible by 5");
        }
    }

    //4. Check if a number is divisible by both 3 and 5.
    public static void numby3and5(int number){
        if (number % 3 == 0 & number % 5 == 0) {
            System.out.println("Yes the number " + number + " is divisible by both 3 and 5");
        } else {
            System.out.println("The number can't be divisible by both 3 and 5");
        }
    }
    public static void main(String[] args) {
        checkNumber(0);
        checkNum(4);
        numby5(45);
        numby3and5(15);
    }    
}