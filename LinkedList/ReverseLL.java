package LinkedList;

public class ReverseLL {
    Node reverseList(Node head) { // Recursive
        if(head==null || head.next==null) return head;
        Node a = head.next;
        head.next = null;
        Node newHead = reverseList(a);
        a.next = head;
        return newHead;
    }

//    Node reverseList(Node head) { // Iterative
//        Node curr = head;
//        Node prev = null;
//        Node fwd = null;
//        while(curr!=null){
//            fwd = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = fwd;
//        }
//        return prev;
//    }
}
