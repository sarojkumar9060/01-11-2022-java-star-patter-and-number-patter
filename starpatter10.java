public class starpatter10 {
    public static void main(String args[]){
        // int row =5;
        // int col=4;
        for(int i=1; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print(" "); 
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");

            }
            System.out.println(" ");
        }


        for(int i=5; i>=0; i--){
            for(int j=4; j>=i; j--){
                System.out.print(" "); 
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
// * 
// **
// ***
// ****
// *****
// *****
// ****
// ***
// **
//  *
