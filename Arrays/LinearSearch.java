package OneDimensionalArrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] arr = {2, 4, 5, 4, 67, 7};
        boolean flag = false; // false means target doesn't exist in array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("found target");
                flag = true;
                break;
            }
        }
        if(flag==false) System.out.println("target not found");
    }
}
