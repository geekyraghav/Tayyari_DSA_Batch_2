package Recursion;
import java.util.Scanner;
public class NumberOfPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(paths(1,1,m,n,""));
    }

    private static int paths(int row, int col, int m, int n, String s) {
        if(row==m && col==n){
            System.out.println(s);
            return 1;
        }
        if(row>m || col>n) return 0;
        return paths(row,col+1,m,n,s+'R') + paths(row+1,col,m,n,s+'D');
    }


//    public int numberOfPaths(int m, int n) {
//        return helper(1,1,m,n);
//    }
//    private int helper(int row, int col, int m, int n) {
//        if(row==m && col==n) return 1; // one correct ans
//        if(row>m || col>n) return 0; // wrong path
//        int rightWays = helper(row,col+1,m,n);
//        int downWays = helper(row+1,col,m,n);
//        return rightWays + downWays;
//    }

//    public int numberOfPaths(int m, int n) {
//        if(m==1 || n==1) return 1;
//        int rightWays = numberOfPaths(m,n-1);
//        int leftWays = numberOfPaths(m-1,n);
//        return leftWays + rightWays;
//    }
}
