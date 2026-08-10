           //see expln claude
public class pattern17 {
    static void print1(int n){
        for(int i=0;i<n;i++){
      //for space before     
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
      //for characters
      char ch='A';
      int breakpoint=(2*i+1)/2;
       for(int j=1;j<=(2*i)+1;j++){
          System.out.print(ch);
          if(j<=breakpoint){
            ch++;
          }
          else{
            ch--;
          }

       }

      //for space after
      for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
             
        }
        System.out.println();

    }
}
    public static void main(String[] args) {
        print1(5);
    }
    
}
