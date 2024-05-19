package Variation;
public class SpiralNumberPattern {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the size of the spiral
        int[][] spiral = new int[n][n];
        int num = 1;
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;
        
        while (num <= n * n) {
            for (int i = colStart; i <= colEnd; i++) {
                spiral[rowStart][i] = num++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                spiral[i][colEnd] = num++;
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                spiral[rowEnd][i] = num++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                spiral[i][colStart] = num++;
            }
            colStart++;
        }

        // Print the spiral pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

//
//1       2       3       4       5
//16      17      18      19      6
//15      24      25      20      7
//14      23      22      21      8
//13      12      11      10      9

