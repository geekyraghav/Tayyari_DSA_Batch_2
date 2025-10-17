package Conditionals;
import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c)
                System.out.println(a+" is largest");
            else // c > a > b
                System.out.println(c+" is largest");
        }
        else{ // b >= a
            if(b>c)
                System.out.println(b+" is largest");
            else // c > b > a
                System.out.println(c+" is largest");
        }

//        if(a>=b && a>=c) System.out.println(a+" is largest");
//        else if(b>=a && b>=c) System.out.println(b+" is largest");
//        else System.out.println(c+" is largest");
    }
}
