package OneDimensionalArrays;

import java.util.Arrays;

public class ShallowCopyOfArray {
    public static void main(String[] args) {
        int x = 10;
        int y = x; // x and y do alag alag variables
        int[] a = {5,2,7,8,3};
        int[] b = a; // b and a same array ko point kar rahe hai
        b[0] = 50;
        System.out.println(a[0]);
        int[] c = Arrays.copyOf(a,a.length); // c is an entirely new array
        c[1] = 20;
        System.out.println(a[1]);
        int[] d = new int[a.length]; // d is an entirely new array
        for(int i=0;i<a.length;i++){
            d[i] = a[i];
        }
        d[2] = 70;
        System.out.println(a[2]);
    }
}
