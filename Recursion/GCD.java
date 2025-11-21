package Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.println(hcf(a,b));
    }

    private static int hcf(int a, int b) {
        if(a==0) return b;
        return hcf(b%a,a);
    }
}
