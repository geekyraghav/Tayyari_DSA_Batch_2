package Recursion;
public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {18,45,7,333,87,33,16,76};
        int n = arr.length;
        reverse(0,n-1,arr);
        print(0,arr);
    }

    private static void reverse(int i, int j, int[] arr) {
        if(i>=j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(i+1,j-1,arr);
    }

    public static void print(int i, int[] arr) {
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }

//    // reverse order print (tail recursion) (call ke baad kaam)
//    public static void print(int i, int[] arr) {
//        if(i==arr.length) return;
//        print(i+1,arr);
//        System.out.print(arr[i]+" ");
//    }
}
