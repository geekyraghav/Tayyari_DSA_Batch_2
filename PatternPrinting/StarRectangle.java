package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int m = sc.nextInt();
        System.out.print("Enter Cols: ");
        int n = sc.nextInt();
        for(int i=1;i<=m;i++){ // rows
            for(int j=1;j<=n;j++){ // cols
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
