/*
package Binary_Search__On_Answers_8;
public class Book_Allocation_Problem {
    public static int countStudents(int[] arr, int pages) {
        int student = 1;
        int pagesStudent = 0; //variable stores the total pages assigned to the current student.

        for (int i = 0; i < arr.length; i++) {
            if (pagesStudent + arr[i] <= pages) {  //hecks whether the current book can be assigned to the current student without exceeding the page limit
                pagesStudent += arr[i];  //adds the current book's pages to the student's total
            }
            else {
                student++;
                pagesStudent = arr[i];
            }
        }
        return student;
    }

    public static int findPages(int[] arr, int m) {  //finds the minimum possible maximum page limit
        int n = arr.length;

        if (m > n) { //more students than books, every student cannot receive at least one book.
            return -1;
        }
        int low = arr[0];  //largest book's page count
        int high = arr[0];  //sum of all book pages

        for (int i = 1; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        for (int pages = low; pages <= high; pages++) {  //tries every possible maximum page limit
            if (countStudents(arr, pages) <= m) {
                return pages;
            }
        }
        return -1;
    }

public static void main(String[] args) {
    int[] arr = {25, 46, 28, 49, 24};
    int m = 4;

    int ans = findPages(arr, m);
    System.out.println("The maximum number of pages for allocation is: " + ans);
    }
}*/
//                    OPTIMAL   SOLN
package Binary_Search__On_Answers_8;
public class Book_Allocation_Problem {
    public static int countStudents(int[] arr, int pages) {
        int student = 1;
        int pagesStudent = 0; //Stores the total pages assigned to the current student

        for (int i = 0; i < arr.length; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            }
            else {
                student++;  //need another student
                pagesStudent = arr[i];
            }
        }
        return student;
    }
    public static int findPages(int[] arr, int m) {
        int n = arr.length;
        if (m > n) {
            return -1;
        }

        int low = arr[0];
        int high = 0;  // store total pages

        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(arr, mid);

            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int m = 4;

        int ans = findPages(arr, m);
        System.out.println("The optimal maximum number of pages for allocation is: " + ans);
    }
}