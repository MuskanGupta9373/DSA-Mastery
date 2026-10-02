package Array_medium_7;
import java.util.*;   //list  set arraylist hashset arrays
public class ThreeSum {
                     //Bruteforce approach
    static List<List<Integer>> threeSum(int[] arr) {      //take integer array  and return  list of triplets

        Set<List<Integer>> set = new HashSet<>();    // hashhset bcoz dont need deuplicate triplets this keep only one copy

        int n = arr.length;

        // Check every possible combination of 3 elements
        for (int i = 0; i < n; i++) {         // select 1st elemt

            for (int j = i + 1; j < n; j++) {    // select 2nd elem

                for (int k = j + 1; k < n; k++) {    //select 3rd eleem

                    // Check if sum is 0
                    if (arr[i] + arr[j] + arr[k] == 0) {

                        List<Integer> triplet = Arrays.asList(     // create triplet  [-1, 2, -1]
                                arr[i], arr[j], arr[k]
                        );

                        Collections.sort(triplet);          // Sort triplet  sort in this order   [-1, -1, 2]


                        set.add(triplet);            // add triplet to set
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
public static void main(String[] args) {

    int[] arr = {-1, 0, 1, 2, -1, -4};

    List<List<Integer>> result = threeSum(arr);

    System.out.println("Unique Triplets: " + result);
    }
}

/*
                             // better solution
   package Array_medium_7;
   import java.util.*;                                //list  set arraylist hashset arrays
   public class ThreeSum {
          static List<List<Integer>> threeSum(int[] arr) {     //takes an array and returns a list of triplets

          Set<List<Integer>> result = new HashSet<>();      // store final triplets

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            Set<Integer> set = new HashSet<>();   // hr i ke liye empty set bnaya  jo stores elements that we have already seen while moving j

            for (int j = i + 1; j < n; j++) {

                int third = -(arr[i] + arr[j]);   // find third elemet

                if (set.contains(third)) {    // check hashset that Have we already seen the required third element

                    List<Integer> triplet =    // create kro triplet ko
                            Arrays.asList(arr[i], arr[j], third);

                    Collections.sort(triplet);  // sort kro  in proper ordr

                    result.add(triplet);    // store kro unique triplet
                }

                set.add(arr[j]);    // add kro current ellemet ko hashset me 
            }
        }

        return new ArrayList<>(result);
    }

   public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> answer = threeSum(arr);

        System.out.println(answer);
    }
}

 */