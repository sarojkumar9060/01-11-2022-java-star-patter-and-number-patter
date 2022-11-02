public class primenumber2 {
    public static void main(String args[]){
        // alll prime number print 
        int no=8;
        int temp=0;
        for(int i=2; i<=no-1; i++){
            if(no%i==0){
                temp=temp+1;
            }
        }if(temp==0){
            System.out.println(no +" "+"this is prime number");
        }else{
            System.out.println(no+" "+"this is not prime number");
        }
    }
}
