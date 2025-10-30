package OneDimensionalArrays;

public class SecondLargestElement {
//    public int getSecondLargest(int[] arr) { // mayank method
//        int max = -1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max) max = arr[i];
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==max) arr[i] = -1;
//        }
//        int smax = -1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>smax) smax = arr[i];
//        }
//        return smax;
//    }

    public int getSecondLargest(int[] arr) {
        int max = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        int smax = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max) smax = arr[i];
        }
        return smax;
    }

//    public int getSecondLargest(int[] arr) {
//        int max = -1, smax = -1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                smax = max;
//                max = arr[i];
//            }
//            else if(arr[i]>smax && arr[i]!=max) smax = arr[i];
//        }
//        return smax;
//    }

}
