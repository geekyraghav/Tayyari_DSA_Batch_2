package OneDimensionalArrays;
public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {6,5,1,7};
        System.out.println(x[0]);
        change(x);
        System.out.println(x[0]);
    }

    private static void change(int[] y) {
        y[0] = 20;
    }
}
