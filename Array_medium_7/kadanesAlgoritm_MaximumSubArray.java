package Array_medium_7;

public class kadanesAlgoritm_MaximumSubArray {
    static int maxSubarraySum(int[] arr) {

        int n = arr.length;      //store size of array
        int max = Integer.MIN_VALUE;  // variable for sstoring largest sum found

        for (int i = 0; i < n; i++) {   // Choose starting index

            for (int j = i; j < n; j++) {    // Choose ending index

                int sum = 0;
                for (int k = i; k <= j; k++) {    // Calculate sum from i to j
                    sum = sum + arr[k];
                }

                if (sum > max) {               // Update maximum sum
                    max = sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 3, 4, -1, -2, 1, 5, -3};
        int answer = maxSubarraySum(arr);

        System.out.println("Maximum Subarray Sum: " + answer);
    }
}

                            //Better approach

/*public class MaxSubarrayBetterSolution {

    static int maxSubarraySum(int[] arr) {

        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                sum = sum + arr[j];           //CHANGES- add current element to previous sum

                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
          int[] arr = {-2, 3, 4, -1, -2, 1, 5, -3};

           int answer = maxSubarraySum(arr);

        System.out.println("Maximum Subarray Sum: " + answer);
    }
}*/

 /*public class MaxSubarrayKadane {

    static int maxSubarraySum(int[] arr) {

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 3, 4, -1, -2, 1, 5, -3};

        int answer = maxSubarraySum(arr);

        System.out.println("Maximum Subarray Sum: " + answer);
    }
}*/