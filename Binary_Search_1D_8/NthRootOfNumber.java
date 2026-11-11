/*                    BRUTEFORE APPROACH
package Binary_Search_8;
public class NthRootOfNumber {
    static long power(int base, int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= base;
        }

        return result;
    }
    static int findNthRoot(int n, int m) {
        for (int i = 1; i <= m; i++) {
            long val = power(i, n);

            if (val == m) {
                return i;
            } else if (val > m) {
                break;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int n = 3;
    int m = 27;

    System.out.println("Nth root: " + findNthRoot(n, m));
    }
}*/

//                     OPTIMAL APPROACH
package Binary_Search__On_Answers_8;
public class NthRootOfNumber {

    static long power(int base, int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= base;

            if (result > Integer.MAX_VALUE) {
                return result;
            }
        }
            return result;
    }
    static int findNthRoot(int n, int m) {  //n=cube root m=target
        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = power(mid, n);        //power(14, 3)

            if (val == m) {
                return mid;
            }
            else if (val < m) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 3, m = 27;

        System.out.println("Nth root: " + findNthRoot(n, m));
    }
}