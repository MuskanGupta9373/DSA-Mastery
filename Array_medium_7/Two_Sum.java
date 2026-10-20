package Array_medium_7;

public class Two_Sum {
    static void twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("YES");
                    System.out.println("Indices: " + i + ", " + j);
                    return;
                }
            }
        }

        System.out.println("NO");
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        twoSum(arr, target);
    }
}



