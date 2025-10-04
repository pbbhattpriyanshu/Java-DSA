public class scope {
    static int x = 3; // Static variable, belongs to the class

    public static void main(String[] args) {
        int y = 43; // Local variable to main
        int x = 21;

        System.out.println(x); // 21 -- Local scope

        System.out.println(x + y); // Prints 3 + 43 = 46

        {
            int z = 34; // z is declared inside this block and is only accessible here
    
        }

        // System.out.println(x + y + z); // ERROR: z is out of scope here
    }
}
