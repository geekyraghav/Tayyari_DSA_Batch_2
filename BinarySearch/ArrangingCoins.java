package BinarySearch;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        if(n==1) return 1;
        int lo = 0, hi = n, ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            long m = mid;
            if(m*(m+1)/2 >= (long)n){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        long a = ans;
        if(a*(a+1)/2 == (long)n) return ans;
        return ans-1;
    }

//    public int arrangeCoins(int n) {
//        long N = (long)n;
//        return (-1 + sqrt(1L + 8L*N))/2;
//    }
//    public int sqrt(long n) {
//        long ans = 0, lo = 0, hi = n;
//        while(lo<=hi){
//            long mid = lo + (hi-lo)/2;
//            if(mid <= n/mid){
//                ans = mid;
//                lo = mid + 1;
//            }
//            else hi = mid - 1;
//        }
//        return (int)ans;
//    }
}
