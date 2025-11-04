package TwoDimensionalArrays;

public class SnakePrint {
    public static void main(String[] args) {
        int[][] arr = {{6,9,6,2,4},{4,20,1,8,2},{11,5,7,3,8},{3,6,1,10,5}};
        int m = arr.length, n = arr[0].length;
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
