package BinarySearch;

public class RotatedSortedArray {
    int search(int[] arr, int key) {
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==key) return mid;
            if(arr[lo]<=arr[mid]){ // left half is sorted
                if(arr[lo]<=key && key<=arr[mid]) hi = mid-1;
                else lo = mid+1;
            }
            else{ // right half is sorted
                if(arr[mid]<=key && key<=arr[hi]) lo = mid+1;
                else hi = mid-1;
            }
        }
        return -1;
    }
}
