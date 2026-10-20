package Recursion_4;

public class factorial {
    static int f(int n) {
        if (n == 0) return 1;
        return n *f(n - 1);
    }
public static void main(String[] args) {
    int n = 5; //user input
    System.out.println(f(n));

}
}
