package basic_maths_3;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;          //
        int revNum=0;
        int duplicate=n;
        while(n>0){
            int lastDigit=n%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);     //
            n=n/10;
            revNum=revNum*10+lastDigit;
        }
        if(duplicate==sum){                    //
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not a armstrong");
        }
    }
}

