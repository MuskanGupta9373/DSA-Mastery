package Array_hard7;

public class Count_Number_Of_Subarrays_given_XOR_K {
    public static int countSubarrays(int[] arr, int target) {
        int n = arr.length;
        int cnt = 0;

        for (int i = 0; i < n; i++) {  // starting index

            for (int j = i; j < n; j++) {  //endimg index
                int xor = 0;

                for (int k = i; k <= j; k++) {  // k is variable that iterate through i and j
                    xor = xor ^ arr[k];  // Each element is XORed with the current value of xor
                }

                if (xor == target) {   // our require variable is target =6
                    cnt++;
                }
            }
        }
        return cnt;
    }
public static void main(String[] args) {
    int[] arr = {4, 2, 2, 6, 4};
    int target = 6;

    int result = countSubarrays(arr, target);
    System.out.println("Number of subarrays with XOR " + target + " is: " + result);
  }
}

/*
                           //BETTER APPROACH

package Array_hard7;
   public class Count_Number_Of_Subarrays_given_XOR_K {
   public static int countSubarrays(int[] arr, int target) {
        int cnt = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int xor = 0;

            for (int j = i; j < n; j++) {
                xor = xor ^ arr[j];

                if (xor == k) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;

        System.out.println(countSubarrays(arr, k));
    }
}
 */

/*
                            //OPTIMAL APPROACH
package Array_hard7;
import java.util.HashMap;        //we need to store prefix XOR values and how many times each value has appeared
public class Count_Number_Of_Subarrays_given_XOR_K {

     public static int countSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int xor = 0;
        int cnt = 0;

        map.put(0, 1);      //We store prefix XOR 0 with frequency 1 before processing the array

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];

            int x = xor ^ k;   // main logic

            if (map.containsKey(x)) {
                cnt = cnt + map.get(x);
            }

            map.put(xor, map.getOrDefault(xor, 0) + 1);   // map.getOrDefault(xor, 0) returns the existing frequency
        } return cnt;
    }

   public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;

        System.out.println(countSubarrays(arr, k));
    }
}
 */