package TwoDimensionalArrays;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] arr = {{6,9,6,2},{4,20,1,8},{11,5,7,8},{3,6,10,5}};
        print(arr);
        // Transpose
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }

    private static void print(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
