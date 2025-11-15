package BinarySearch;

public class FirstOccurence {
    public int binarysearch(int[] arr, int target) {
        int lo = 0, hi = arr.length-1, ans = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<target) lo = mid + 1;
            else if(arr[mid]>target) hi = mid - 1;
            else{
                ans = mid;
                hi = mid - 1;
            }
        }
        return ans;
    }
}
