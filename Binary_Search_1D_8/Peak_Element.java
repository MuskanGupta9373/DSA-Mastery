                     //BRUTEFORCE APPROACH
/*package Binary_Search_8;
public class Peak_Element {
    static int findPeakElement(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (i == 0 && arr[i] > arr[i + 1]) {
                return i;
            }
            else if (i == n - 1 && arr[i] > arr[i - 1]) {
                return i;
            }
            else if (i > 0 && i < n - 1 &&
                    arr[i] > arr[i - 1] &&
                    arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};

    System.out.println("Peak element " + arr[findPeakElement(arr)] + " at index " + findPeakElement(arr));
   }
}*/
                           // OPTIMAL APPROACH
package Binary_Search_1D_8;
public class Peak_Element {
    static int findPeak(int[] arr, int n) {

        if (n == 1) {
            return 0;
        }

        if (arr[0] > arr[1]) {
            return 0;
        }

        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[mid - 1] &&
                    arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

public static void main(String[] args) {
    int[] arr = {1,10,13,7,6,5,4,2,1,0};

    int index = findPeak(arr, arr.length);

    System.out.println("Peak element index: " + index);
    }
}