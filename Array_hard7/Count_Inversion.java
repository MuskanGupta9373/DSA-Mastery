//                             BRUTEFORCE APPROACH
package Array_hard7;
import java.util.Arrays;
public class Count_Inversion {
    public static int countInversions(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { //  second elements select after first element
                if (arr[i] > arr[j]) {   // if yeas we found inversion
                    count++;
                }
            }
        }

        return count;
}
public static void main(String[] args) {
    int[] arr = {5,3,2,4,1};

    System.out.println("Array: " + Arrays.toString(arr));
    System.out.println("Inversions: " + countInversions(arr));
   }
}

//                               OPTIMAL APPROACH
