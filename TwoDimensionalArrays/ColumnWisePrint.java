package TwoDimensionalArrays;

public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] arr = {{6,9,6,2,4},{4,20,1,8,2},{11,5,7,3,8},{3,6,1,10,5}};
        int m = arr.length, n = arr[0].length;
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        for(int i=0;i<m;i++){ // WRONG
//            for(int j=0;j<n;j++){
//                System.out.print(arr[j][i]+" ");
//            }
//            System.out.println();
//        }
    }
}
