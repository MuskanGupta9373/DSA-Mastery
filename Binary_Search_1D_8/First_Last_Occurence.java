                          //BRUTEFORCE APPROACH
/*package Binary_Search;
import java.util.Arrays;

public class First_Last_Occurence {
    static int[] findFirstAndLast(int[] arr, int x) {

        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {

                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        return new int[]{first, last};
    }
public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int x = 8;
        int[] result = findFirstAndLast(arr, x);

      System.out.println(Arrays.toString(result));
    }
}*/

                          //OPTIMAL APPROACH

 package Binary_Search_1D_8;
 import java.util.Arrays;
 public class First_Last_Occurence {
     static int findFirst(int[] arr, int x) {
         int low = 0;
         int high = arr.length - 1;
         int first = -1;

         while (low <= high) {
             int mid = low + (high - low) / 2;

             if (arr[mid] == x) {
                 first = mid;     // changes
                 high = mid - 1;
             } else if (arr[mid] < x) {
                 low = mid + 1;
             } else {
                 high = mid - 1;
             }
         }

         return first;
     }

     static int findLast(int[] arr, int x) {
         int low = 0;
         int high = arr.length - 1;
         int last = -1;

         while (low <= high) {
             int mid = low + (high - low) / 2;

             if (arr[mid] == x) {
                 last = mid;           //changes
                 low = mid + 1;
             } else if (arr[mid] < x) {
                 low = mid + 1;
             } else {
                 high = mid - 1;
             }
         }

         return last;
     }
  public static void main(String[] args) {
 int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
  int x = 8;

  int first = findFirst(arr, x);
  int last = findLast(arr, x);
  int[] result = {first, last};

     System.out.println(Arrays.toString(result));
  }
}