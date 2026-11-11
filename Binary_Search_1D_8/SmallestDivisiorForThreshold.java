/*                       BRUTEFORCE
package Binary_Search_8;
public class SmallestDivisiorForThreshold {
    public static int smallestDivisor(int[] nums, int threshold) { //threshold — the maximum allowed sum
        int max = nums[0];

        // Find maximum element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; // we need maxm to find range for divisors from 1 to 9
            }
        }

        // Try every divisor from 1 to max
        for (int d = 1; d <= max; d++) {
            int sum = 0;

            // Calculate the sum using ceiling division
            for (int i = 0; i < nums.length; i++) {
                sum += (nums[i] + d - 1) / d;

                // Alternative: sum += Math.ceil((double) nums[i] / d);
            }

            // Check if sum is within the threshold
            if (sum <= threshold) {
                return d;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

        System.out.println("Smallest Divisor: "+ smallestDivisor(nums, threshold));
    }
}*/
 //                          OPTIMAL
package Binary_Search__On_Answers_8;
public class SmallestDivisiorForThreshold {
    public static int sumOfDivisions(int[] nums, int div) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] + div - 1) / div;
        }
        return sum;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];

        // Find maximum element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int low = 1;
        int high = max;
        int ans = -1;

        // Binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sumOfDivisions(nums, mid) <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

public static void main(String[] args) {
    int[] nums = {1, 2, 5, 9};
    int threshold = 7;

    System.out.println("Smallest Divisor: "+ smallestDivisor(nums, threshold));

   }
}