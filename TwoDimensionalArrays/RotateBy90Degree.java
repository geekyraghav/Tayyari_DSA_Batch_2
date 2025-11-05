package TwoDimensionalArrays;

public class RotateBy90Degree {
    public void rotateMatrix(int[][] arr) {
        // Auxiallary/Extra Space = O(1)
        // Space Complexity = O(m*n)
        // Time Complexity = O(m*n)
        // Transpose
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Reverse each column
        for(int col=0;col<arr[0].length;col++){
            int i=0, j=arr.length-1;
            while(i<j){ // i and j are rows
                int temp = arr[i][col]; // col remains same
                arr[i][col] = arr[j][col];
                arr[j][col] = temp;
                i++;
                j--;
            }
        }
        // for (int i = 0; i < n/2; i++) {
        //     for (int j = 0; j < n ; j++) {
        //         int temp = arr[i][j];
        //         arr[i][j] = arr[n-i-1][j];
        //         arr[n-i-1][j] = temp;
        //     }
        // }
    }
}
