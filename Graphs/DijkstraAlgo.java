package Graphs;
import java.util.*;
public class DijkstraAlgo {
//    public class Pair implements Comparable<Pair>{
//        int node;
//        int dist;
//        Pair(int node, int dist){
//            this.node = node;
//            this.dist = dist;
//        }
//        public int compareTo(Pair p){
//            return this.dist - p.dist;
//        }
//    }
//    public int[] dijkstra(int n, int[][] edges, int src) {
//        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
//        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
//        for(int i=0;i<edges.length;i++){
//            int u = edges[i][0];
//            int v = edges[i][1];
//            int wt = edges[i][2];
//            adj.get(u).add(new Pair(v,wt));
//            adj.get(v).add(new Pair(u,wt));
//        }
//        int[] dist = new int[n];
//        Arrays.fill(dist,Integer.MAX_VALUE);
//        dist[src] = 0;
//        // pq<{node,dist}>
//        PriorityQueue<Pair> pq = new PriorityQueue<>();
//        pq.add(new Pair(src,0));
//        while(pq.size() > 0){
//            Pair top = pq.remove();
//            int node = top.node, distFromSrc = top.dist;
//            if(distFromSrc > dist[node]) continue; // IMP
//            for(Pair p : adj.get(node)){
//                int ele = p.node, wt = p.dist;
//                int totalDist = distFromSrc + wt;
//                if(totalDist < dist[ele]){
//                    dist[ele] = totalDist;
//                    pq.add(new Pair(ele,totalDist));
//                }
//            }
//        }
//        return dist;
//    }

    public int[] dijkstra(int n, int[][] edges, int src) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new int[]{v,wt});
            adj.get(v).add(new int[]{u,wt});
        }
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        // pq<{node,dist}>
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{src,0});
        while(pq.size() > 0){
            int[] top = pq.remove();
            int node = top[0], distFromSrc = top[1];
            if(distFromSrc > dist[node]) continue; // IMP
            for(int[] arr : adj.get(node)){
                int ele = arr[0], wt = arr[1];
                int totalDist = distFromSrc + wt;
                if(totalDist < dist[ele]){
                    dist[ele] = totalDist;
                    pq.add(new int[]{ele,totalDist});
                }
            }
        }
        return dist;
    }
}
