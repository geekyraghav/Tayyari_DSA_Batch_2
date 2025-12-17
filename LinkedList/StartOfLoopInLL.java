package LinkedList;

public class StartOfLoopInLL {
    public int cycleStart(Node head) {
        Node slow = head;
        Node fast = head;
        boolean flag = false; // false means no cycle
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                flag = true;
                break;
            }
        }
        if(!flag) return -1;
        Node temp = head;
        while(slow!=temp){
            slow = slow.next;
            temp = temp.next;
        }
        return slow.data;
    }
}
