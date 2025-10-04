public class Pattern02 {
    // Print Hollow-Rectangle Pattern
    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Print Inverted & Rotated Half-Pyramid
    public static void inpyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop (star)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Invverted half-pyramid with numbers
    public static void numpyramid1(int num) {
        // outer loop
        for (int i = 1; i <= num; i++) {
            // inner loop
            for (int j = 1; j <= num + i - 2; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Half-pyramid with numbers
    public static void numpyramid(int num) {
        // outer loop
        for (int i = 1; i <= num; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Floyd's Triangle
    public static void floyd(int rows) {
        int num = 1;
        // outer loop
        for (int i = 1; i <= rows; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // Print the star pattern
    public static void starRectangle(int row, int col) {
        // outer loop
        for (int i = 1; i <= row; i++) {
            System.out.print("* ");
            for (int j = 1; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print the star pattern
    public static void numberSq(int num) {
        // outer loop
        for (int i = 1; i <= num; i++) {
            // inner loop
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }

    // Print n times of abcd (a = 64) + typecaste
    public static void alphabetCap(int n) {
        int abcd = 64;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + abcd) + " ");
            }
            System.out.println();
        }
    }

    // Print n times of abcd (a = 97) + typecaste
    public static void alphabetSmall(int n) {
        int abcd = 96;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + abcd) + " ");
            }
            System.out.println();
        }
    }

    // Right angle triangle
    public static void RightTri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // inverse Right angle triangle
    public static void inverseRightTri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    }
}
