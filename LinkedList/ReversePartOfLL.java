package LinkedList;

public class ReversePartOfLL {
    public static Node reverseBetween(int l, int r, Node head) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        dummy.next = head;
        Node a = dummy;
        for(int i=1;i<=l-1;i++){ // l-1 times loop is running
            a = a.next;
        }
        Node b = a.next;
        Node c = dummy;
        for(int i=1;i<=r;i++){ // r times loop is running
            c = c.next;
        }
        Node d = c.next;
        a.next = null;
        c.next = null;
        reverse(b);
        a.next = c;
        b.next = d;
        return dummy.next;
    }
    public static Node reverse(Node head) { // Iterative
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}
