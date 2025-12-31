package BinaryTrees;

public class BalancedBinaryTree {
    static boolean flag;
    public boolean isBalanced(Node root) {
        flag = true; // true means tree is balanced
        levels(root);
        return flag;
    }
    private int levels(Node root) {
        if(root==null) return 0;
        int leftLevels = levels(root.left), rightLevels = levels(root.right);
        if(Math.abs(leftLevels-rightLevels)>1) flag = false; // extra
        return 1 + Math.max(leftLevels,rightLevels);
    }
}
