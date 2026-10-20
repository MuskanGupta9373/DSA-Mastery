/*                        BRUTEFORCE APPROACH
package Array_hard7;
public class Missing_Repeated_Number {
    public static void findNumbers(int[] arr) {
        int n = arr.length;
        int repeating = -1;
        int missing = -1;


        for (int i = 1; i <= n; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == i) { //checks whether the current array element equals the number we're searching for
                    cnt++;
                }
            }


            if (cnt == 2) {
                repeating = i;
            }

            else if (cnt == 0) {
                missing = i;
            }

            if (repeating != -1 && missing != -1) { //repeating  and missing number has been found.
                break;
            }
        }

        System.out.println("Repeating Number: " + repeating);
        System.out.println("Missing Number: " + missing);
    }
public static void main(String[] args) {
    int[] arr = {4, 3, 6, 2, 1, 1};
     findNumbers(arr);
    }
 }*/
//                       BETTER APPROACH


/*package Array_hard7;
     public class Missing_Repeated_Number {
     public static void main(String[] args) {

            int[] arr = {4,3,6,2,1,1};
            int n = arr.length;

            int[] freq = new int[n + 1];  //n = 6, the frequency array has 7 elements

              for (int i = 0; i < n; i++) {
                  freq[arr[i]]++;        //increases the frequency of that number by
               }

            int repeating = -1;
            int missing = -1;

              for (int i = 1; i <= n; i++) {

                if (freq[i] == 2) {
                    repeating = i;
                }

                if (freq[i] == 0) {
                    missing = i;
                }
            }

            System.out.println("Repeating Number: " + repeating);
            System.out.println("Missing Number: " + missing);
        }
    }
 */
       //                      OPTIMAL APPROACH

package Array_hard7;
public class  Missing_Repeated_Number {
    public static void findNumbers(int[] arr) {
        long n = arr.length;

        long Sn = (n * (n + 1)) / 2;
        long Sn2 = (n * (n + 1) * (2 * n + 1)) / 6;

        long S = 0, S2 = 0;

        // Calculate actual sum (S) and sum of squares (S2) from the array
        for (int i = 0; i < n; i++) {
            S += arr[i];          //add the current element to the actual sum
            S2 += (long) arr[i] * arr[i];     // sane for square
        }

        long val1 = S - Sn;                         // Equation 1: x - y = S - Sn

        long val2 = S2 - Sn2;                      // Equation 2: x^2 - y^2 = S2 - Sn2

        long val3 = val2 / val1;       // From x^2 - y^2 = (x - y)(x + y), we get: x + y = (val2 / val1)

        long repeating = (val1 + val3) / 2;          // x = (val1 + val3) / 2

        long missing = repeating - val1;              // y = x - val1

        System.out.println("Repeating Number (x): " + repeating);

        System.out.println("Missing Number (y): " + missing);
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        findNumbers(arr);
    }
}