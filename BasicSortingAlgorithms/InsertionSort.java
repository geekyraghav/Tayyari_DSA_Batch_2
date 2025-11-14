package BasicSortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,8,1,9,3};
        int n = arr.length;
        print(arr);
        // Insertion Sort
        for(int i=1;i<=n-1;i++){ // n-1 passes
            int j = i;
            while(j>=1 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
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
