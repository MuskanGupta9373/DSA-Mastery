/*                     BETTER
package Binary_Search__2D_8;
public class Search_in_2D_Matrix_II {
        // Binary search in one row
    public static int binarySearch(int[] row, int target) {
        int low = 0;
        int high = row.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (row[mid] == target) {
                return mid;
            }
            else if (row[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
               // Search in the matrix
    public static int[] searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {

            int ind = binarySearch(matrix[i], target); //It calls binary search on the current row.

            if (ind != -1) {  //If ind is not -1, the target exists in the current row
                return new int[]{i, ind};
            }
        }
        return new int[]{-1, -1};
    }

public static void main(String[] args) {

    int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24}
    };
    int target = 14;
    int[] result = searchMatrix(matrix, target);

    System.out.println("Coordinates: [" + result[0] + ", " + result[1] + "]");  //result[0] = row index ,result[1] = column index
   }
}*/
//                     OPTIMAL
package Binary_Search__2D_8;
public class Search_in_2D_Matrix_II {
    public static int[] searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;   // row
        int m = matrix[0].length; //number of columns in that row

        int row = 0;
        int col = m - 1; // strat from last column

        while (row < n && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            else if (matrix[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24}
        };
        int target = 14;

        int[] result = searchMatrix(matrix, target);

        System.out.println("Coordinates: [" + result[0] + ", " + result[1] + "]");
    }
}