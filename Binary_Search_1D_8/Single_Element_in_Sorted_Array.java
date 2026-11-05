/*                    BRUTEFORCE APROACH
package Binary_Search;
public class Single_Element_in_Sorted_Array {
    public static int findSingleElement(int[] arr) {
        int n = arr.length;

        if (n == 1) {   // if array has single element that will be ans
            return arr[0];
        }
        for (int i = 0; i < n; i++) {

            // First element
            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            }

            // Last element
            else if (i == n - 1) {
                if (arr[i] != arr[i - 1]) {    // compares the last element with its previous element
                    return arr[i];
                }
            }

            // Middle elements
            else {
                if (arr[i] != arr[i - 1]
                        && arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int[] arr = {1, 1, 2, 3, 3, 4, 4};

    System.out.println("Single Element: " + findSingleElement(arr));

     }
} */
                      //BETTER APPROACH
/*package Binary_Search;
public class Single_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        int xor = 0;

        for (int num : arr) {
            xor = xor ^ num;  //1 ^ 1 = 0; 3 ^ 3 = 0;  4 ^ 4 = 0; 8 ^ 8 = 0;  2^0=2
        }

        System.out.println("Single Element: " + xor);
    }
}*/

//                  OPTIMAL APPROACH

package Binary_Search_1D_8;
public class Single_Element_in_Sorted_Array {
    public static int findSingleElement(int[] arr) {
        int n = arr.length;
          if (n == 1) {
            return arr[0];
          }

        if (arr[0] != arr[1]) {   //compare the first element with its next element
            return arr[0];
        }

        if (arr[n - 1] != arr[n - 2]) {  // simlilarly for last and seccond last
            return arr[n - 1];
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

   //Check whether mid is the single element
            if (arr[mid] != arr[mid - 1]
                    && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
 //        Decide which half to eliminate
            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1])
                    || (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {

                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

    System.out.println("Single Element: "+ findSingleElement(arr));
    }
}