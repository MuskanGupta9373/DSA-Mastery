package Recursion_4;
import java.util.Scanner;

public class name_n_time {

    private static void f(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("MUSKAN");
        f(i+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(1, n);
        //sc.close();

    }

}




