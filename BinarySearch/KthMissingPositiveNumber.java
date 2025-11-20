package BinarySearch;

public class KthMissingPositiveNumber {
    public int kthMissing(int[] arr, int k) {
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int correct = mid + 1;
            int missing = arr[mid] - correct;
            if(missing < k) lo = mid + 1;
            else hi = mid - 1;
        }
        return hi + 1 + k;
    }
}
