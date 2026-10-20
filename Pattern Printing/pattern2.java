public class pattern2 {
    
    static void print1(){
        for(int i=0;i<5;i++){
            //for(int j=0;j<=i;j++) also
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        
        print1();
    } 
    
}

