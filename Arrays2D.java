import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        // 2D Arrays
        //Syntax
        // int [][] arr = new int[5][4];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt(); //rows
        System.out.print("Enter the number of coloums: ");
        int m = sc.nextInt(); //col

        int [][] arr = new int[n][m];

        // System.out.println("Before");
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(arr[i][j] + " "); 
        //     }
        //     System.out.println();
        // }

        //col-wise
        // for(int j=0; j<n; j++) {
        //     for(int i=0; i<m; i++) {
        //         System.out.print("Enter the values: ");
        //         arr[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }

        //row-wise
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("Enter the values: ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("after/normal form R TO L");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println();
        }

        //print given array in wave form

        System.out.println("Wave form");
        for(int i=0; i<n; i++) {
            if (i%2==0) {
                for(int j=0; j<m; j++){
                    System.out.print(arr[i][j] + " ");
                } 
            }
            else {
                for(int j=m-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

      sc.close();
    }
}
