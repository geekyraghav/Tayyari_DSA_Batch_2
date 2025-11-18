package BinarySearch;

public class FloorInSortedArray {
    public int findFloor(int[] arr, int x) {
        int ans = -1, lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<=x){
                ans = mid;
                lo = mid + 1;
            }
            else hi = mid - 1;
        }
        return ans;
    }
}
