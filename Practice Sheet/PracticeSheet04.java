public class PracticeSheet04 {
    public static void main(String[] args) {
        // 1. a++ and ++a 
        // a++ --> work then value change
        // ++a --> change then / & work

        int a = 5;
        int b = a++; //post-increment
        System.out.println(b); //5
        System.out.println(a); //6

        int x = 7;
        int y = ++x; //pre-increment
        System.out.println(y); //8
        System.out.println(x); //8
    }
}
