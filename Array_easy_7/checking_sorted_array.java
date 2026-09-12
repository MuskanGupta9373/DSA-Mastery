package Array_easy_7;
import java.util.Scanner;

public class checking_sorted_array {
    static boolean isSorted(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) { // this condition check every element
                return false;
            }
        }
        return true;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter array elements:");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }

    if(isSorted(arr, n)){
        System.out.println("Array is sorted");
    } else {
        System.out.println("Array is not sorted");
          }
  }
}
