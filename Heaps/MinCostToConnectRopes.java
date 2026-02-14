package Heaps;
import java.util.*;
public class MinCostToConnectRopes {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr) pq.add(ele);
        int cost = 0;
        while(pq.size() > 1){
            int rope1 = pq.remove();
            int rope2 = pq.remove();
            pq.add(rope1 + rope2);
            cost += rope1 + rope2;
        }
        return cost;
    }
}
