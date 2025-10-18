package Loops;
import java.util.Scanner;
public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 2 5 8 11 ....
//        // n iterations
//        for(int i=2;i<=3*n-1;i+=3){
//            System.out.print(i+" ");
//        }

//        // n iterations
//        for(int i=1;i<=n;i++){
//            System.out.print((2+(i-1)*3)+" ");
//        }

        // n iterations
        // 101 97 93..
        int a = 101, d = -4;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a += d;
        }
    }
}
