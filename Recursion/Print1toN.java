package Recursion;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    private static void print(int n) {
        if(n==0) return; // base case
        print(n-1); // call
        System.out.print(n+" "); // work
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        print(1,n);
//    }
//
//    private static void print(int x, int n) {
//        if(x>n) return;
//        System.out.print(x+" ");
//        print(x+1,n);
//    }

//    static int n;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        print(1);
//    }
//
//    private static void print(int x) {
//        if(x>n) return;
//        System.out.print(x+" ");
//        print(x+1);
//    }
}
