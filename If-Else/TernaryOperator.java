package Conditionals;
import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int x = (n<0) ? 10 : 100;
//        int x = (n<0) ? ((n<-50) ? 5 : 10) : 100;
        System.out.println(x);
    }
}
