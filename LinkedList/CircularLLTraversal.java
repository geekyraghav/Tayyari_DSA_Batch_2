package LinkedList;

public class CircularLLTraversal {
//    void printList(Node head) {
//        System.out.print(head.data+" ");
//        Node temp = head.next;
//        while(temp!=head){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//    }

    void printList(Node head) {
        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }
}
