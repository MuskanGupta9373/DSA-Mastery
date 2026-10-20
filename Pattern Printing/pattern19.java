public class pattern19{
    static void print1(int n){
        int inis=0;
        for(int i=0;i<n;i++){
    //for before stars
         for(int j=1;j<=n-i;j++){
            System.out.print("*");
         }
     //for spaces
     for(int j =0;j<inis;j++){
        System.out.print(" ");
     }

    //for after stars
         for(int j=1;j<=n-i;j++){
            System.out.print("*");
         }  
         inis +=2;
         System.out.println();   


        }

    
         //for next half

          inis=8;
        for(int i=1;i<=n;i++){
    //for before stars
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
     //for spaces
     for(int j =0;j<inis;j++){
        System.out.print(" ");
     }

    //for after stars
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }  
         inis -=2;
         System.out.println();   


        }

    }


    public static void main(String[] args) {
        
        print1(5);
    }

    
    
}

