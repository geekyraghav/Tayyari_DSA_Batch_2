package Loops;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter Power: ");
        int b = sc.nextInt();
        int ans = 1;
        for(int i=1;i<=b;i++){
            if(a==1) break;
            ans *= a;
            if(a==0) break;
        }
        if(a==0 && b==0) System.out.println("Invalid");
        else System.out.println(a+" raised to the power "+b+" is "+ans);
    }
}
