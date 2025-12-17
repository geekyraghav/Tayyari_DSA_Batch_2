package LinkedList;

public class KthFromEndOfList {
    int getKthFromLast(Node head, int k) {
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=k;i++){
            if(fast==null) return -1;
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
