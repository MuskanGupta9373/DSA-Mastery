package basic_maths_3;

import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }

    }
}
