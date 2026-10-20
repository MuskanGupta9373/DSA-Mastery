public class pattern7 {
    
    static void print1(int n){
        for(int i=0;i<n;i++){
         //for spaces before stars
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
          //for star printing
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //for spaces after stars
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //for new line
            System.out.println();

        }
    }
    public static void main(String[] args) {
        
        print1(5);
    } 
    
}





