/*                      BRUTEFORCE APP
package Binary_Search__On_Answers_8;
import java.util.ArrayList;
public class Median_of_2_sorted_arrays {
    public static double findMedian(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        ArrayList<Integer> merged = new ArrayList<>();//Creates an empty list

        int i = 0, j = 0;

        // Merge both sorted arrays
        while (i < n1 && j < n2) {  //means continue while both arrays still have elements
            if (nums1[i] < nums2[j]) {
                merged.add(nums1[i]); //adds the first array's element if it is smaller
                i++;
            } else {
                merged.add(nums2[j]); // add second array element
                j++;
            }
        }
        // Add remaining elements
        while (i < n1) {
            merged.add(nums1[i]);  //adds any elements left in nums1
            i++;
        }

        while (j < n2) {
            merged.add(nums2[j]);
            j++;
        }

        int n = merged.size(); //returns the number of elements in the list

        // Find median
        if (n % 2 == 1) {
            return merged.get(n / 2);
        }
        else {
            return (merged.get(n / 2 - 1) + merged.get(n / 2)) / 2.0;
        }
    }
public static void main(String[] args) {

    int[] nums1 = {1, 3, 7, 10, 12};
    int[] nums2 = {2, 3, 6, 15};

    System.out.println("Median: " + findMedian(nums1, nums2));
   }
}

 */
     //              BETTER APP
package Binary_Search__On_Answers_8;
import java.util.ArrayList;
public class Median_of_2_sorted_arrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int total = n1 + n2;
        int mid = total / 2;

        int i = 0, j = 0;
        int prev = 0, curr = 0;

        for (int k = 0; k <= mid; k++) {  //while k is at most 4

            prev = curr;

            if (i < n1 && j < n2) {
                if (nums1[i] <= nums2[j]) {
                    curr = nums1[i];
                    i++;
                } else {
                    curr = nums2[j];
                    j++;
                }
            } else if (i < n1) {
                curr = nums1[i];
                i++;
            } else {
                curr = nums2[j];
                j++;
            }
        }

        if (total % 2 == 1) {
            return curr;
        } else {
            return (prev + curr) / 2.0;
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 7, 10, 12};
        int[] nums2 = {2, 3, 6, 15};

        System.out.println("Median: " +
                findMedianSortedArrays(nums1, nums2));
    }
}
//                       OPTIMAL APP
