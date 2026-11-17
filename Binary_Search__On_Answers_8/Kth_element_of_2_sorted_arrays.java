/*                       BRUTEFORCE APP
package Binary_Search__On_Answers_8;
public class Kth_element_of_2_sorted_arrays {
    public static int kthElement(int[] a, int[] b, int k) {
        int i = 0, j = 0;
        int count = 0; //Number of elements selected so far
        int current = 0;//recently selected element

        while (count < k) {
            if (i < a.length && (j >= b.length || a[i] < b[j])) {
                current = a[i];
                i++;
            } else {
                current = b[j];
                j++;
            }
            count++;
        }
        return current;
    }
    public static void main(String[] args) {
    int[] a = {2, 3, 6, 7, 9};
    int[] b = {1, 4, 8, 10};
    int k = 5;

    System.out.println("Kth element: " + kthElement(a, b, k));
  }
}*/

//                  BETTER APP
package Binary_Search__On_Answers_8;
public class Kth_element_of_2_sorted_arrays {
    public static int kthElement(int[] a, int[] b, int k) {
        int i = 0, j = 0;
        int count = 0;
        int answer = -1;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                answer = a[i];
                i++;
            } else {
                answer = b[j];
                j++;
            }

            count++;

            if (count == k) {
                return answer;
            }
        }

        while (i < a.length) {
            answer = a[i];
            i++;
            count++;

            if (count == k) {
                return answer;
            }
        }
        while (j < b.length) {
            answer = b[j];
            j++;
            count++;

            if (count == k) {
                return answer;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;

        System.out.println("Kth element: " + kthElement(a, b, k));
    }
}

//                  OPTIMAL APP
