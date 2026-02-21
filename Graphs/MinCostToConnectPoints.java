package Graphs;
import java.util.*;
public class MinCostToConnectPoints {
    public class Pair implements Comparable<Pair>{
        int node;
        int wt;
        Pair(int node, int wt){
            this.node = node;
            this.wt = wt;
        }
        public int compareTo(Pair p){
            return this.wt - p.wt;
        }
    }
    public int minCost(int[][] points) {
        int n = points.length;
        boolean[] vis = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0)); // 0 means points[0] -> {points[0][0],points[0][1]}
        int sum = 0;
        while(pq.size() > 0){
            Pair top = pq.remove();
            int node = top.node, wt = top.wt;
            int x = points[node][0], y = points[node][1];
            if(vis[node]) continue;
            vis[node] = true;
            sum += wt;
            for(int i=0;i<n;i++){
                if(i==node) continue;
                int x1 = points[i][0], y1 = points[i][1];
                int dist = Math.abs(x-x1) + Math.abs(y-y1);
                if(!vis[i]) pq.add(new Pair(i,dist));
            }
        }
        return sum;
    }
}
