package Array_medium_7;
               //better solution
public class Pascal_Triangle2 {

    static void printRow(int n) {           // fxn prints nth row

            long ans = 1;
        System.out.print(ans + " ");             // First element is always 1

        for (int i = 1; i < n; i++) {           // calculate remaining elements

            ans = ans * (n - i);         //multiplies the previous element by (n-i)
            ans = ans / i;               // divide by i

            System.out.print(ans + " ");      //print calculated eleement
        }
    }


public static void main(String[] args) {

    int n = 5;

    System.out.print("Row " + n + ": ");
            printRow(n);
   }
}
