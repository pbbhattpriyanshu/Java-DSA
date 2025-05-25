 // Lecture 9 - Pattern in java
public class Pattern01 {
    public static void main(String[] args) {
        // Print the Pattern
        // *
        // **
        // ***
        // ****
        // for(int line = 1; line <=4; line++){
        // for(int star = 1; star <= line; star++){
        // System.out.print("*");
        // }
        // System.out.println();

        // ****
        // ***
        // **
        // *

        // int n = 4;
        // for(int line = 1; line <=n; line++){
        // for(int star = 1; star <= (n-line+1); star++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 1
        // 12
        // 123
        // 1234

        // int n = 4;
        // for(int line = 1; line <=n; line++){
        // for(int num = 1; num <= line; num++){
        // System.out.print(num);
        // }
        // System.out.println();
        // }

        // 1234
        // 123
        // 12
        // 1

        // int n = 4;
        // for(int line = 1; line <=n; line++){
        // for(int num = 1; num <= (n-line+1); num++){
        // System.out.print(num);
        // }
        // System.out.println();

        // A
        // BC
        // DEF
        // GHIJ

        // int n = 4;
        // char ch ='A';
        // for(int line = 1; line <=n; line++){
        // for(int chars = 1; chars <= line; chars++){
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

        //     *
        //    **
        //   ***
        //  ****
        
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= n-line; chars++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
