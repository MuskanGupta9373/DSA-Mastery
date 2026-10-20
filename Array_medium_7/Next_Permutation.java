package Array_medium_7;

public class Next_Permutation {
    static void nextPermutation(int[] arr) {
        int n = arr.length;
        int ind = -1;   //ind will store the breakpoint index since we have not found any index therefore -1

        // Step 1: Find breakpoint
        for (int i = n - 2; i >= 0; i--) { // we have to compare thats why we cant start from last index n toh n-2 kiye
            if (arr[i] < arr[i + 1]) {
                ind = i;              //1 h yha pivot toh [2, 1, 5, 4, 3, 0, 0]
                break;
            }
        }

        // Step 2: Find a bigger element and swap
        if (ind != -1) {   //1 != -1

            for (int i = n - 1; i > ind; i--) {  // start from i=6 and fins smllest greater number jaise 3
                if (arr[i] > arr[ind]) {

                    int temp = arr[i];
                    arr[i] = arr[ind];
                    arr[ind] = temp;
                                        //[2, 3, 5, 4, 1, 0, 0]
                    break;
                }
            }
        }
        // Step 3: Reverse the remaining part
        int left = ind + 1;   //1+1=2
        int right = n - 1;    //7-1=6

        while (left < right) {    //2<6

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;   // condition at 4<4 loop stop and finl array [2, 3, 5, 4, 1, 0, 0]
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0, 0};
           nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
       }
}