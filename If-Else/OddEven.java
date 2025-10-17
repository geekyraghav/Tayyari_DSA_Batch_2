package Conditionals;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
//        if(n%2 == 0) System.out.println("Even");
//        else System.out.println("Odd");

        // int x = (condition) ? if true : if false
        // sout ((condition) ? if true : if false)
        System.out.println((n%2 == 0) ? "Even" : "Odd");
    }
}
