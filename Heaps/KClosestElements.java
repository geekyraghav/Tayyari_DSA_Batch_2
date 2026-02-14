package Heaps;
import java.util.*;
public class KClosestElements {
    int[] printKClosest(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->((b[1]!=a[1]) ? b[1]-a[1] : a[0]-b[0]));
        for(int ele : arr){
            int diff = Math.abs(x-ele);
            if(diff==0) continue;
            int[] a = {ele,diff};
            pq.add(a);
            if(pq.size() > k) pq.remove();
        }
        int[] ans = new int[k];
        int idx = k-1;
        while(pq.size() > 0){
            int[] top = pq.remove();
            ans[idx--] = top[0];
        }
        return ans;
    }
}
