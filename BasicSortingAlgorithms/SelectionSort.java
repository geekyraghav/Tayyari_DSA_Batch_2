package BasicSortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,8,1,9,3};
        int n = arr.length;
        print(arr);
        // Selection Sort
        for(int i=0;i<n-1;i++){ // n-1 passes
            int mindx = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[mindx]) mindx = j;
            }
            // swap i and mindx wale elements
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
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
