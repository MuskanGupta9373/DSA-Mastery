package sorting_6;
import java.util.Scanner;
            public class reursive_insertion_sort  {
             static void insertionSort(int arr[], int n){
             if(n == 1) return;
             // first, sort the first (n-1) elements recursively i.e except last element sort all
            insertionSort(arr, n-1);

            // 10th line now after sorting all first four element decides to place last element at correct index
            int j = n-1;
            while(j > 0 && arr[j-1] > arr[j]){ // arr[j]=left index element j-1 is after that i.e right sided index element
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
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
            insertionSort(arr, n); //fxn call

            System.out.println("Sorted array:");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
