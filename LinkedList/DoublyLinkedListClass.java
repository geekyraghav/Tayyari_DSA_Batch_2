package LinkedList;
class DoublyLinkedList{
    private Node head;
    private Node tail;
    private int size;

    void addAtTail(int ele) {
        Node n = new Node(ele);
        if(size==0) head = tail = n;
        else{
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }

    void addAtHead(int ele) {
        Node n = new Node(ele);
        if(size==0) head = tail = n;
        else{
            n.next = head;
            head.prev = n;
            head = n;
        }
        size++;
    }

    void deleteAtHead() throws Exception{
        if(size==0) throw new Exception("List is Empty!");
        head = head.next;
        head.prev = null;
        size--;
    }

    void deleteAtTail() throws Exception{
        if(size==0) throw new Exception("List is Empty!");
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayReverse(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    int length(){
        return size;
    }
}
public class DoublyLinkedListClass {
    public static void main(String[] args) throws Exception{
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addAtTail(10); dll.addAtTail(20); dll.addAtTail(30);
        dll.display();
        dll.addAtHead(40); dll.addAtHead(50);
        dll.display();
        dll.deleteAtTail(); dll.deleteAtHead();
        dll.display();
    }
}
