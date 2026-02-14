package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapSTL {
    static void main() {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // MaxHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->y-x); // MaxHeap
        pq.add(8); pq.add(3); pq.add(4);
        System.out.println(pq.peek()); // O(1) Min Element
        pq.remove();
        System.out.println(pq.peek());
    }
}
