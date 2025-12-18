package LinkedList;

public class PalindromeLL {
    public Node reverse(Node head) { // Iterative
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
    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){ // left middle node
            slow = slow.next;
            fast = fast.next.next;
        }
        Node a = slow.next;
        slow.next = null;
        a = reverse(a);
        Node t1 = head;
        Node t2 = a;
        while(t2!=null){
            if(t1.data != t2.data) return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
}
