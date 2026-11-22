/*                          BRUTEFORCE APP
package Binary_Search__2D_8;
public class Peak_Element_2D_Matrix {
    public static int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length; //number of elements in that row

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int up = -1;
                int down = -1;
                int left = -1;
                int right = -1;

                if (i > 0) {           //checks whether the current element has a row above it
                    up = mat[i - 1][j];
                }

                if (i < rows - 1) {      //checks whether a lower neighbour exists
                    down = mat[i + 1][j];
                }

                if (j > 0) {       //check left neighbour
                    left = mat[i][j - 1];
                }

                if (j < cols - 1) {       //check right neighbour
                    right = mat[i][j + 1];
                }
               //check peak condition
                if (mat[i][j] > up && mat[i][j] > down &&
                        mat[i][j] > left && mat[i][j] > right) {

                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };
        int[] ans = findPeakGrid(mat);

        System.out.println("Peak element index: [" + ans[0] + ", " + ans[1] + "]");
        System.out.println("Peak element: " + mat[ans[0]][ans[1]]);
    }
}*/
//                          OPTIMAL APP
package Binary_Search__2D_8;
public class Peak_Element_2D_Matrix {
    public static int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = rows - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            int maxCol = 0;

            // Find maximum element in middle row
            for (int j = 1; j < cols; j++) {
                if (mat[mid][j] > mat[mid][maxCol]) {
                    maxCol = j;
                }
            }
            // Compare with element below
            if (mat[mid][maxCol] > mat[mid + 1][maxCol]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        // Find maximum element in final row
        int maxCol = 0;

        for (int j = 1; j < cols; j++) {
            if (mat[low][j] > mat[low][maxCol]) {
                maxCol = j;
            }
        }
        return new int[]{low, maxCol};
    }

    public static void main(String[] args) {

        int[][] mat = {
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };
        int[] ans = findPeakGrid(mat);

        System.out.println("Peak element index: [" + ans[0] + ", " + ans[1] + "]");
        System.out.println("Peak element: " + mat[ans[0]][ans[1]]);
    }
}