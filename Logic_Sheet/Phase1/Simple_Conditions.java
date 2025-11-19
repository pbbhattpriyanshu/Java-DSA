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
    public static void main(String[] args) {
        checkNumber(0);
    }    
}