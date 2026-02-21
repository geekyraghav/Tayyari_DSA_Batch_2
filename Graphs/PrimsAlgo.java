package Graphs;

import java.util.*;

public class PrimsAlgo {
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
    public int spanningTree(int n, int[][] edges) {
        boolean[] vis = new boolean[n];
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(v,wt));
            adj.get(v).add(new Pair(u,wt));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(n-1,0));
        int sum = 0;
        while(pq.size() > 0){
            Pair top = pq.remove();
            int node = top.node, wt = top.wt;
            if(vis[node]) continue;
            vis[node] = true;
            sum += wt;
            for(Pair p : adj.get(node)){
                int ele = p.node, w = p.wt;
                if(!vis[ele]) pq.add(new Pair(ele,w));
            }
        }
        return sum;
    }
}
