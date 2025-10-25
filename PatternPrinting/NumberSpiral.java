package PatternPrinting;
import java.util.Scanner;
public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){ // rows
            for(int j=1;j<=2*n-1;j++){ // cols
                int a = (i<=n) ? i : 2*n-i;
                int b = (j<=n) ? j : 2*n-j;
                System.out.print(Math.min(a,b)+" ");
                // System.out.print(n+1-Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}
