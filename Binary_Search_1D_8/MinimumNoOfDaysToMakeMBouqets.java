package Binary_Search__On_Answers_8;

public class MinimumNoOfDaysToMakeMBouqets {
    public boolean possible(int[] arr, int day, int m, int k) {
        int cnt = 0;     //counts the number of consecutive flowers that have bloomed
        int no_of_B = 0;  //counts the number of bouquets we can make
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {  //whether the current flower has bloomed by the day we are checking
                cnt++;
            }
            else {
                no_of_B += (cnt / k);
                cnt = 0;    //reset the count because an unbloomed flower breaks the consecutive group
            }
        }
        no_of_B += (cnt / k);

        if (no_of_B >= m) {
            return true;
        } else {
            return false;
        }
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;  //calculates the total number of flowers require m*k
        int n = bloomDay.length;

        // Edge case: if total flowers needed exceed available flowers
        if (val > n) {
            return -1;
        }

        int mini = Integer.MAX_VALUE;  // store smallest bloom day
        int maxi = Integer.MIN_VALUE;  // largest

        // Find minimum and maximum days in the array
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }

        // Linear iteration from mini to maxi day
        for (int i = mini; i <= maxi; i++) {
            if (possible(bloomDay, i, m, k) == true) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        MinimumNoOfDaysToMakeMBouqets obj =new MinimumNoOfDaysToMakeMBouqets();
        int[] bloomDay = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2;
        int k = 3;

        System.out.println(obj.minDays(bloomDay, m, k));
    }
}
