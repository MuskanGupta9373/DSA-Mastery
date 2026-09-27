package Array_medium_7;
                              //VERY VERY IMPORTANT
public class Set_matrix_zero {
    static void markRow(int matrix[][], int i, int m) {
        for (int j = 0; j < m; j++) {     // jis row m col mark kiye ushka 1 element jha v h mark-1 if !=0 mtlb 1 ho tbhi
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            } //move to 26th line
        }
    }
    static void setZeroes(int matrix[][]) {   //start

        int n = matrix.length; //row
        int m = matrix[0].length; // first row i.e 1111

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 0) {    //matrix[0][0] = 1  matrix[0][1] = 1   matrix[0][2] = 1  so no change
                    markRow(matrix, i, m);   //  matrix[1][1]=0  so   markRow(matrix, 1, 4)
                    markCol(matrix, j, n);    //                       markCol(matrix, 1, 4);
                }                             // move to 4 line
            }
        }
        for (int i = 0; i < n; i++) {     // visit every element and which is marked -1 make it 0
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    static void markCol(int matrix[][], int j, int n) {
        for (int i = 0; i < n; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 1, 1, 1},
            {1, 0, 0, 1},
            {1, 1, 0, 1},
            {1, 1, 1, 1}
        };
              setZeroes(matrix);
        for (int row[] : matrix) {
        for (int val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
  }
}
                               //BETTER SOLUTION
/*
public class SetMatrixZeroesBetter {

    static void setZeroes(int[][] arr) {

        int n = arr.length;       // number of rows
        int m = arr[0].length;    // first row

        int[] row = new int[n];    // it tells which row and col contain 0
        int[] col = new int[m];

        // Find all zeroes
        for (int i = 0; i < n; i++) {    // find which col,row contain 0
            for (int j = 0; j < m; j++) {

                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Make required rows and columns zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (row[i] == 1 || col[j] == 1) {      // if marked row col=1 make it 0
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {

         int[][] arr = {
            {1, 1, 1, 1},
            {1, 0, 0, 1},
            {1, 1, 0, 1},
            {1, 1, 1, 1}
        };

        setZeroes(arr);

                  // Print matrix
        for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
              System.out.println();
        }
    }
}
 */