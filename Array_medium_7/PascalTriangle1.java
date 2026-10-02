package Array_medium_7;

public class PascalTriangle1 {
    static long nCr(int n, int r) {   // this fxn calculate nCr and long use kiye h taki large value store kr paye

        long result = 1;              // starting me result m 1 store kiye kyunki 1st row m 1 he h bs ushi me further value multiply hoga

        for (int i = 0; i < r; i++) {
            result = result * (n - i);      //multiplies the current result by the required numerato
            result = result / (i + 1);      //divides by the required denominator
        }

        return result;
    }
    static long getElement(int r, int c) {  // function finds the Pascal Triangle element at row r column c. long=return type ,r&c=input h

        return nCr(r - 1, c - 1);      //Calculate (r-1) C (c-1)
    }
public static void main(String[] args) {

    int r = 5;
    int c = 3;

    long answer = getElement(r, c);   // call fxn

    System.out.println("Element = " + answer);
    }
 }
