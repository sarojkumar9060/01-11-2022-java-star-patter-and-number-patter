public class starpatter17 {
    public static void main(String args[]){
        int row=5;
        for(int i=1; i<=row; i++){
            for(int j=row; j>=i; j--){
               System.out.print(" ");

            }
            for(int k=1; k<=i;k++){
                if(i>=1&&k>1){
                    System.out.print(" ");

                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
//  *
//     * 
//    *
//   *
//  *