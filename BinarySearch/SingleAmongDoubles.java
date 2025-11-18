package BinarySearch;

public class SingleAmongDoubles {
    int single(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int lo = 1, hi = n-2;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            int f = mid, s = mid;
            if(arr[mid]==arr[mid-1]) f = mid - 1;
            else s = mid + 1;
            if((f-lo) % 2 == 0) lo = s + 1;
            else hi = f-1;
        }
        return -1;
    }
}
