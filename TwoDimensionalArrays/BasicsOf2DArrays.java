package TwoDimensionalArrays;

import java.util.Scanner;

public class BasicsOf2DArrays {
    public static void main(String[] args) {
//        int[][] arr = new int[4][3];
//        for(int i=0;i<4;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

//        int[][] arr = {{3,6,2,7},{6,3,3,8},{9,0,1,0}};
//        for(int i=0;i<3;i++){
//            for(int j=0;j<4;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int m = sc.nextInt();
        System.out.print("Enter Cols: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        // output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
