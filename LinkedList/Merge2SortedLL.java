package LinkedList;

public class Merge2SortedLL {
    Node sortedMerge(Node head1, Node head2) {
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
}
