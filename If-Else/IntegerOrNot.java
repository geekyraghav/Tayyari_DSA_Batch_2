package Conditionals;
import java.util.Scanner;
public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n == (double)x) System.out.println("Integer");
        else System.out.println("Not an integer");
    }
}
