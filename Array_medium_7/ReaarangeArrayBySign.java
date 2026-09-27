package Array_medium_7;
import java.util.Arrays;

public class ReaarangeArrayBySign {
    static int[] rearrangeArray(int[] arr) {

        int n = arr.length;

        int[] positive = new int[n / 2];  //we have eaqual no.of +ve and-ve
        int[] negative = new int[n / 2];

        int p = 0;    //where to put the next positive/negative number.
        int ne = 0;

        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {                //if no is +ve
                positive[p] = arr[i];       // put in positive[p]
                p++;                        // increase p
            } else {
                negative[ne] = arr[i];
                ne++;
            }
        }
            // Put positive at even index
            // Put negative at odd index
            for (int i = 0; i < n / 2; i++) {

                arr[2 * i] = positive[i];
                arr[2 * i + 1] = negative[i];
            }
            return arr;
        }
        public static void main(String[] args) {
          int[] arr = {3, 1, -2, -5, 2, -4};
          rearrangeArray(arr);

            System.out.println(Arrays.toString(arr));
        }
    }

    /*
import java.util.Arrays;

public class ArrayManipulator {

    public static int[] rearrangeBySign(int[] nums) {

        int n = nums.length;  //tell how many elements are present

        int[] ans = new int[n];

        int pos = 0;  // position for positive numbers
        int neg = 1;  // position for negative numbers

        // Visit every element one by one
        for (int i = 0; i < n; i++) {

            int num = nums[i];

            if (num > 0) {
                ans[pos] = num;
                pos = pos + 2;
            }
            else {
                ans[neg] = num;
                neg = neg + 2;
            }
        }
          ```java
import java.util.Arrays;

public class ArrayManipulator {

    public static int[] rearrangeBySign(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        int pos = 0;  // position for positive numbers
        int neg = 1;  // position for negative numbers

        // Visit every element one by one
        for (int i = 0; i < n; i++) {

            int num = nums[i];

            if (num > 0) {
                ans[pos] = num;         // ans[0] = 1;
                pos = pos + 2;          //0 → 2 → 4 → 6
            }
            else {
                ans[neg] = num;
                neg = neg + 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, -4, -5};

        int[] result = rearrangeBySign(nums);

        System.out.println(Arrays.toString(result));
    }
}

return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, -4, -5};

        int[] result = rearrangeBySign(nums);

        System.out.println(Arrays.toString(result));
    }
}
*/
