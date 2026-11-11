/*                        BRITEFORCE APPROACH

package Binary_Search_8;
 public class SquareRootOfNumber {
    public static void main(String[] args) {
        int n = 28;
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            if (i * i <= n) {
                ans = i;
            } else {
                break;
            }
        }
        System.out.println("The integer square root of " + n + " is: " + ans);
    }
}*/
//                     OPTIMAL APPROACH
package Binary_Search__On_Answers_8;
public class SquareRootOfNumber {
    public static int findSqrt(int n) {
        int low = 1;
        int high = n;
        int ans = 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if mid squared is less than or equal to n

            if ((long) mid * mid <= n) {  //long prevents potential integer overflow for large numbers
                ans = mid;                // Store current valid answer
                low = mid + 1;            // Search in the right half
            }
            else {
                high = mid - 1;            // Search in the left half
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 28;
        System.out.println("The integer square root of " + n + " is: " + findSqrt(n));
    }
}