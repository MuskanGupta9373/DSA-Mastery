/*            BRUTEFORCE
package Binary_Search_8;
public class CapacitytoShipPackagesWithinDDays {
    // Calculate how many days are required
    public static int findDays(int[] weights, int capacity) {
        int days = 1;
        int load = 0;

        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    // Find the minimum shipping capacity
    public static int shipWithinDays(int[] weights, int d) {
        int max = 0;
        int sum = 0;

        // Find maximum weight and total weight
        for (int w : weights) {
            max = Math.max(max, w);
            sum += w;
        }

        // Check every possible capacity
        for (int capacity = max; capacity <= sum; capacity++) {
            int requiredDays = findDays(weights, capacity);

            if (requiredDays <= d) {
                return capacity;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int d = 5;

    int result = shipWithinDays(weights, d);

    System.out.println("Minimum capacity required: " + result);
   }
}*/

//                     OPTIMAL

package Binary_Search__On_Answers_8;
public class CapacitytoShipPackagesWithinDDays {
    // Helper function to calculate the days required for a given capacity
    public static int func(int[] wt, int cap) {
        int day = 1;
        int load = 0;

        for (int i = 0; i < wt.length; i++) {
            if (load + wt[i] > cap) {
                day = day + 1;
                load = wt[i];
            }
            else {
                load = load + wt[i];
            }
        }
        return day;
    }

    // Optimal binary search method matching the pseudo-code
    public static int shipWithinDays(int[] weights, int days) {
        int maxi = 0;
        int sum = 0;

        // Find the maximum weight and total sum of weights
        for (int w : weights) {
            maxi = Math.max(maxi, w);
            sum += w;
        }

        int low = maxi;  // low starts at the maximum element
        int high = sum;  // high starts at the total sum

        // Binary search loop
        while (low <= high) {
            int mid = (low + high) / 2;
            int noOfDays = func(weights, mid);

            if (noOfDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        int result = shipWithinDays(weights, days);
        System.out.println("Minimum capacity required: " + result);
    }
}