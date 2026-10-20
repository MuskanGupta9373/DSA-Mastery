package Array_hard7;
 import java.util.ArrayList;   // to store triplets
  import java.util.Arrays;     // to sort array
 import java.util.List;        //use the List data type

public class ThreeSumOptimal {
    public List<List<Integer>> threeSum(int[] nums) {  //returns multiple triplets
        List<List<Integer>> result = new ArrayList<>(); //Creates an empty list to store valid triplets
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix one element
        for (int i = 0; i < n - 2; i++) {  // i repersent 1st element of triplet

            // If nums[i] is positive, sum cannot be 0
            if (nums[i] > 0) {   // sorted h agr +ve element ayega to sum 0 nhi goga toh stop
                break;
            }

            // Skip duplicate elements for 'i'
            if (i > 0 && nums[i] == nums[i - 1]) {  //prevents duplicate triplets
                continue;
            }

            // Step 3: Two pointers
            int left = i + 1;   // mtlb j i k bad
            int right = n - 1;  // mtlb k last m

            while (left < right) {   //search while the two pointers havent crossed
                int sum = nums[i] + nums[left] + nums[right];    // calculate sum

                // If sum is 0
                if (sum == 0) {
                    result.add(Arrays.asList(    // add number to result
                            nums[i],
                            nums[left],
                            nums[right]
                    ));

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left + 1]) {  // if left is pointing to a value that is repeated we skip
                        left++;     // to avoid same triplet
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right - 1]) {   // smae for right
                        right--;
                    }

                    // Move both pointers
                    left++;
                    right--;

                }
                // Sum is too small
                else if (sum < 0) {
                    left++;   // sorted h toh left wala pointer ko bdhayenge tb n high value milega
                }
                // Sum is too large
                else {
                    right--;    // low value k liye right wala pointer ko ghtaeyenge
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ThreeSumOptimal solution = new ThreeSumOptimal();  // create object of class
         int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> answer = solution.threeSum(nums);
        System.out.println("Triplets: " + answer);
    }
}