/*                       BRUTEFORCE
package Binary_Search_8;
public class KokoEatingBanana {
      static long calculateHours(int[] arr, int speed) {
        long hours = 0;

        for (int i = 0; i < arr.length; i++) {
            hours += (arr[i] + speed - 1) / speed; //calculates the hours needed for the current pile and adds them to the total.hour = pile size/speed
        }
        return hours;
    }

    static int minEatingSpeed(int[] arr, int h) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int speed = 1; speed <= max; speed++) {  //stop at max Because eating at the largest pile's size per hour is sufficient to finish every pile in at most one hour per pile.
            if (calculateHours(arr, speed) <= h) {
                return speed;
            }
        }
        return max;
    }

public static void main(String[] args) {
    int[] arr = {3, 6, 7, 11};
    int h = 8;

    System.out.println("Minimum eating speed: " + minEatingSpeed(arr, h));
    }
}*/

//                                OPTIMAL
 package Binary_Search__On_Answers_8;
    public class KokoEatingBanana {
    static long func(int[] arr, int hourly) {
        long hours = 0;

        for (int i = 0; i < arr.length; i++) {
            hours += (arr[i] + hourly - 1) / hourly;  //hour= (pile size+speed-1)/speed
        }
        return hours;
    }

    static int maxElement(int[] arr) { // to find largest pile
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int bs(int[] arr, int h) {
        int low = 1;
        int high = maxElement(arr);   //11
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hours = func(arr, mid); //calls func() to calculate how many hours are needed at the middle speed

            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        int h = 8;

        System.out.println("Minimum eating speed: " + bs(arr, h));
    }
}