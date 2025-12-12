package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class MyLinkedList{
    private Node head;
    private Node tail;
    private int size;
    int length(){
        return size;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertTail(int val){
        Node n = new Node(val);
        if(size==0) head = tail = n;
        else{
            tail.next = n;
            tail = n;
        }
        size++;
    }
    void insertHead(int val){
        Node n = new Node(val);
        if(size==0) head = tail = n;
        else{
            n.next = head;
            head = n;
        }
        size++;
    }
    void deleteHead() throws Exception{
        if(size==0) throw new Exception("List is Empty!");
        head = head.next;
        size--;
    }
    int getHead() throws Exception{
        if(size==0) throw new Exception("List is Empty!");
        return head.data;
    }
    int getTail() throws Exception{
        if(size==0) throw new Exception("List is Empty!");
        return tail.data;
    }
    int get(int idx) throws Exception{
        if(idx<0 || idx>=size) throw new Exception("Index out of bound!");
        Node temp = head;
        for(int i=1;i<=idx;i++){ // idx times loop chalao
            temp = temp.next;
        }
        return temp.data;
    }
}
public class LinkedListClass {
    public static void main(String[] args) throws Exception{
        MyLinkedList ll = new MyLinkedList();
        ll.insertTail(10); ll.insertTail(20); ll.insertTail(30);
        ll.display();
        ll.insertHead(40); ll.insertHead(80); ll.insertHead(60);
        ll.display();
        ll.deleteHead();
        ll.display();
        System.out.println(ll.get(3));
    }
}
