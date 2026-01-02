package BST;

public class InsertInABST {
    public Node insert(Node root, int key) {
        if(root==null) return new Node(key);
        if(key < root.data){ // attach somewhere in left
            root.left = insert(root.left,key);
        }
        else { // attach somewhere in right
            root.right = insert(root.right,key);
        }
        return root;
    }
}
