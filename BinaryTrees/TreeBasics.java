package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class TreeBasics {
    public static void main(String[] args) {
        Node a = new Node(1); // root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(-7);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        // System.out.println(a.right.left.data);
        dfs(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(levels(a));
        bfs(a);
    }

    private static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.data+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }

    private static int size(Node root) {
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static int sum(Node root) {
        if(root==null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

    private static int max(Node root) {
        if(root==null) return Integer.MIN_VALUE;
        int leftMax = max(root.left), rightMax = max(root.right);
        return Math.max(root.data,Math.max(leftMax,rightMax));
    }

    private static int levels(Node root) {
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }

    private static void dfs(Node root) {
        if(root==null) return;
        System.out.print(root.data+" ");
        dfs(root.right);
        dfs(root.left);
    }
}
