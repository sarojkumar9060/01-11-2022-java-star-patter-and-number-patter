import javax.lang.model.util.ElementScanner14;

public class starpattern21 {
 public static void main(String[] args) {
int row=5;
for(int i=1; i<=row; i++){
    for(int j=1; j<=row; j++){
        if(i>=2&& j>=2&&i<=4&&j<=4 ){
            System.out.print(" ");
        }else{
            System.out.print("*");
        }
    }
    System.out.println(" ");
}
}
}
// ***** 
// *   * 
// *   *
// *   *
// *****