package Methods;

public class PredictTheOutputReturn {
    public static void main(String[] args) {
        System.out.println(angan(80));
    }

    public static int angan(int x) {
        if(x<50) return x*x;
        System.out.println("Gyaan");
        if(x<75) return x;
        System.out.println("Kasim");
        return x+10;
    }
}
