package Array_easy_7;

public class remove_duplicate {
    static int removeDuplicates(int arr[], int n){
        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i + 1;
}

 public static void main(String[] args) {
     int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};
     int n = arr.length;   //tell how many elements array hold n=8

     int newLength = removeDuplicates(arr, n);
     for(int i = 0; i < newLength; i++)  //0 up to newLength - 1
         System.out.print(arr[i] + " ");
 }
  }
