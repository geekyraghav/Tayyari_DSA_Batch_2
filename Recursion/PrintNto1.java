package Recursion;
import java.util.Scanner;
public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    private static void print(int n) {
        if(n==0) return; // base case
        System.out.print(n+" "); // work
        print(n-1); // call
    }
}
