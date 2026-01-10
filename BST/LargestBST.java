package BST;

public class LargestBST {
    public static class Quad{
        int max;
        int min;
        int size;
        boolean isBST;
        Quad(int max, int min, int size, boolean isBST){
            this.max = max;
            this.min = min;
            this.size = size;
            this.isBST = isBST;
        }
    }
    static int maxSize;
    static int largestBst(Node root) {
        maxSize = 0;
        maxMinSizeIsBST(root);
        return maxSize;
    }

    private static Quad maxMinSizeIsBST(Node root) {
        if(root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        Quad lst = maxMinSizeIsBST(root.left);
        Quad rst = maxMinSizeIsBST(root.right);
        int max = Math.max(root.data,Math.max(lst.max,rst.max));
        int min = Math.min(root.data,Math.min(lst.min,rst.min));
        int size = 1 + lst.size + rst.size;
        boolean isBST = ((root.data > lst.max && root.data < rst.min) && lst.isBST && rst.isBST);
        if(isBST) maxSize = Math.max(maxSize,size); // extra
        return new Quad(max,min,size,isBST);
    }
}
