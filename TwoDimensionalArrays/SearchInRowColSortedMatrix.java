package TwoDimensionalArrays;

public class SearchInRowColSortedMatrix {
    public static boolean matSearch(int arr[][], int target) {
        int m = arr.length, n = arr[0].length;
        int i = 0, j = n-1;
        while(i<m && j>=0){
            if(arr[i][j]>target) j--; // go left
            else if(arr[i][j]<target) i++; // go down
            else return true;
        }
        return false;
    }
}
