package Graphs;
import java.util.*;
public class CourseSchedule {
    public boolean canFinish(int n, int[][] prerequisites) {
        int[] indegree = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++){
            int v = prerequisites[i][0];
            int u = prerequisites[i][1];
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
        return (ans.size() == n);
    }
}
