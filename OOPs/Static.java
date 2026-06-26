// STATIC KEYWORDS - The static keyword in Java means "belongs to the class rather than to any specific object."

// Normally, every object has its own copy of instance variables and methods. A static member is shared by all objects of the class.

//Class - Student of Grade 10-A
class Student {
    String name;
    int rollno;
    int marks;

    static String grade = "10-A";

    // Constructor
    Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

}

public class Static {
    public static void main(String[] args) {
        Student stu1 = new Student("Aman", 1, 87);
        
        Student stu2 = new Student("Bhaskar", 2, 92);

        Student stu3 = new Student("Chitra", 3, 89);

        System.out.println(stu1.name + ": " + Student.grade);
        System.out.println(stu2.name + ": " + Student.grade);
        Student.grade = "10-B";
        System.out.println(stu1.name + ": " + Student.grade);
        System.out.println(stu3.name + ": " + Student.grade);

    }
}