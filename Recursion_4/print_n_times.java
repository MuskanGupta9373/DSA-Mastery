package Recursion_4;
public class print_n_times {
    static int cnt = 0;

    static void print(){
        if(cnt == 3) return;
        System.out.println(cnt);
        cnt++;
        print();
    }

    public static void main(String[] args) {

        print();
    }
}