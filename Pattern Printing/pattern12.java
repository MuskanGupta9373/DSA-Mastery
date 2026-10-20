public class pattern12{
    static void print1(int n){
        int space;
        space=2*(n-1);
        for(int i=1;i<=n;i++){
     //for left side numbers       
            for(int j=1;j<=i;j++){
               System.out.print(j);
            }
   //for middle spaces
           for(int j=1;j<=space;j++){
            System.out.print(" ");
           }
    //for right side reverse no.
    for(int j=i;j>=1;j--) {
        System.out.print(j);
    }      
        
        System.out.println();
        space-=2;
}
    }

  public static void main(String[] args) {
    
    print1(4);
  }  
}
