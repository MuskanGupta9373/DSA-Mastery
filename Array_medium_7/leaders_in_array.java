package Array_medium_7;

public class leaders_in_array {
    static void printLeaders(int[] arr) {

        for (int i = 0; i < arr.length; i++) {     //Traverse through all elements

            boolean leader = true;

            for (int j = i + 1; j < arr.length; j++) {    // Check elements to the right

                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {                // Print immediately if it's a leader
                System.out.print(arr[i] + " ");
            }
        }
}
public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
           printLeaders(arr);
    }
}

                            //OPTMAL APPROACH

/*Start from right
      ↓
Rightmost = leader
      ↓
Keep max
      ↓
If arr[i] >= max → leader
      ↓
Store leader
      ↓
Reverse result*/

