package PatternPrinting;
import java.util.Scanner;
public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // Bridge Road (First Line)
        for(int i=1;i<=2*n+1;i++){
            System.out.print("* ");
        }
        System.out.println();
        // Rest of Bridge
        for(int i=1;i<=n;i++){ // lines
            for(int j=1;j<=n+1-i;j++){ // stars
                System.out.print("* ");
            }
            for(int j=1;j<=2*i-1;j++){ // spaces
                System.out.print("  ");
            }
            for(int j=1;j<=n+1-i;j++){ // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
