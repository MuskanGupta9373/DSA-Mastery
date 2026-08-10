public class pattern20{
    static void print1(int n){
       int space=2*n-2;
       for(int i=1;i<=2*n-1;i++){
        int stars=i;
        if(i>n)stars=2*n-i;
         //for stars before
       for(int j=1;j<=stars;j++){
        System.out.print("*");
       }
       //for spaces
       for(int j=1;j<=space;j++){
        System.out.print(" ");
       }

        //for stars after
       for(int j=1;j<=stars;j++){
        System.out.print("*");
       }
        System.out.println();
        if(i<n){
            space -=2;//pehle space ght rha h 
        }
        else{
            space +=2;//n=6 bad space bdh rha h
        }
       }

    }
    public static void main(String[] args) {
        print1(10);
    }
}