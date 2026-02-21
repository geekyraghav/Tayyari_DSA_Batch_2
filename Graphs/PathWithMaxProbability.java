package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PathWithMaxProbability {
    public class Pair implements Comparable<Pair>{
        int node;
        double prob;
        Pair(int node, double prob){
            this.node = node;
            this.prob = prob;
        }
        public int compareTo(Pair p){
            return Double.compare(this.prob,p.prob);
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int src, int des) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            double wt = succProb[i];
            adj.get(u).add(new Pair(v,wt));
            adj.get(v).add(new Pair(u,wt));
        }
        double[] prob = new double[n];
        Arrays.fill(prob,0);
        prob[src] = 1;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Pair(src,1));
        while(pq.size() > 0){
            Pair top = pq.remove();
            int node = top.node;
            double probFromSrc = top.prob;
            if(probFromSrc < prob[node]) continue; // IMP
            for(Pair p : adj.get(node)){
                int ele = p.node;
                double wt = p.prob;
                double totalProb = probFromSrc * wt;
                if(totalProb > prob[ele]){
                    prob[ele] = totalProb;
                    pq.add(new Pair(ele,totalProb));
                }
            }
        }
        return prob[des];
    }
}
