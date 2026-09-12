package Array_easy_7;

public class linear_search {
    static int linearSearch(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int num = 30;

        int result = linearSearch(arr, num);
        System.out.println("Element found at index: " + result);
    }
}
