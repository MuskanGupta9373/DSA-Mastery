/*                 BRUTEFORCE APP
package Binary_Search_8;
public class Kth_Missing_Positive_Integer {
    public static int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {   //Checks whether the current array element is less than or equal to the current value of k
                k++;
            } else {
                break;
            }
        }
        return k;
    }
    public static void main(String[] args) {
    int[] arr = {2, 3, 4, 7, 11};
    int k = 5;

    System.out.println("Kth Missing Positive Integer: "
            + findKthPositive(arr, k));
   }
}*/

//                       OPTIMAL APP
package Binary_Search__On_Answers_8;
public class Kth_Missing_Positive_Integer {
    public static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        System.out.println("Kth Missing Positive Integer: "+ findKthPositive(arr, k));
    }
}