/*
            BRUTEFORCE APPROACH
package Binary_Search;
public class Minimum_in_Rotated_Sorted_Array {
    static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

public static void main(String[] args) {
    int[] arr = {3, 4, 5, 1, 2};

    System.out.println(findMin(arr));
   }
} */

                     //OPTIMAL APPROACH
package Binary_Search_1D_8;
public class Minimum_in_Rotated_Sorted_Array {
    static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
public static void main(String[] args) {
    int[] arr = {4, 5, 6, 7, 0, 1, 2};

    System.out.println("Minimum element: " + findMin(arr));
   }
}