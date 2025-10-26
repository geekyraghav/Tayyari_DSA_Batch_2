package Methods;
public class PassByValue {
    public static void main(String[] args) {
        int x = 7;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
    public static void change(int x){
        x = 20;
    }
}
