package OneDimensionalArrays;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {4,1,6,78,31,13};
//        int x = arr[0];
//        x *= 2;
        for(int ele : arr){
             ele *= 2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
//        for(int i=0;i<arr.length;i++){
//            arr[i] *= 2;
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
    }
}
