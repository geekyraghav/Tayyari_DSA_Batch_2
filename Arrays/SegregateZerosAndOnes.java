package OneDimensionalArrays;

public class SegregateZerosAndOnes {
    void segregate0and1(int[] arr) {
        // 1 pass solution
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
                // if(i>j) break;
            else if(arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }

    // void segregate0and1(int[] arr) {
    //     // 2 pass solution
    //     int zeros = 0, ones = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==0) zeros++;
    //         ones++;
    //     }
    //     for(int i=0;i<zeros;i++){
    //         arr[i] = 0;
    //     }
    //     for(int i=zeros;i<arr.length;i++){
    //         arr[i] = 1;
    //     }
    // }
}
