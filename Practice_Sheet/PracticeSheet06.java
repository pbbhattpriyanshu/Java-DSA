//Pattern -  Concepts
public class PracticeSheet06 {
    public static void main(String[] args) {
        //1. Box Strategy 
        //No. of rows and col are same

        int n = 5;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if (col >= row) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //2. Swap two numbers using a third variable.
        int a = 43;
        int b = 56;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of A is " + a + " and value of B is " + b);
    }
}
