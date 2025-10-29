package OneDimensionalArrays;

import java.util.Scanner;

public class ArraysSyntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = {95,-10,89,80,98,50};
        System.out.println(x[3]);
        System.out.println(x[1]);
        x[1] = -20; // change
        System.out.println(x[1]);
        x[1] *= x[1];
        System.out.println(x[1]);
        x[1] = sc.nextInt();
        System.out.println(x[1]);
    }
}
