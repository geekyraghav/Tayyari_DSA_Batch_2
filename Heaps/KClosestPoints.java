package Heaps;
import java.util.*;
public class KClosestPoints {
//    public class Triplet implements Comparable<Triplet>{
//        int x;
//        int y;
//        int d;
//        Triplet(int x, int y, int d){
//            this.x = x;
//            this.y = y;
//            this.d = d;
//        }
//        public int compareTo(Triplet t){
//            return this.d - t.d;
//        }
//    }
//    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
//        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for(int i = 0;i<points.length;i++){
//            int x = points[i][0], y = points[i][1];
//            int d = x*x + y*y;
//            pq.add(new Triplet(x,y,d));
//            if(pq.size() > k) pq.remove();
//        }
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        while(pq.size() > 0){
//            Triplet top = pq.remove();
//            ArrayList<Integer> a = new ArrayList<>();
//            a.add(top.x);
//            a.add(top.y);
//            ans.add(a);
//        }
//        return ans;
//    }
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y)->y[2] - x[2]);
        for(int i = 0;i<points.length;i++){
            int x = points[i][0], y = points[i][1];
            int d = x*x + y*y;
            int[] a = {x,y,d};
            pq.add(a);
            if(pq.size() > k) pq.remove();
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while(pq.size() > 0){
            int[] top = pq.remove();
            ArrayList<Integer> a = new ArrayList<>();
            a.add(top[0]);
            a.add(top[1]);
            ans.add(a);
        }
        return ans;
    }
}
