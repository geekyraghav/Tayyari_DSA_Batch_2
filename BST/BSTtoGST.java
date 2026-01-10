package BST;

import java.util.ArrayList;
import java.util.Collections;

public class BSTtoGST {
    static int sum;
    public static void transformTree(Node root) {
        sum = 0;
        dfs(root);
    }
    // reverse inorder
    private static void dfs(Node root) {
        if(root==null) return;
        dfs(root.right);
        int temp = root.data;
        root.data = sum;
        sum += temp;
        dfs(root.left);
    }

//    public static void transformTree(Node root) {
//        ArrayList<Node> arr = new ArrayList<>();
//        dfs(root,arr);
//        int sum = 0;
//        for(int i=0;i<arr.size();i++){
//            int temp = arr.get(i).data;
//            arr.get(i).data = sum;
//            sum += temp;
//        }
//    }
//    // reverse inorder
//    private static void dfs(Node root, ArrayList<Node> ans) {
//        if(root==null) return;
//        dfs(root.right,ans);
//        ans.add(root);
//        dfs(root.left,ans);
//    }
}
