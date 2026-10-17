package Array_hard7;
  import java.util.*;
  public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) { //num-input array , target-required  . list kyuki multiple set ho skta h
        Set<List<Integer>> st = new HashSet<>();  // created empty set st
        int n = nums.length;

        for (int i = 0; i < n; i++) {                  // Try all quads
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        long sum = (long) nums[i] + nums[j];   // these add all 4 selected elemets
                        sum += nums[k];
                        sum += nums[l];

                        if (sum == target) {   // found target -create list of 4 selected value
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(temp);  // sort in ascending oder
                            st.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(st);
}
  public static void main(String[] args) {
    int[] nums = {1, 0, -1, 0, -2, 2};
    int target = 0;
    System.out.println(fourSum(nums, target));
  }
}

/* package Array_hard7;
  import java.util.*;
  public class FourSum {
     public List<List<Integer>> fourSum(int[] nums, int target) {   //List<List<Integer>>-eturns a list containing multiple quadruplets
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();  // set to store unique quadruplets

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                Set<Long> seen = new HashSet<>(); //Creates an empty set for the current i and j pair.

                for (int k = j + 1; k < n; k++) {

                    long fourth = (long) target         // long help to avoid integer overflow
                            - nums[i] - nums[j] - nums[k];

               if (seen.contains(fourth)) {
                        List<Integer> quad = Arrays.asList(
                                nums[i], nums[j], nums[k], (int) fourth
                        );

                        Collections.sort(quad); //sort obtained quad...
                        result.add(quad);
                    }

                    seen.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(result);
    }
}
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
         Solution sol = new Solution();
        System.out.println(sol.fourSum(nums, target));
    }
}

 */
