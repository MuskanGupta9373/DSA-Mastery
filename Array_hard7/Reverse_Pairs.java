/*package Array_hard7;
public class Reverse_Pairs {

    public static int Reverse_Pairs(int[] arr) { // method
    int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {  // as we need i<j

            if (arr[i] > 2L * arr[j]) {   // 2L means 2 is along it help prevent integer overflow
                cnt++;
            }
        }
    }
        return cnt;
}
public static void main(String[] args) {
    int[] arr = {40, 25, 19, 12, 3, 6, 2};

    System.out.println(Reverse_Pairs(arr));
   }
}*/
                            //OPTIMAL APPROACH
package Array_hard7;
public class Reverse_Pairs {

            public static int reversePairs(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static int mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return 0;
        }

        int mid = (low + high) / 2;

        int count = 0;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);

        count += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);

        return count;
    }

    static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;

        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2L * arr[right]) {
                right++;
            }

            count += right - (mid + 1);
        }

        return count;
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }


    public static void main(String[] args) {
    int[] arr = {40, 25, 19, 12, 9, 6, 2};

    System.out.println("Total Reverse Pairs: " + reversePairs(arr));
   }
}