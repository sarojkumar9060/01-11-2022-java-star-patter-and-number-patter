public class javastarnumberpatter26 {
    public static void main(String args[]){
        // int k=1;
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(k);
        //             k++;
        //     }
        //     System.out.println(" ");
        // }

        for(int i=1; i<=5; i++){
            int no=i;
            for(int j=1; j<=i; j++){
                System.out.print(no);
                no=no+5-j;
            }
            System.out.println(" ");
        }
    }
}

// 1 
// 26
// 3710
// 481113
// 59121415
