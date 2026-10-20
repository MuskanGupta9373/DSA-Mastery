package Recursion_4;
import java.util.Scanner;
public class sumOf_n_no {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);   //sum(n-1) k wait ho rha
    }


    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));

    }
}