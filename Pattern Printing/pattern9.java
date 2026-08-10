public class pattern9 {
    
    // Upper half — pyramid (spaces decrease, stars increase)
    static void printUpper(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){       // ✅ '<=' ko '<' kiya, symmetry ke liye
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Lower half — inverted pyramid (spaces increase, stars decrease)
    static void printLower(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printUpper(5);
        printLower(5);
    }
}












