package Graphs;
import java.util.*;
public class NumberOfProvinces {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int n) {
        boolean[] vis = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                // bfs(i,adj,vis);
                dfs(i,adj,vis);
                count++;
            }
        }
        return count;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        int n = vis.length;
        vis[node] = true;
        for(int i=0;i<n;i++){
            if(i!=node && !vis[i] && adj.get(node).get(i)==1){ // adj[front][i]
                dfs(i,adj,vis);
                vis[i] = true;
            }
        }
    }

//    private static void bfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
//        int n = vis.length;
//        Queue<Integer> q = new LinkedList<>();
//        q.add(node);
//        vis[node] = true;
//        while(q.size() > 0){
//            int front = q.remove();
//            for(int i=0;i<n;i++){
//                if(i!=front && !vis[i] && adj.get(front).get(i)==1){ // adj[front][i]
//                    q.add(i);
//                    vis[i] = true;
//                }
//            }
//        }
//    }
}
