import java.util.Scanner;
public class palindromeNumber5 {
    // 111, 121, 131, 343, 555, 464

public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number:");
    int no=s.nextInt();
    int temp=no;
    int rev=0,rem;
    while(temp!=0){
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
    }if(no==rev){
        System.out.println(no+"this is pallindrome number");
    }else{
        System.out.println(no+"this is note pallindrome number");
    }
//     int no=121;
//     int temp=no;
//     int rev=0,rem;
//     while(temp!=0){
//         rem=temp%10;
//         rev=rev*10+rem;
//         temp=temp/10;
//     }
//     if(no==rev){
//         System.out.println(no+"this is pallindrome number");
//     }else{
//         System.out.println(no+"this is not pallindrome number");
//     }


}


}
