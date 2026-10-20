package basic_maths_3;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  revNum=0;
        int duplicate=n;             //
        while(n>0){
            int lastDigit=n%10;
            revNum=revNum*10+lastDigit;   //
            n=n/10;

        }
        if(duplicate==revNum){                   //
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }

    }
}
