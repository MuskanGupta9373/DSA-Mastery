package Array_hard7;
  import java.util.ArrayList;   // allow to use list<integer>
 import java.util.List;

public class Majority_ElementNbyThree {
    static List<Integer> majorityElement(int[] nums) {   // integer array leta h  and list of maj element deta h

        List<Integer> result = new ArrayList<>();   // creation of result list
        int n = nums.length;

        for (int i = 0; i < n; i++) {               // Check every element

            if (!result.contains(nums[i])) {        // count element if we haven't already added it to result
                int count = 0;                      // craete counter

                for (int j = 0; j < n; j++) {        // Count frequency of nums[i] by checking whole array
                    if (nums[j] == nums[i]) {
                        count++;
                    }
                }
                if (count > n / 3) {                              // Check if frequency is greater than n/3
                    result.add(nums[i]);
                }
            }
            if (result.size() == 2) {                 // At most 2 elements can occur more than n/3 times
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {

    int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};

    List<Integer> answer = majorityElement(nums);

     System.out.println("Majority elements: " + answer);
    }
}

/*
                               //OPTIMAL APROACH
   package Array_hard7;
   import java.util.ArrayList;   // allow to use list<integer>
  import java.util.List;

public class Majority_ElementNbyThree {
    public static List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;    
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        int n = nums.length;

        // Phase 1: Find potential candidates using Boyer-Moore Voting Algorithm
        for (int i = 0; i <= n - 1; i++) {
            if (cnt1 == 0 && nums[i] != el2) {
                cnt1 = 1;
                el1 = nums[i];
            } else if (cnt2 == 0 && nums[i] != el1) {
                cnt2 = 1;
                el2 = nums[i];
            } else if (nums[i] == el1) {
                cnt1++;
            } else if (nums[i] == el2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
      // Phase 2: Manual verification of the candidates
        List<Integer> result = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;

        for (int i = 0; i <= n - 1; i++) {
            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
        }

        int mini = n / 3;
        if (cnt1 > mini) result.add(el1);
        if (cnt2 > mini) result.add(el2);

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> ans = majorityElement(nums);
        System.out.println("Majority elements (> n/3): " + ans);
        // Output: [1, 2]
    }
}
 */