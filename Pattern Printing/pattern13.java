public class pattern13 {
    static void print1(int n){
        int num=1;
        for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                System.out.print(num);
                num=num+1;
             }
             System.out.println();
        }

    }
    public static void main(String[] args) {
        print1(5);
    }
    
}
