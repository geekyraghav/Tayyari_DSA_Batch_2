package BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DeleteNodeInBST {

    public Node delNode(Node root, int x) {
        if(root.data < x) root.right = delNode(root.right,x);
        else if(root.data > x) root.left = delNode(root.left,x);
        else{ // root.data == x
            if(root.left==null && root.right==null) return null;
            else if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{ // 2 child nodes    // HARD PART
                Node pred = root.left;
                while(pred.right!=null) pred = pred.right;
                Node predLeft = pred.left; // saved its left child
                Node predParent = root.left;
                if(predLeft!=null){
                    while(predParent.right!=pred) predParent = predParent.right;
                    predParent.right = predLeft;
                }
                pred.left = root.left;
                pred.right = root.right;
                return pred;
            }
        }
        return root;
    }

}
