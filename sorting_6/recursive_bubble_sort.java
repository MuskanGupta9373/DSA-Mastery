package sorting_6;

import java.util.Scanner;

public class recursive_bubble_sort {
    static void bubbleSort(int arr[], int n){
                                              // base case: if array size is 1 or 0, it's already sorted
         if(n == 1) return;
                                            // one pass: push the largest element to the end
            for(int j = 0; j < n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
                                            // recursive call on the remaining (n-1) elements
            bubbleSort(arr, n-1);//calls the function again, but tells it to only worry about the first n-1 elements this time — because the last one is already sorted
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
            bubbleSort(arr, n);                //fxn call
            System.out.println("Sorted array:");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
