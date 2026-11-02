package Binary_Search_1D_8;

public class Upper_Bound {
    static int upperBound(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 8, 8, 11, 11, 11, 12};
        int x = 6;

       int result = upperBound(arr, x);

    System.out.println("Upper bound index for " + x + " is: " + result);
  }
}
