package Heaps;
import java.util.*;
public class MinHeapSTL {
    static void main() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // MinHeap
        pq.add(8); pq.add(3); pq.add(4);
        System.out.println(pq.peek()); // O(1) Min Element
        pq.remove();
        System.out.println(pq.peek());
        pq.add(5); pq.add(8); pq.add(2); pq.add(0);
        pq.add(3); pq.add(1); pq.add(7); pq.add(6);
    }
}
