package Binary_Search_1D_8;

public class Search_Insert_Position {
    static int lowerBound(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7};
        int x = 6;
        System.out.println("Lower Bound Index: " + lowerBound(arr, x));
    }
}
