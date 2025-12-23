package Stacks;
import java.util.Stack;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class RemoveNodesFromLL {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            while(st.size()>0 && st.peek().val < temp.val) st.pop();
            st.push(temp);
            temp = temp.next;
        }
        ListNode newHead = st.pop();
        temp = newHead;
        while(st.size()>0){
            ListNode top = st.pop();
            temp.next = top;
            temp = top;
        }
        temp.next = null;
        return reverse(newHead);
    }

    private ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = head;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}
