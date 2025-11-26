package Recursion;

public class BinarySearchRecursive {
    public int search(int[] arr, int target) {
        return bs(0,arr.length-1,target,arr);
    }

    private int bs(int lo, int hi, int target, int[] arr) {
        if(lo>hi) return -1;
        int mid = (lo+hi)/2;
        if(arr[mid]<target) return bs(mid+1,hi,target,arr);
        else if(arr[mid]>target) return bs(lo,mid-1,target,arr);
        else return mid;
    }
}
