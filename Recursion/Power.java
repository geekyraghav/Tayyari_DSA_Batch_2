package Recursion;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter Power: ");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }

    private static int pow(int a, int b) { // TC = O(logb)
        if(b==0) return 1;
        int call = pow(a,b/2);
        if(b%2 == 0) return call*call;
        else return call*call*a;
    }

//    private static int pow(int a, int b) { // TC = O(b)
//        if(b==0) return 1;
//        return a * pow(a,b-1);
//    }
}
