package Loops;
import java.util.Scanner;
public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}
