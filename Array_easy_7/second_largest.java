package Array_easy_7;
import java.util.Scanner;
public class second_largest {
     static int secondLargest(int arr[], int n){
        int largest = arr[0];
        int slargest = -1;

         for(int i = 1; i < n; i++){       //i=1 kyunki i=0 ko largest man liye h
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        return slargest;
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

    int result = secondLargest(arr, n);   //fxn callinf
    System.out.println("Second largest element: " + result);
    }
}
