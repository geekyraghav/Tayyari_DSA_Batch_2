package Basics;
import java.util.Scanner; // imp
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // imp
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x*y);
    }
}
