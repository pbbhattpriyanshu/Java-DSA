package DSA.Arrays;

import java.util.Scanner;

public class Intro {
    //Sum of an Array
    public static void sum(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of an Array is " + sum);
    }

    //Average of an Array
    public static void avg(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        int avg = sum/arr.length;
        System.out.println("Average of an Array is " + avg);
    }
    public static void main(String[] args) {
       // Syntax - type [] name = new type [size]

       int [] ary = {1,2,3,4,5,6,7};

       ary[3] = 23; //mutate

       //total length
       //System.out.println("length of array: " + ary.length);

       //print
    //    for(int i=0; i<ary.length; i++){   
    //     System.out.println(ary[i]);
    //    };

       //Create an by taking Input 
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Size of an arry: ");
       int n = sc.nextInt();
       int [] arr = new int[n];

       //Access every index to take input
       for(int i=0; i<n; i++){
        System.out.print("Enter the value in " + i + " index: ");
        arr[i] = sc.nextInt();
       }

       //Call
       sum(arr);
       avg(arr);

       sc.close();

    }
}
