package BST;

import java.util.ArrayList;

public class ValidateBST {
    static int prev;
    static boolean flag;
    public boolean isBST(Node root) {
        prev = Integer.MIN_VALUE;
        flag = true; // true means BST hai
        dfs(root);
        return flag;
    }


    private void dfs(Node root) {
        if(root==null) return;
        dfs(root.left);
        if(prev >= root.data) flag = false; // false means BST nahi hai
        prev = root.data;
        dfs(root.right);
    }

//    public boolean isBST(Node root) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        dfs(root,ans);
//        for(int i=0;i<ans.size()-1;i++){
//            if(ans.get(i)>=ans.get(i+1)) return false;
//        }
//        return true;
//    }
//
//
//    private void dfs(Node root, ArrayList<Integer> ans) {
//        if(root==null) return;
//        dfs(root.left,ans);
//        ans.add(root.data);
//        dfs(root.right,ans);
//    }

//    public boolean isBST(Node root) {
//        if(root==null) return true;
//        if(root.data <= max(root.left) || root.data >= min(root.left)) return false;
//        return isBST(root.left) && isBST(root.right);
//    }
//    private int max(Node root) {
//        if(root==null) return Integer.MIN_VALUE;
//        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
//    }
//    private int min(Node root) {
//        if(root==null) return Integer.MAX_VALUE;
//        return Math.min(root.data,Math.min(min(root.left),min(root.right)));
//    }
}
