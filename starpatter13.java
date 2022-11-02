public class starpatter13 {
    public static void main(String args[]){ 
    int row =5;
    // for(int i=0; i<=row; i++){
    //     for(int j=row; j>=0; j--){
    //         System.out.print(" ");
    //     }
    //     for(int k=0; k<=i; k++){
    //         System.out.print(" *");
    //     }
    //     for(int l=0; l<=i; l++){
    //         System.out.print(" *");
    //     }
    //     System.out.println(" ");
    // }
    for(int i=1; i<=row; i++){
        for(int j=row; j>=i; j--){
            System.out.print(" ");
        }
        for(int k=1; k<(i*2);k++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
}