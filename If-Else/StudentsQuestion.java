package Conditionals;
import java.util.Scanner;
public class StudentsQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(n%5 == 0 && n%3 == 0) System.out.println("Nitish");
        else if(n%3 == 0) System.out.println("Rehmat");
        else if(n%5 == 0) System.out.println("Ayush");
        else System.out.println("Mayank");

//        if(n%5 == 0 && n%3 != 0) System.out.println("Ayush");
//        if(n%3 == 0 && n%5 != 0) System.out.println("Rehmat");
//        if(n%5 == 0 && n%3 == 0) System.out.println("Nitish");
//        if(n%5 != 0 && n%3 != 0) System.out.println("Mayank");
    }
}
