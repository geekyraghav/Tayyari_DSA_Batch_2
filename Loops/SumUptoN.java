package Loops;

import java.util.Scanner;

public class SumUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int sum = 0;
//        for(int i=1;i<=n;i++){
//            sum += i;
//        }
        int sum = n*(n+1)/2;
        System.out.println(sum);
    }
}
