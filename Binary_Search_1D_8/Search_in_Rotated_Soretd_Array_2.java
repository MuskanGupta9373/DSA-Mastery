//bruteforce approach is just same linear iteration eeg linear search

                     //OPTIMAL SOLUTION

package Binary_Search_1D_8;
public class Search_in_Rotated_Soretd_Array_2 {
    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Handle duplicates
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            // Check if the left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // The right half is sorted
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int[] arr = {3, 1, 2, 3, 3, 3, 3};
    int target = 2;

    System.out.println("Target index: " + search(arr, target));
   }
}