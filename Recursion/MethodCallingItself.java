package Recursion;

public class MethodCallingItself {
    static int n = 0;
    public static void main(String[] args) {
        shivam();
    }

    private static void shivam() {
        if(n==30) return;
        System.out.println("harsh");
        n++;
        shivam();
    }
}
