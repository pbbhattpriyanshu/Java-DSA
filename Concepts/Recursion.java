public class Recursion {
    public static void recc(int num) {
        if (num == 0) return;          // base code (stop here)
        System.out.println(num);       // print current number
        recc(num - 1);                 // call itself with a smaller number
    }
    public static void main(String[] args) {
        recc(7);
    }
}
