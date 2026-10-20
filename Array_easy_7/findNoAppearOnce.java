package Array_easy_7;

public class findNoAppearOnce {
    static int findSingle(int arr[], int n){

        for(int i = 0; i < n; i++){
            int num = arr[i];
            int cnt = 0;

            for(int j = 0; j < n; j++){
                if(arr[j] == num){
                    cnt++;
                }
            }
            if(cnt == 1){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int arr[] = {4, 1, 2, 1, 2};
    int n = arr.length;
    System.out.println("Number appearing once:" + findSingle(arr, n));
   }
}

                         //OPTIMAL APPROACH
/*static int findSingle(int arr[], int n){
    int xor = 0;

    for(int i = 0; i < n; i++){
        xor = xor ^ arr[i];
    }

    return xor;
}

public static void main(String[] args) {
    int arr[] = {4, 1, 2, 1, 2};        4 ^ (1 ^ 1) ^ (2 ^ 2) =4 ^ 0 ^ 0= 4
    int n = arr.length;

   System.out.println("Number appearing once: " + findSingle(arr, n));
}
}*/