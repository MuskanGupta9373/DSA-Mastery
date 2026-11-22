/*                    BRUTEFORCE
package Binary_Search__2D_8;
public class Search_in_2D_Matrix {
    public static boolean searchMatrix(int[][] arr, int target) {

        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) { //visit every row
            for (int j = 0; j < m; j++) {  //column

                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
public static void main(String[] args) {
    int[][] mat = {
            {3, 4, 7,9},
            {12, 13, 16, 18},
            {20, 21, 23, 29}
    };
    int target = 23;
    System.out.println(searchMatrix(mat, target));
   }
}*/

/*                            BETTER
package Binary_Search__2D_8;
public class Search_in_2D_Matrix {
             // Binary search in one row
  2)  public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return true;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
  1) public static boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {

            if (target >= arr[i][0] && target <= arr[i][m - 1]) {   //arr[i][0] = first element of the current row  arr[i][m-1] = last element of the current row
                return binarySearch(arr[i], target);
            }
        }
        return false;
    }
 3)   public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 7, 9},
                {12, 13, 16, 18},
                {20, 21, 23, 29}
        };
        int target = 23;
        System.out.println(searchMatrix(arr, target));
    }
}*/

package Binary_Search__2D_8;
public class Search_in_2D_Matrix {
    public static boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;

        int low = 0;
        int high = n * m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = mid / m;
            int col = mid % m;

            if (arr[row][col] == target) {
                return true;
            }
            else if (arr[row][col] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }

public static void main(String[] args) {

    int[][] arr = {
            {3, 4, 7, 9},
            {12, 13, 16, 18},
            {20, 21, 28, 29}
    };
    int target = 23;
    System.out.println(searchMatrix(arr, target));
   }
}
