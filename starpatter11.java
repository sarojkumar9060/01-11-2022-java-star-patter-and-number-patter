public class starpatter11 {
    public static void main(String args[]){
        int row=5;
        int col=4;
        for(int i=1; i<=row; i++){
            for(int j=col; j>=i; j--){
                System.out.print(" ");

            }
            for(int k=1; k<=i; k++){
                System.out.print("*");

            }
            System.out.println(" ");
        }
       
        for(int i=row; i>=1; i--){
            for(int j=col; j>=i; j--){
                System.out.print(" ");

            }
            for(int k=1; k<=i; k++){
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
