package BST;

public class LCAinBST {
    public Node LCA(Node root, Node p, Node q) {
        if(p.data > root.data && q.data > root.data) return LCA(root.right,p,q);
        else if(p.data < root.data && q.data < root.data) return LCA(root.left,p,q);
        else return root;
    }
}
