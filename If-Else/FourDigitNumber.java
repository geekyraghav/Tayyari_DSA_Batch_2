package Conditionals;
import java.util.Scanner;
public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(n>999){
            if(n<10000) System.out.println("4 Digit Number");
            else System.out.println("Not a 4 Digit Number");
        }
        else System.out.println("Not a 4 Digit Number");

//        if(n>999 && n<=9999)
//            System.out.println("4 Digit Number");
//        else System.out.println("Not a 4 Digit Number");
    }
}
