package basic_maths_3;
import java.util.Scanner;
public class count_digits {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int lastDigit=n%10;
            count=count+1;
            n=n/10;
        }
        System.out.println("Total digits: " +count);
    }

}

