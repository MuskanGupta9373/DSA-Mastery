/*package Array_hard7;
import java.util.Arrays;
public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void merge(long[] arr1, long[] arr2, int n, int m) {

        long[] arr3 = new long[n + m];

        int i = 0;  //first array
        int j = 0;   //second array
        int k = 0;    //temporary array

        // Compare both arrays
        while (i < n && j < m) {     //i < n means the first array has an element left and j < m means the second array has an element left
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            }
            else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of arr1
        while (i < n) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2
        while (j < m) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        // Copy back into original arrays
        for (int p = 0; p < n; p++) {
            arr1[p] = arr3[p];
        }

        for (int p = 0; p < m; p++) {
            arr2[p] = arr3[n + p];
        }
    }

    public static void main(String[] args) {

    long[] arr1 = {1, 3, 5, 7};
    long[] arr2 = {0, 2, 6, 8, 9};
    merge(arr1, arr2, arr1.length, arr2.length);

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
}
}*/

package Array_hard7;
import java.util.Arrays;
public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void merge(long[] arr1, long[] arr2) {

        int n = arr1.length;
        int m = arr2.length;
        int len = n + m;

        int gap = (len + 1) / 2;

        while (gap > 0) {

            int left = 0;
            int right = left + gap;

            while (right < len) {

                // Both elements are in arr1
                if (left < n && right < n) {
                    if (arr1[left] > arr1[right]) {
                        long temp = arr1[left];
                        arr1[left] = arr1[right];
                        arr1[right] = temp;
                    }
                }

                // Elements are in different arrays
                else if (left < n && right >= n) {
                    if (arr1[left] > arr2[right - n]) {
                        long temp = arr1[left];
                        arr1[left] = arr2[right - n];
                        arr2[right - n] = temp;
                    }
                }

                // Both elements are in arr2
                else {
                    if (arr2[left - n] > arr2[right - n]) {
                        long temp = arr2[left - n];
                        arr2[left - n] = arr2[right - n];
                        arr2[right - n] = temp;
                    }
                }

                left++;
                right++;
            }

            if (gap == 1) {
                break;
            }

            gap = (gap + 1) / 2;
        }
    }

public static void main(String[] args) {

    long[] arr1 = {1, 3, 5, 7};
    long[] arr2 = {0, 2, 6, 8, 9};

    merge(arr1, arr2);

    System.out.println("arr1: " + Arrays.toString(arr1));
    System.out.println("arr2: " + Arrays.toString(arr2));
}
}