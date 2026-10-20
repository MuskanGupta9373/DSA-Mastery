package Array_medium_7;
import java.util.Arrays;
public class SortArraysOf_0s_1s_2s {
    static void sortArray(int[] arr) {

        int count0 = 0;    // creating counters which store how many 0,1,2,are there
        int count1 = 0;
        int count2 = 0;

        // Count 0, 1 and 2
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                count0++;
            }
            else if (arr[i] == 1) {
                count1++;
            }
            else {
                count2++;
            }
        }
        // Put 0s
        for (int i = 0; i < count0; i++) {    // count0=5
            arr[i] = 0;
        }

        // Put 1s
        for (int i = count0; i < count0 + count1; i++) {    // count1=4
            arr[i] = 1;
        }

        // Put 2s
        for (int i = count0 + count1; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0, 1, 2, 0, 0, 0, 1, 1, 1, 2, 2, 2};
        sortArray(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

                            //OPTIMAL SOLUTION

/*import java.util.*;

class Main {

    static void sortArray(int[] arr) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {

                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }

            else if (arr[mid] == 1) {
                mid++;
            }

            else {

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        sortArray(arr);

        System.out.println("Sorted array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/