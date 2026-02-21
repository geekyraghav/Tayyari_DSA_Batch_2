package Graphs;
import java.util.*;
public class FindEventualSafeStates {
    public ArrayList<Integer> safeNodes(int n, int[][] edges) {
        int[] indegree = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        // Store the reverse graph
        for(int i=0;i<edges.length;i++){
            int v = edges[i][0];
            int u = edges[i][1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        // bfs
        while(q.size() > 0){
            int front = q.remove();
            ans.add(front);
            for(int ele : adj.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0) q.add(ele);
            }
        }
        return ans;
    }
}
