public class Pattern02 {
    //Print Hollow-Rectangle Pattern
    // public static void hollow_rectangle(int totRows, int totCols){
    //     //outer loop
    //     for(int i =1; i<=totRows; i++){
    //         //inner
    //         for(int j=1; j<=totCols; j++){
    //             if (i == 1 || i == totRows || j == 1 || j == totCols) {
    //                 //boundary cells
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

   //Print Inverted & Rotated Half-Pyramid
//    public static void inpyramid(int n) {
//     //outer loop
//     for(int i=1; i<=n; i++){
//         //inner loop
//         for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         //inner loop (star)
//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//   }


// Invverted half-pyramid with numbers
// public static void numpyramid(int num){
//     //outer loop
//     for(int i=1; i<=num; i++){
//         //inner loop
//         for(int j=1; j<=num+i-2; j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }

// Half-pyramid with numbers
public static void numpyramid(int num){
    //outer loop
    for(int i=1; i<=num; i++){
        //inner loop
        for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        
        numpyramid(5);
    }
}
