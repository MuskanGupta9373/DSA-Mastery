package Array_medium_7;

public class Majority_Element_1 {
    static int findMajorityElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { //Let's take each element and check how many times it appears
              int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > n / 2) {

                return arr[i];
            }
        }

        return -1;
    }
public static void main(String[] args) {

    int[] arr = {2, 2, 1, 3, 1, 2, 2};

    int answer = findMajorityElement(arr);

    System.out.println("Majority Element: " + answer);
     }
}
                           //OPTIMAL APPROACH
        /*public class MajorityElementOptimal {

    static int findMajorityElement(int[] arr) {

        int count = 0;
        int element = 0;          //stores the current possible majority element.

        // Find possible majority element
        for (int i = 0; i < arr.length; i++) {

            if (count == 0) {      // if cnt=0 mtlb prevo=ious elemnt cancel ho gya
                element = arr[i];     //start chosing new element
                count = 1;
            }
            else if (arr[i] == element) {
                count++;
            }
            else {
                count--;
            }
        }

        // Check the element
        count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return element;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5};

        int answer = findMajorityElement(arr);

        System.out.println("Majority Element: " + answer);
    }
}*/

