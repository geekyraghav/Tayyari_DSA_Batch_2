package PatternPrinting;
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;
        for(int i=1;i<=2*n-1;i++){ // lines
            for(int j=1;j<=nsp;j++){ // spaces
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){ // stars
                System.out.print("* ");
            }
            if(i<n){
                nsp--;
                nst += 2;
            }
            else{
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }

//        // Upper Pyramid
//        for(int i=1;i<=n;i++){ // lines
//            for(int j=1;j<=n-i;j++){ // spaces
//                System.out.print("  ");
//            }
//            for(int j=1;j<=2*i-1;j++){ // stars
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        // Lower Pyramid
//        int star = 2*(n-1)-1;
//        for(int i=1;i<=n-1;i++){ // lines
//            for(int j=1;j<=i;j++){ // spaces
//                System.out.print("  ");
//            }
//            for(int j=1;j<=star;j++){ // stars
//                System.out.print("* ");
//            }
//            star -= 2;
//            System.out.println();
//        }
    }
}
