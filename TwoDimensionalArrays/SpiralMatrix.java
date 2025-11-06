package TwoDimensionalArrays;
import java.util.ArrayList;
public class SpiralMatrix {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int rows = arr.length, cols = arr[0].length;
        int sr = 0, er = rows-1, sc = 0, ec = cols-1;
        while(ans.size()<rows*cols){
            // start row
            for(int j=sc;j<=ec;j++)
                ans.add(arr[sr][j]);
            sr++;
            if(ans.size()>=rows*cols) break;
            // end col
            for(int i=sr;i<=er;i++)
                ans.add(arr[i][ec]);
            ec--;
            if(ans.size()>=rows*cols) break;
            // end row (reverse)
            for(int j=ec;j>=sc;j--)
                ans.add(arr[er][j]);
            er--;
            if(ans.size()>=rows*cols) break;
            // start col (reverse)
            for(int i=er;i>=sr;i--)
                ans.add(arr[i][sc]);
            sc++;
        }
        return ans;
    }
}
