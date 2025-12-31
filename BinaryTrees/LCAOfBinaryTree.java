package BinaryTrees;

import java.util.ArrayList;

public class LCAOfBinaryTree {
    static ArrayList<Node> a;
    static ArrayList<Node> b;
    Node lca(Node root, int p, int q) {
        ArrayList<Node> arr = new ArrayList<>();
        preorder(root,p,q,arr);
        int i = 0;
        while(i<a.size() && i<b.size() && a.get(i) == b.get(i)) i++;
        return a.get(i-1);
    }

    private void preorder(Node root, int p, int q, ArrayList<Node> arr) {
        if(root==null) return;
        arr.add(root);
        if(root.data==p) a = new ArrayList<>(arr);
        if(root.data==q) b = new ArrayList<>(arr);
        preorder(root.left,p,q,arr);
        preorder(root.right,p,q,arr);
        arr.remove(arr.size()-1); // IMPORTANT STEP
    }
}
