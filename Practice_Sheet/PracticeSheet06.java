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
    }
}
