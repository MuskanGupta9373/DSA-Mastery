package Binary_Search_1D_8;

public class Lower_Bound {
    static int lowerBound(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length; //If no element is greater than or equal to x, the lower-bound answer is the array length itself

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
        int[] arr = {1, 2, 3, 3, 7, 8, 9, 9, 9, 11};
        int x = 7;
        System.out.println(lowerBound(arr, x));
   }
}