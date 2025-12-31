package BinaryTrees;
import java.util.ArrayList;
public class RightView {
    public ArrayList<Integer> rightView(Node root) {
        int n = levels(root);
        int[] ans = new int[n];
        preorder(root,0,ans);
        ArrayList<Integer> ans2 = new ArrayList<>();
        for(int ele : ans) ans2.add(ele);
        return ans2;
    }
    private void preorder(Node root, int lvl, int[] ans) {
        if(root==null) return;
        ans[lvl] = root.data;
        preorder(root.left,lvl+1,ans);
        preorder(root.right,lvl+1,ans);
    }
    private int levels(Node root) {
        if(root==null) return 0;
        int leftLevels = levels(root.left), rightLevels = levels(root.right);
        return 1 + Math.max(leftLevels,rightLevels);
    }
}
