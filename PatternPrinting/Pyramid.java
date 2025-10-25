package PatternPrinting;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;
        for(int i=1;i<=n;i++){ // lines
            for(int j=1;j<=nsp;j++){ // spaces
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){ // stars
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }

//        for(int i=1;i<=n;i++){ // lines
//            for(int j=1;j<=n-i;j++){ // spaces
//                System.out.print("  ");
//            }
//            for(int j=1;j<=2*i-1;j++){ // stars
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
