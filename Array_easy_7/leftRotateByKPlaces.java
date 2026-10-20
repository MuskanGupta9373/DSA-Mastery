package Array_easy_7;

public class leftRotateByKPlaces {
    // Function to reverse part of the array
    static void reverse(int[] a, int start, int end) {
        end = end - 1;                      // last index is exclusive n
        while (start < end) {              //swap until left index smaller than right index

            int temp = a[start];           //save the left element temporarily; temp=1
            a[start] = a[end];              //a[0]=a[2]  ; 1=3
            a[end] = temp;                  // swapped 1&3 and 2 will be in middle
            start++;                        //start+1  now a[1]=start ;2
            end--;                          //end-1    now a[1]=end  ;2  toh swap hoga v toh whi rhega
        }
    }

    static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int n = 7;
        int d = 3;
        reverse(a,0, d);       //Reverse first d elements index 0,1,2

        reverse(a, d, n);             //Reverse remaining elements n-d index 3,4,5,6

        reverse(a,0, n);         //Reverse complete array index 0-6

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
