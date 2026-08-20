package basic_maths_3;

import java.util.Scanner;

public class reverse_of_no {

    public static void main(String[] args) {
            System.out.println("enter a number");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
             int  revNum=0;
            while(n>0){
                int lastDigit=n%10;
                revNum=revNum*10+lastDigit;
                n=n/10;

            }
            System.out.println("Total digits: " +revNum);
        }

    }



