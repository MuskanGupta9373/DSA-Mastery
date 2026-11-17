/*                            BRUTEFORCE
package Binary_Search__On_Answers_8;
public class Minimize_Max_Distance_to_Gas_Station {

    public static double minmaxGasDist(int[] arr, int k) {
        int n = arr.length;
        // howMany array keeps track of how many new gas stations are placed in each interval
        int[] howMany = new int[n - 1];

        // Step 1: Place k gas stations one by one greedily
        for (int gasS = 1; gasS <= k; gasS++) {
            double maxVal = -1;
            int maxInd = -1;

            // Find the interval with the maximum section length
            for (int i = 0; i < n - 1; i++) {
                double diff = arr[i + 1] - arr[i];
                double sectionLength = diff / (howMany[i] + 1);

                if (sectionLength > maxVal) {
                    maxVal = sectionLength;
                    maxInd = i;
                }
            }

            // Place a gas station in the interval that had the maximum length
            howMany[maxInd]++;
        }

        // Step 2: Calculate the maximum section length after all k stations are placed
        double maxAns = -1;
        for (int i = 0; i < n - 1; i++) {
            double diff = arr[i + 1] - arr[i];
            double sectionLength = diff / (howMany[i] + 1);
            maxAns = Math.max(maxAns, sectionLength);
        }
        return maxAns;
    }
public static void main(String[] args) {
    int[] arr = {1, 13, 17, 23};
    int k = 5;
    double result = minmaxGasDist(arr, k);
    System.out.println("Minimum possible maximum distance: " + result);
   }
}*/
//                         OPTIMAL APP
package Binary_Search__On_Answers_8;
public class Minimize_Max_Distance_to_Gas_Station {
      // Helper method to count how many gas stations are needed
    private static int countGasStations(double mid, int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int howMany = (int) ((arr[i + 1] - arr[i]) / mid);
            if ((arr[i + 1] - arr[i]) == (mid * howMany)) {
                howMany--;
            }
            cnt += howMany;
        }
        return cnt;
    }
    // Main logic method made static
    public static double minmaxGasDist(int[] arr, int k) {
        int n = arr.length;
        double low = 0;
        double high = 0;

        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, (double)(arr[i + 1] - arr[i]));  //finds the largest distance between adjacent existing gas stations
        }

        double ans = high;
        double diff = 1e-6; //0.000001

        while ((high - low) > diff) {
            double mid = low + (high - low) / 2.0;
            int cnt = countGasStations(mid, arr);

            if (cnt > k) {
                low = mid;
            }
            else {
                ans = mid;
                high = mid;
            }
        }
        return ans;
    }
public static void main(String[] args) {
    int[] arr = {1, 13, 17, 23};
    int k = 5;
    double result = minmaxGasDist(arr, k);

    System.out.println("Minimum possible maximum distance: " + result);
    }
}