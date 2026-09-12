package Array_easy_7;
import java.util.Scanner;
public class largest_element {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];                        //let first element to be largest
            for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
            System.out.println("Largest element is : " + largest);
    }
}



