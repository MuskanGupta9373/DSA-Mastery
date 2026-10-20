package Recursion_4;
import java.util.*;
public class fibonacci {
    static int f(int n) {
        if (n <= 1) {
            return n;
        }
        int last = f(n - 1);
        int slast = f(n - 2);
        return last + slast;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));

    }
}






