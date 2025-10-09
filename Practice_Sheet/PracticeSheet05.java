import java.util.Scanner;

public class PracticeSheet05 {
    public static void main(String[] args) {
        //Input data as name, age, cgpa
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values: ");
        String name = sc.next();
        int age = sc.nextInt();
        double cgpa = sc.nextDouble();


        System.out.println("Hello " + name + ", you are " + age + " years old with a CGPA of " + cgpa);

        sc.close();
    }
}
