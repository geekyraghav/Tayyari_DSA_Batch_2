package Strings;

public class ReverseAString {
    public static void main(String[] args) {
//        String s = "abcdef";
//        String t = "";
//        for(int i=s.length()-1;i>=0;i--)
//            t += s.charAt(i);
//        s = t;
//        System.out.println(s);
        String s = "abcdefg";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);
    }
}
