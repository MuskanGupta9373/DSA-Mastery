package Array_easy_7;

public class leftRotateArrayByOne {
    static void main() {
        int[] arr = {10, 22, 31, 44, 52};
        int temp = arr[0];
        for (int i = 1; i <arr.length; i++) {
            arr[i - 1] = arr[i];
            arr[arr.length - 1] = temp;

            for ( i = 0; i <arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

