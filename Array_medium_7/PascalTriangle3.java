package Array_medium_7;

public class PascalTriangle3 {

    static int nCr(int n, int r) {            // Function to calculate nCr
        int result = 1;

        for (int i = 0; i < r; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }
        return result;
    }
    static void printTriangle(int n) {         // Function to print Pascal Triangle

        for (int row = 1; row <= n; row++) {    // for rows

            for (int col = 1; col <= row; col++) {  // for elemets printed in row  .as row no=elemet no

                int value = nCr(row - 1, col - 1);   // calculate pascal elemnt

                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);
  }
}