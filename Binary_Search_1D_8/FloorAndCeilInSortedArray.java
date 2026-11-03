package Binary_Search_1D_8;

public class FloorAndCeilInSortedArray {
    static int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    static int findCeil(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int x = 25;

        System.out.println("Floor: " + findFloor(arr, x));
        System.out.println("Ceil: " + findCeil(arr, x));
    }
}