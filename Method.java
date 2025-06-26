public class Method {
       static void greeting(String name, int age) {
        System.out.println("Happy birthday " + name + " now you'r " + age + " year old");
        System.out.println("Happy marraige aniversary");
        System.out.println("Congratulation");
        System.out.println("Thank you");
    }

    static double square(double number) {
        return number*number;
    }
    static double cube(double number) {
        return number*number*number;
    }

    static void getFullName(String first, String last) {
        System.out.println(first + " " + last);
    }

    static void varification(int age) {
        if (age >= 18) {
            System.out.println("Good news! you'r eligible");
        } else {
            System.out.println("Bad news! you'r not elgible");
        }
    }

    static void add(int a, int b) {
        System.out.println(a + b);
    }
    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void main(String[] args) {
        // method 

        getFullName("Kajal", "bhatt");
        varification(1);

        // overloaded method
        add(3, 6, 6);
    }
}
