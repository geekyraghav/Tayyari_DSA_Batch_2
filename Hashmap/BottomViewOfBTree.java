package Maps_And_Sets;

import java.util.*;

public class BottomViewOfBTree {
    public class Pair{
        Node node;
        int v_level;
        Pair(Node node, int v_level){
            this.node = node;
            this.v_level = v_level;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        HashMap<Integer,Integer> map = new HashMap<>(); // <v_level,node_val>
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        int leftLevel = 0, rightLevel = 0;
        while(q.size() > 0){
            Pair front = q.remove();
            Node node = front.node;
            int v_level = front.v_level;
            leftLevel = Math.min(leftLevel,v_level);
            rightLevel = Math.max(rightLevel,v_level);
            map.put(v_level,node.data);
            if(node.left != null) q.add(new Pair(node.left,v_level-1));
            if(node.right != null) q.add(new Pair(node.right,v_level+1));
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=leftLevel;i<=rightLevel;i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}
