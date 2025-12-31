package BinaryTrees;

public class DiameterOfATree {
    static int maxDia;
    public int diameter(Node root) {
        maxDia = 0;
        levels(root);
        return maxDia;
    }
    private int levels(Node root) {
        if(root==null) return 0;
        int leftLevels = levels(root.left), rightLevels = levels(root.right);
        maxDia = Math.max(maxDia,leftLevels + rightLevels); // extra
        return 1 + Math.max(leftLevels,rightLevels);
    }
}
