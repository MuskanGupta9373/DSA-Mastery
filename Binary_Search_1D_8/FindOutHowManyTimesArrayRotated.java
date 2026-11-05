/*                  BRUTEFORCE APPROACH
package Binary_Search_8;
public class FindOutHowManyTimesArrayRotated {
    static int findKRotation(int[] arr) {
        int min = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; //If the current element is smaller than min, we update the minimum and its index.
                index = i;
            }
        }
        return index;
    }
public static void main(String[] args) {
    int[] arr = {3, 4, 5, 1, 2};

    System.out.println("Number of rotations: " + findKRotation(arr));
   }
}*/

                  //OPTIMAL APPROACH
package Binary_Search_1D_8;
public class FindOutHowManyTimesArrayRotated {

    static int findKRotation(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            // If the current range is sorted
            if (arr[low] <= arr[high]) {
                if (arr[low] < min) {      //Compare arr[low] with the smallest value found so far
                    min = arr[low];
                    index = low;
                }
                break;
            }

            int mid = low + (high - low) / 2;

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] < min) {
                    min = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else {
                // Right half is sorted
                if (arr[mid] < min) {
                    min = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
public static void main(String[] args) {
    int[] arr = {4, 5, 6, 7, 0, 1, 2};

    System.out.println("Rotations: " + findKRotation(arr));
   }
}