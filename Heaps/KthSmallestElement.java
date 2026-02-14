package Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public int kthSmallest(int[] arr, int k) {
        // maxheap (size k)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele); // logk
            if(pq.size()>k) pq.remove(); // logk
        }
        return pq.peek();
    }
}
