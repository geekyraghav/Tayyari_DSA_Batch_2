package PatternPrinting;
import java.util.Scanner;
public class StarTriangleHorizontalFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // rows
            for(int j=1;j<=n+1-i;j++){ // cols
                System.out.print("* ");
            }
            System.out.println();
        }

//        // Mayank
//        for(int i=1;i<=n;i++){ // rows
//            for(int j=n;j>=i;j--){ // cols
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        // Ayush Tiwari
//        for(int i=n;i>=1;i--){ // rows
//            for(int j=1;j<=i;j++){ // cols
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
    }
}
