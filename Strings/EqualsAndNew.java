package Strings;

public class EqualsAndNew {
    public static void main(String[] args) {
        String x = "Amol";
        // String y = "Amol";
        String y = new String("Amol");
        System.out.println(x==y);
        System.out.println(x.equals(y));
        System.out.println(x.compareTo(y));
    }
}
