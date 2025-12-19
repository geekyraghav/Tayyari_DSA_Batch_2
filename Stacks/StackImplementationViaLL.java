package Stacks;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class MyStack{
    private Node head;
    private int size;

    void push(int ele){
        Node n = new Node(ele);
        if(size!=0){
            n.next = head;
        }
        head = n;
        size++;
    }

    int pop() throws Exception{
        if(size==0) throw new Exception("Stack is Empty!");
        int top = head.data;
        head = head.next;
        size--;
        return top;
    }

    int peek() throws Exception{
        if(size==0) throw new Exception("Stack is Empty!");
        return head.data;
    }

    int size(){
        return size;
    }

    void display(){ // top to bottom
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class StackImplementationViaLL {
    public static void main(String[] args) throws Exception{
        MyStack st = new MyStack();
        st.push(10); st.push(20); st.push(30);
        System.out.println(st.peek());
        st.pop();
        st.push(40);
        System.out.println(st.peek());
    }
}
