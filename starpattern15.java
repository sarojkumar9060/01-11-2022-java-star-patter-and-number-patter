public class starpattern15 {
    public static void main(String args[]){
        int row=5;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
              if(i>=2 && j<=i-1){
                System.out.print(" ");
              }else{
                System.out.print("*");
              }

            }
            System.out.println(" ");
        }
        

        
    }
}
