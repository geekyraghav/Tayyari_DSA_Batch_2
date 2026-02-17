package Graphs;
import java.util.*;
public class CycleDetectUndirectedGraph {
    public class Pair{
        int node;
        int parent;
        Pair(int node, int parent){
            this.node = node;
            this.parent = parent;
        }
    }
    public boolean isCycle(int n, int[][] edges) {
        // Make Adj List
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                boolean ans = bfs(i,-1,adj,vis);
                if(ans) return true;
            }
        }
        return false;
    }

    private boolean bfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(node,parent));
        vis[node] = true;
        while(q.size() > 0){
            Pair front = q.remove();
            for(int ele : adj.get(front.node)){
                if(ele != front.parent){
                    if(vis[ele]) return true;
                    else{
                        q.add(new Pair(ele,front.node));
                        vis[ele] = true;
                    }
                }
            }
        }
        return false;
    }
}
