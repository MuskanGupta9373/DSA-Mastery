package Array_hard7;
import java.util.*;

public class FourSumOptimal {
    public List<List<Integer>> fourSum(int[] nums, int target) { //receives the array and target, then returns a list of quadruplets
        int n = nums.length;
        List<List<Integer>> answer = new ArrayList<>(); //create empty list to store the unique quadruplets

        if (n < 4) {  // bcoz we need atleast 4 elements
            return answer;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) { //i<10  i ranges from 0-9
            if (i > 0 && nums[i] == nums[i - 1]) { //skip duplicates
                continue;
            }
             for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;   // set 2 pointers
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j]
                            + nums[left] + nums[right];

                    if (sum < target) {
                        left++;  //move left to the right to try a larger value

                    } else if (sum > target) {
                        right--;  //move right to the left to try a smaller value
                    } else {
                        answer.add(Arrays.asList(
                                nums[i], nums[j], nums[left], nums[right]
                        ));

                        left++;
                        right--;

                        while (left < right &&
                                nums[left] == nums[left - 1]) {
                            left++;  // skip duplicate at left ptr
                        }

                        while (left < right &&
                                nums[right] == nums[right + 1]) {
                            right--;  // s d a right p
                        }
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5};
        int target = 8;

        FourSumOptimal sol = new FourSumOptimal();
        System.out.println(sol.fourSum(nums, target));
    }
}
