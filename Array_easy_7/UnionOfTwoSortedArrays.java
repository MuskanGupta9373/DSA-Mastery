package Array_easy_7;
import java.util.*;
public class UnionOfTwoSortedArrays {
    static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};

        TreeSet<Integer> set = new TreeSet<>();  // TS remove duplicate and keep sorted

        for (int i = 0; i < arr1.length; i++) { // Add elements of first array
            set.add(arr1[i]);                    //set = [1, 2, 3, 4, 5]
        }

        for (int i = 0; i < arr2.length; i++) {   // Add elements of second array
            set.add(arr2[i]);                      //set = [1, 2, 3, 4, 5, 6]
        }

        for (int num : set) {                        // Print union
            System.out.print(num + " ");
        }
    }
}
