package Array_hard7;
public class Maximum_Product_Subarray {

    public static int maxProduct(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;  // represrnt smallest possible int value

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int product = 1;    // initially stored product as 1

                for (int k = i; k <= j; k++) { //k visit each element between the starting index i and ending index j
                    product = product * arr[k];
                }
                max = Math.max(max, product); // return whichever value is greater
            }
        }
        return max;
    }
public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println(maxProduct(arr));
     }
}

/*                       BETTER APPROACH
   package Array_hard7;
  public class Maximum_Product_Subarray {
         int n = arr.length;
        int max = Integer.MIN_VALUE;
      for (int i = 0; i < n; i++) {
           int product = 1;
         for (int j = i; j < n; j++) {

                product = product * arr[j];  //multiplies the current product by the newly included element

                max = Math.max(max, product);  //Compares the current product with the maximum product found so faR
            }
        }
            return max;
    }
   public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println(maxProduct(arr));
    }
}

                    OPTIMAL APPROACH
 package Array_hard7;
 public class Maximum_Product_Subarray {
        int prefix = 1;       // Calculates product from the left
        int suffix = 1;       // calculates product from the right
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix = prefix * arr[i];      //multiplies the current prefix by the element at index I
            suffix = suffix * arr[n - 1 - i];     //arr[n - 1 - i] accesses elements from right to left.

            max = Math.max(max, Math.max(prefix, suffix));   // RETURN GREAYTER VALUE
        }

        return max;
    }
     public static void main(String[] args) {
         int[] arr = {2, 3, -2, 4};

        System.out.println(maxProduct(arr));
    }
}





 */

