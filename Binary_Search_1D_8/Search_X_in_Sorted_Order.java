package Binary_Search_1D_8;

public class Search_X_in_Sorted_Order {
    static int search(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {  // if low become greather than high then search stop

            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {   // x right half m hoga move low
                low = mid + 1;
            }
            else {
                high = mid - 1;     // x left half m hoga move high
            }
        }
        return -1;
    }
public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 14, 19};
         int x = 10;
               System.out.println(search(arr, x));
          }
     }