package Array_medium_7;
import java.util.ArrayList;
import java.util.List;
                               //very important
public class MatrixInSpiralManner {
    static List<Integer> spiralOrder(int[][] matrix) {//take 2-d array and return list<integer>

        List<Integer> ans = new ArrayList<>();  // answer list bna

        int n = matrix.length;       // rows
        int m = matrix[0].length;    // columns

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {    // 1. Left → Right
                ans.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {    // 2. Top → Bottom
                ans.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {                     // 3. Right → Left
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {                      // 4. Bottom → Top
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;              //     1  2  3  4  5  6   first round result
                                  //    20             7
                                  //    19             8
                                   //   18             9
                                    //  17            10
                                    //  16 15 14 13 12 11
    }

public static void main(String[] args) {

    int[][] matrix = {
            {1, 2, 3, 4, 5, 6},
            {20, 21, 22, 23, 24, 7},
            {19, 32, 33, 34, 25, 8},
            {18, 31, 36, 35, 26, 9},
            {17, 30, 29, 28, 27, 10},
            {16, 15, 14, 13, 12, 11}
    };

    List<Integer> result = spiralOrder(matrix);

    System.out.println(result);
   }
}