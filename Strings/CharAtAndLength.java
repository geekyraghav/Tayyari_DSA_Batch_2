package Strings;

public class CharAtAndLength {
    public static void main(String[] args) {
        String s = "Anish";
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        String str = "Sneha Mishra";
        System.out.println(str.length());
        System.out.println(str.charAt(2)); // str[2]
        // str.charAt(2) = 'o'; // not allowed
    }
}
