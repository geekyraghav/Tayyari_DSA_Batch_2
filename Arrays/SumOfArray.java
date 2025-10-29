package OneDimensionalArrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {143,11,7,88,16,45,17,18,67,-4,23,432,43,122,43,7,5,-1000};
        // System.out.println(arr.length);
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
