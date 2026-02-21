package Graphs;
import java.util.ArrayList;
import java.util.Collections;

public class TopoSortDFS {
    public ArrayList<Integer> topoSort(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }
        boolean[] vis = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();
        // dfs
        for(int i=0;i<n;i++){
            if(!vis[i]) dfs(i,vis,adj,ans);
        }
        Collections.reverse(ans);
        return ans;
    }
    private void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {
        vis[node] = true;
        for(int ele : adj.get(node)){
            if(!vis[ele]) dfs(ele,vis,adj,ans);
        }
        ans.add(node);
    }
}
