/*                      BRUTEFORCE
package Binary_Search__2D_8;
public class Find_row_with_maximum_1s {
    public static int findRowWithMaxOnes(int[][] arr, int n, int m) {
        int index = -1;
        int maxCount = -1;
        // Traverse each row

        for (int i = 0; i < n; i++) {
             int count = 0;

         // visit column and Count 1s in the current row
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            // Update maximum count and row index
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {0,0,1,1,1},
                {0,0,0,0,0},
                {0,1,1,1,1},
                {0,0,0,0,0},
                {0,1,1,1,1}
        };
        int n = arr.length;  // row
        int m = arr[0].length; //column
        int result = findRowWithMaxOnes(arr, n, m);

        System.out.println("Row with maximum 1s is at index: " + result);
    }
}*/

//                        BETTER
/*
package Binary_Search__2D_8;
public class Find_row_with_maximum_1s {
    public static int rowWithMax1s(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int maxCount = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {

            int low = 0;  //Starting index of the current row
            int high = m - 1;  //last index of the current row
            int firstOne = m;  //Stores the index of the first occurrence of 1 in every row

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[i][mid] == 1) {
                    firstOne = mid;
                    high = mid - 1;
                }
                else {                  // if middle is 0
                    low = mid + 1;
                }
            }
            int count = m - firstOne;  // count no.of 1 (size of row OR COLUMN)-(1st 1's index )

            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {0, 0, 1, 1},
            {0, 1, 1, 1},
            {0, 0, 0, 1}
       };
        System.out.println(rowWithMax1s(arr));
   }
}*/
//                          OPTIMAL
package Binary_Search__2D_8;
public class Find_row_with_maximum_1s {
    public static int rowWithMax1s(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int row = 0;
        int col = m - 1;
        int index = -1;

        while (row < n && col >= 0) {   //row<n;not go below the last row, col>0;not go beyond the first column

            if (arr[row][col] == 1) {
                index = row;
                col--;
            } else {
                row++;
            }
        }
        return index;
    }
public static void main(String[] args) {
        int[][] arr = {
            {0, 0, 1, 1},
            {0, 1, 1, 1},
            {0, 0, 0, 1}
          };
        System.out.println("Row with maximum 1s: " + rowWithMax1s(arr));
   }
}