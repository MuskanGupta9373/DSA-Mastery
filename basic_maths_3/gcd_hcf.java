package basic_maths_3;

import java.util.Scanner;

public class gcd_hcf {
   public static void main(String[] args) {
        System.out.println("Enter  number :");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=Math.min(n1,n2);i>=1;i--){
            if(n1%i==0&&n2%i==0){
                System.out.print(i+" ");
                break;
            }

        }
    }
}
