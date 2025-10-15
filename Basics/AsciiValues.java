package Basics;

public class AsciiValues {
    public static void main(String[] args) {
        char ch = '!'; int    a =        ch; // implicit typecasting
        System.out.println(a);

        char ch2 = '*';
        System.out.println((int)ch2); // explicit typecasting

        char ch3 = 'K';
        System.out.println(ch3+0);

        System.out.println('a'+'Z'); // char + char gives int

        int x = 91000000;
        char c = (char)x;
        System.out.println(c);

        char r = ' ';
        System.out.println(r+0);
    }
}
