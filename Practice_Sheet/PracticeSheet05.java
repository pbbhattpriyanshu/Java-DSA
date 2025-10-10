import java.util.Scanner;

public class PracticeSheet05 {
    public static void main(String[] args) {
        // Input data as name, age, cgpa
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the values: ");
        // String name = sc.next();
        // int age = sc.nextInt();
        // double cgpa = sc.nextDouble();

        // System.out.println("Hello " + name + ", you are " + age + " years old with a CGPA of " + cgpa);

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
        for(int i=0; i<n; i++){
            totalMarks = totalMarks + numberStudent[i];
        }

        double average = totalMarks / n;
        // Bonus: Add logic to find the highest and lowest mark.


        System.out.println("Average Marks: " + average);

        sc.close();
    }
}
