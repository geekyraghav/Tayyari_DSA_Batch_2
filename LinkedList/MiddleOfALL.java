package LinkedList;

public class MiddleOfALL {
    int getMiddle(Node head) { // 1 pass solution
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

//    int getMiddle(Node head) { // 2 pass solution
//        // calculate len
//        int len = 0;
//        Node temp = head;
//        while(temp!=null){
//            len++;
//            temp = temp.next;
//        }
//        temp = head;
//        for(int i=1;i<=len/2;i++){
//            temp = temp.next;
//        }
//        return temp.data;
//    }
}
