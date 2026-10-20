public class pattern4 {
    
    static void print1(int n){
        for(int i=1;i<=n;i++){
    
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        
        print1(5);
    } 
    
}



