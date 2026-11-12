/*                       BRUTEFORCE APPROACH
package Binary_Search_8;
import java.util.Arrays;
public class Aggressive_Cows {
    public static boolean canWePlace(int[] arr, int dist, int cows) {
        int cntCows = 1;   //place the first cow in the first stall, so the cow count starts at 1
        int last = arr[0];  //place the first cow in the first stall, so the cow count starts at 1

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                cntCows++;
                last = arr[i];
            }
        }
        if (cntCows >= cows) {
            return true;
        } else {
            return false;
        }
    }

    public static int aggressiveCows(int[] arr, int cows) {
        Arrays.sort(arr); // Sort the stall positions
        int n = arr.length;
        int maxDist = arr[n - 1] - arr[0];              // max - min

        for (int i = 1; i <= maxDist; i++) {
            if (canWePlace(arr, i, cows) == true) {
                continue;
            } else {
                return i - 1;
            }
        }
        return maxDist;
    }
  public static void main(String[] args) {
    int[] stalls = {0, 3, 4, 7, 10, 9};
    int cows = 4;

    int ans = aggressiveCows(stalls, cows);
    System.out.println("The maximum possible minimum distance is: " + ans);
   }
}
*/
      //                     OPTIMAL SOLUTION

package Binary_Search__On_Answers_8;
import java.util.Arrays;
public class Aggressive_Cows {

    public static boolean canWePlace(int[] arr, int dist, int cows) {
        int cntCows = 1;
        int last = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                cntCows++;
                last = arr[i];
            }
        }

        if (cntCows >= cows) {
            return true;
        } else {
            return false;
        }
    }

    public static int aggressiveCows(int[] arr, int cows) {
        Arrays.sort(arr);
        int n = arr.length;

        int low = 0;
        int high = arr[n - 1] - arr[0];
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canWePlace(arr, mid, cows) == true) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;

        int maxMinDist = aggressiveCows(stalls, cows);
        System.out.println("The maximum possible minimum distance is: " + maxMinDist);
    }
}