package Array_easy_7;

public class Find_Missing_No {
    static int missingNumber(int arr[], int n){

        for(int i = 1; i <= n; i++){  //i for outer loop for chosing no.
            int flag = 0; // tell number not found yet

            for(int j = 0; j < n-1; j++){  // j for inner loop for searching no. in array
                if(arr[j] == i){ //is current no equal to no. i am looking for
                    flag = 1; //  if found mark flg=1
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return -1;
    }

public static void main(String[] args) {
    int arr[] = {1, 2, 4, 5};
    int n = 5;
    System.out.println("Missing number: " + missingNumber(arr, n));
   }
}
                       // how it finds for i=3
//flag = 0
//j=0: arr[0]=1 == 3? NO
//j=1: arr[1]=2 == 3? NO
//j=2: arr[2]=4 == 3? NO
//j=3: (loop condition j < n-1 → j < 4, so j=3 is the last check) arr[3]=5 == 3? NO
//
//Inner loop finishes completely without ever finding a match
//
//Check: flag==0? YES! → return 3 immediately


                       //optimal solution using sum approach

/*public class MissingNumberOptimal {

    static int missingNumber(int arr[], int n){
        int sum = n * (n+1) / 2;  // expected sum of numbers 1 to n
        int s2 = 0;

        for(int i = 0; i < n-1; i++){            //LOGIC
            s2 += arr[i];
        }

       return sum - s2;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};
        int n = 5;

        System.out.println("Missing number: " + missingNumber(arr, n));
    }
}*/