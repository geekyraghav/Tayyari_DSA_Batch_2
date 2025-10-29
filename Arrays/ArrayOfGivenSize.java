package OneDimensionalArrays;
import java.util.Scanner;
public class ArrayOfGivenSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; // n size ka array ban gaya
        System.out.print("Enter Array Elements: ");
        // input
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // output
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) System.out.print(arr[i]+" ");
        }
    }
}
