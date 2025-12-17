package LinkedList;

public class MergeSortLL {
    public Node sortedMerge(Node head1, Node head2) {
        Node a = head1;
        Node b = head2;
        Node dummy = new Node(-1);
        Node c = dummy;
        while(a!=null && b!=null){
            if(a.data < b.data){
                c.next = a;
                a = a.next;
            }
            else{
                c.next = b;
                b = b.next;
            }
            c = c.next;
        }
        if(a==null) c.next = b;
        else c.next = a;
        return dummy.next;
    }
    public Node mergeSort(Node head) {
        if(head==null || head.next == null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){ // left middle node
            slow = slow.next;
            fast = fast.next.next;
        }
        Node a = slow.next;
        slow.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(a);
        return sortedMerge(left,right);
    }
}
