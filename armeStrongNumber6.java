public class armeStrongNumber6 {
    //1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748
    // Program To Check for Armstrong Number 
    public static void main(String args[]){
        int no=153;
        int t1=no;
        int leng=0;
        while(t1!=0){
            leng=leng+1;
            t1=t1/10;
        }
        int t2=no;
        int arm=0;
        int rem;
        while(t2!=0){
            int mul=1;
            rem=t2%10;
            for(int i=1; i<=leng;i++){
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;

        }
        if(arm==no){
            System.out.println(no+"is armstrong");
        }else{
            System.out.println(no+"is no armstrongs");
        }

    }
}
