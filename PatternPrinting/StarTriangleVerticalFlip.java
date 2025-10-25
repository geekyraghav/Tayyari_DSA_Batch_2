package PatternPrinting;
import java.util.Scanner;
public class StarTriangleVerticalFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // Method - 2 (2 loops inside one loop)
        for(int i=1;i<=n;i++){ // lines
//            for(int j=n;j>i;j--){ // spaces (ayush)
//                System.out.print("  ");
//            }
            for(int j=1;j<=n-i;j++){ // spaces
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){ // stars
                System.out.print(j+" ");
            }
            System.out.println();
        }

//        // Method - 1 (Treat it like a square)
//        for(int i=1;i<=n;i++){ // rows
//            for(int j=1;j<=n;j++){ // cols
//                if(i+j > n) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
    }
}
