import java.util.Scanner;

public class PracticeSheet05 {
    public static void main(String[] args) {
        // Input data as name, age, cgpa
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the values: ");
        // String name = sc.next();
        // int age = sc.nextInt();
        // double cgpa = sc.nextDouble();

        // System.out.println("Hello " + name + ", you are " + age + " years old with a
        // CGPA of " + cgpa);

        // Write a program that:
        // Asks the user for the number of students.
        System.out.print("Enter the number of student: ");
        int n = sc.nextInt();

        // Stores all their marks in an array.
        int[] numberStudent = new int[n];

        // Access every index to take input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value in " + i + " index: ");
            numberStudent[i] = sc.nextInt();
        }
        // Prints all marks and their average.
        int totalMarks = 0;
        for (int i = 0; i < n; i++) {
            totalMarks = totalMarks + numberStudent[i];
        }

        double average = totalMarks / n;

        // Bonus: Add logic to find the highest and lowest mark.
        // Assume
        int max_Marks = numberStudent[0];

        // Access every element
        for (int i = 1; i < numberStudent.length; i++) {
            // compare with max value
            if (max_Marks < numberStudent[i]) {
                max_Marks = numberStudent[i];
            }
        }
        // Assume
        int min_Marks = numberStudent[0];

        // Access every element
        for (int i = 1; i < numberStudent.length; i++) {
            // compare with max value
            if (min_Marks > numberStudent[i]) {
                min_Marks = numberStudent[i];
            }
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks " + max_Marks);
        System.out.println("Lowest Marks " + min_Marks);

        // String Immutability
        String s = "Hello";
        s = s + "World";
        System.out.println(s);

        // Write a program that:
        // Takes your full name as input.
        String full_Name = sc.nextLine();
        // Prints:
        System.out.println("My name is " + full_Name);
        // Your name in uppercase
        System.out.println(full_Name.toUpperCase());
        // The length of your name
        System.out.println(full_Name.length());
        // The first character
        System.out.println(full_Name.charAt(0));
        // Whether it contains “a” or not

        // A version where all spaces are replaced by underscores
        System.out.println(full_Name.(" ", '_'));
        sc.close();
    }
}
