package sorting_6;
import java.util.Scanner;
public class insertion_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++){         // changes
            int j = i;

            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
