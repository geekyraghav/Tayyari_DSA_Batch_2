package BinarySearch;

public class Binary_Search {
    public int search(int[] arr, int target) {
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<target) lo = mid + 1;
            else if(arr[mid]>target) hi = mid - 1;
            else return mid;
        }
        return -1;
    }
}
