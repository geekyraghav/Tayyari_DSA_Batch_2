package OneDimensionalArrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {18,7,45,10,333,1,93,22,17}; // {18,7,45,22,93,1,333,10,17};
        int n = arr.length;
        int i = 3, j = 7;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        //        for(int i=0;i<n/2;i++){
//            // swap i and n-1-i
//            int temp = arr[i];
//            arr[i] = arr[n-i-1];
//            arr[n-i-1] = temp;
//        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
