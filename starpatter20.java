public class starpatter20 {
    public static void main(String args[]){
        int row=10;
        for(int i=0; i<=row; i++){
            for(int j=0; j<=row; j++){
                if(i==j|| i+j==row){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }
}
// *         * 
//  *       *  
//   *     *   
//    *   *
//     * *     
//      *
//     * *
//    *   *    
//   *     *
//  *       *
// *         *
