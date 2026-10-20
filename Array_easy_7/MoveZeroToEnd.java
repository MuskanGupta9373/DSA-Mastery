package Array_easy_7;

public class MoveZeroToEnd {
    static void moveZeroes(int[] arr) {  //int[] arr mean method receives an integer array.

        int j = -1;       // j point to first 0 but -1 bcoz we have not found a 0 yet
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;        // if !=0 move i further i.e 1 store 1st zerom index hence now j point to 1st index
                break;
            }
        }

        for (int i = j + 1; i < arr.length; i++) {       // Find non-zero elements after j point 1 then i will point 2nd index

            if (arr[i] != 0) {
                int temp = arr[i];                         // Swap arr[i] and arr[j]
                arr[i] = arr[j];
                arr[j] = temp;                             //move non zero element to front

                j++;                                    // Move j forward now j=2 and i=3 and further
            }
        }
}
        static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
         }
     }
  }
