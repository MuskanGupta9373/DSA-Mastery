package Array_medium_7;
import java.util.Arrays;          // for arrays.sort

public class longest_consecutive_sequence {
    static int longestConsecutive(int[] arr) {

        if (arr.length == 0)    // if array has no elements ans=0
            return 0;

        Arrays.sort(arr);      //sorts the entire array

        int count = 1;         // count stores length of current consecutive sequence
        int longest = 1;      //stores the biggest sequence length found so far

        for (int i = 1; i < arr.length; i++) {  // i=1 kunki hm compare kr rhe i and i-1 me

            if (arr[i] == arr[i - 1] + 1) {   //checks whether the current number is exactly one greater than the previous number
                count++;                       // increase count  3 == 2 + 1   3 == 3
            }
            else if (arr[i] != arr[i - 1]) {  //If the current number is not consecutive and also not a duplicate, start a new sequence from fresh
                count = 1;                     // start count frshly =1  ex- 12 != 4
            }

            longest = Math.max(longest, count); //stire largest value of count
        }

        return longest;
    }

public static void main(String[] args) {

        int[] arr = {100, 102, 100, 101, 101, 4, 3, 2, 3, 2, 1, 1, 12};

        System.out.println(longestConsecutive(arr));
     }
}
