package Array_medium_7;

public class NumberOfSubarraysWithSumK {
    static int countSubarrays(int[] arr, int target) {
    int count = 0;                      //stores the number of subarrays whose sum is equal to target

    for (int i = 0; i < arr.length; i++) {   // Choose starting index
        for (int j = i; j < arr.length; j++) {  // Choose ending index

            int sum = 0;

            for (int k = i; k <= j; k++) {       // Calculate sum from i to j
                sum = sum + arr[k];
            }
            if (sum == target) {                 // Check whether sum is target
                count++;
            }
        }
    }

        return count;
}
public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
      int target = 3;
      int answer = countSubarrays(arr, target);
      System.out.println("Number of subarrays = " + answer);
 }
}


/*
                               //BETETR APPROACH

       public class NumberOfSubarrayWithSumK {

      static int countSubarrays(int[] arr, int k) {

        int count = 0;
      for (int i = 0; i < arr.length; i++) {              // Choose starting index

              int sum = 0;

       for (int j = i; j < arr.length; j++) {              // Choose ending index

                sum = sum + arr[j];                         // Check if sum is equal to k .keep the previous sum and add only the new element.
                if (sum == k) {
                count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
       int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;

        int answer = countSubarrays(arr, k);   //methiod check all subrray and return sum

        System.out.println("Number of subarrays = " + answer);
    }
}
 */

/*
                             //OPTIMAL APPROACH
                             
 */