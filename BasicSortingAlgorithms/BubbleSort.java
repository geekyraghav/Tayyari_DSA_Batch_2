package BasicSortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,8,1,9,3};
        int n = arr.length;
        print(arr);
        // Bubble Sort Optimised
        for(int i=0;i<n-1;i++){ // n-1 passes
            int swaps = 0;
            for(int j=0;j<=n-2-i;j++){
                if(arr[j]>arr[j+1]){ // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        print(arr);
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
