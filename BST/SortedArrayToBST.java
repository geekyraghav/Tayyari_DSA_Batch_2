package BST;

public class SortedArrayToBST {
    public Node sortedArrayToBST(int[] arr) {
        return convert(0,arr.length-1,arr);
    }

    public Node convert(int lo, int hi,int[] arr) {
        if(lo>hi) return null;
        int mid = lo + (hi-lo)/2;
        Node root = new Node(arr[mid]);
        root.left = convert(lo,mid-1,arr);
        root.right = convert(mid+1,hi,arr);
        return root;
    }
}
