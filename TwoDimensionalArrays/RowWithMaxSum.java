package TwoDimensionalArrays;
public class RowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{6,9,6,2,4},{4,20,1,8,2},{11,5,7,3,8},{3,6,1,10,5}};
        int m = arr.length; // rows
        int n = arr[0].length; // cols
        int maxSum = Integer.MIN_VALUE;
        int row = 0;
        for(int i=0;i<m;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += arr[i][j];
            }
            if(sum>maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println(maxSum+" "+row);
    }
}
