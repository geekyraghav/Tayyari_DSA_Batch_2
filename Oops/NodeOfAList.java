package LinkedList;
public class NodeOfAList {
    public static void display(Node head){ // TC = O(n) Space = O(1)
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayRec(Node head){ // TC = O(n) Space = O(n)
        if(head==null) return;
        displayRec(head.next);
        System.out.print(head.data+" "); // reverse order print
    }
    public static void main(String[] args) {
        Node a = new Node(10); // head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(90);
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        // System.out.println(a.next.next.next.data);
        // System.out.println(d.next.data); // ERROR

        // display(a);
        displayRec(a);
    }
}
