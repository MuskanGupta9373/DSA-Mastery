class sorting_6 {
    public void quickSort(int[] arr, int low, int high) {        // Function to perform quicksort
        if (low < high) {                                         // Base case
            int pivotIndex = partition(arr, low, high);         // Find pivot index

            quickSort(arr, low, pivotIndex - 1);            // Sort left subarray

            quickSort(arr, pivotIndex + 1, high);            // Sort right subarray
        }
    }
                 // Function to partition array
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];                                  // Choose last element as pivot

        int i = low - 1;                                        // Initialize i, -1

        for (int j = low; j < high; j++) {                      // Traverse from low to high-1
             if (arr[j] <= pivot) {                            // If element <= pivot
                 i++;                                          // Increment i and swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place pivot in correct position
             int temp = arr[i + 1];
             arr[i + 1] = arr[high];
             arr[high] = temp;

         return i + 1;                                     // Return pivot index
    }
}
 class quick_sorting {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        sorting_6 sol = new sorting_6();
        // Call quickSort
        sol.quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}