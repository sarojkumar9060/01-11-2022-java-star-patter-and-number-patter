public class starpatter18 {
    public static void main(String args[]){
        int row=5;
        for(int i=0; i<=row; i++){
            for(int j=row; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<(i*2);k++){
                if(k>1&&k<(i*2)-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
               
            }
            System.out.println(" ");
        }
     
    }
}


// * 
// * *
// *   *
// *     *
// *       *