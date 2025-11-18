package BinarySearch;

public class Sqrt {
    int floorSqrt(int n) {
        int ans = 0, lo = 0, hi = n;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid*mid <= n){
                ans = mid;
                lo = mid + 1;
            }
            else hi = mid - 1;
        }
        return ans;
    }

//    int floorSqrt(int n) {
//        // code here
//        int ans = 0;
//        for(int i=0;i<=n;i++){
//            if(i*i<=n) ans = i;
//            else break;
//        }
//        return ans;
//    }
}
