package Recursion;

public class PassingStringsToMethods {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Raghav");
        change(s);
        System.out.println(s);
    }

    private static void change(StringBuilder s) {
        s.reverse();
    }
}
