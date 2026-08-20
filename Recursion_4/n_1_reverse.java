package Recursion_4;
import java.util.Scanner;

public class n_1_reverse {
    private static void f(int i, int n) {
        if (i <1) {
            return;
        }
        System.out.println(i);
        f(i -1, n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n, n);
    }
}