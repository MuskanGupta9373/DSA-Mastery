package sorting_6;
import java.util.*;

class Solution {

         // Function joining two sorted halves into one
    public void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();//empty list to collect the merged result in  sorted order.
        int left = low, right = mid + 1;   //starts at the beginning of the first half and second half

        while (left <= mid && right <= high) {        //kya left and right side mein abhi bhi elements bache hain
            if (arr[left] <= arr[right])            // left index ki value right index ki value se choti or equal h toh
                temp.add(arr[left++]);      //temp list mein daal do.increment hoga index ki val and agla element check hoga
            else
                temp.add(arr[right++]);
        }

        while (left <= mid)            //left side ke bache huye elements ko utha ke temp mein daal deta hai.
            temp.add(arr[left++]);

        while (right <= high)          //right "                                                           "

            temp.add(arr[right++]);

        for (int i = low; i <= high; i++)//Copies everything from temp back into the real array arr, in the exact positions low to high.
            arr[i] = temp.get(i - low);
    }

    // Recursive merge sort
    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high)  //nothing to sort, so we stop.
            return;
        int mid = (low + high) / 2;  //Finds the middle index,

        mergeSort(arr, low, mid);     //Sorts the left half
        mergeSort(arr, mid + 1, high);  //Sorts the right half
        merge(arr, low, mid, high);  //Once both halves are sorted individually, this combines them into one sorted piece.
    }
}

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1};

        Solution sol = new Solution(); //creates an object of the Solution class
        sol.mergeSort(arr, 0, arr.length - 1);
//calls the sorting function on the whole array. 0 is the starting index, arr.length - 1 is the last valid index
        System.out.print("Sorted array: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}