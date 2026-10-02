package Array_medium_7;
import java.util.Arrays;
public class RotateMatrixBy90Degrees {
    static int[][] rotate(int[][] matrix) {   //cpme here after call

        int n = matrix.length;      //row no.
        int[][] ans = new int[n][n];   //answer matrix h

        for (int i = 0; i < n; i++) {    //represent row
            for (int j = 0; j < n; j++) {   //represent column

                ans[j][n - 1 - i] = matrix[i][j];  //for 90degreee rotation
            }
        }
        return ans;
    }

public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };
        int[][] result = rotate(matrix);  // calling rotaate method
            for (int i = 0; i < result.length; i++) {
                  System.out.println(Arrays.toString(result[i]));
            }
       }
}

                                 //OPTIMAL APPROACH
/*
import java.util.Arrays;
public class RotateMatrix {

public static void swap(int[][] a, int i, int j) {   //  swap(a[i][j], a[j][i])
        int temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
    }

    public static void rotate(int[][] a) {      // do complete rotation
        int n = a.length;

        // Step 1: Transpose matrix
        for (int i = 0; i <= n - 2; i++)    //  i=n-2 bcoz at i=3  there is nothing below/right of the diagonal that needs swapping.
            for (int j = i + 1; j <= n - 1; j++) {    //j=i+1 bcoz we only swap elements above the main diagonal.
                swap(a, i, j); // swap(a[i][j], a[j][i])
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {    //j=0,1  go through half of the row.
                int temp = a[i][j];
                a[i][j] = a[i][n - 1 - j];     //It gives us the opposite element from the right side.
                a[i][n - 1 - j] = temp;
            }
        }
    }
     public static void main(String[] args) {
        int[][] a = {
            { 1,  2,  3,  4},
            { 5,  6,  7,  8},
            { 9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        rotate(a);

        for (int[] row : a) {
            System.out.println(Arrays.toString(row));
        }
    }
}
 */
