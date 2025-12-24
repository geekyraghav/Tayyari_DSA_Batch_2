package Queues;

import java.util.Queue;

class CircularQueue{ // queue from f to r-1  (or f to n-1 and 0 to r-1)
    private int[] arr;
    private int f;
    private int r;
    private int size;
    CircularQueue(int capacity){
        arr = new int[capacity];
    }

    void add(int ele) throws Exception{
        if(size==arr.length) throw new Exception("Queue is Full!");
        arr[r++] = ele;
        size++;
        if(r==arr.length) r = 0;
    }

    int remove() throws Exception{
        if(size==0) throw new Exception("Queue is Empty!");
        int front = arr[f];
        f++;
        size--;
        if(f==arr.length) f = 0;
        return front;
    }

    int peek() throws Exception{
        if(size==0) throw new Exception("Queue is Empty!");
        return arr[f];
    }

    void display() {
        if(f<r){
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    void print() throws Exception{
        int n = size();
        for(int i=1;i<=n;i++){
            System.out.print(peek()+" ");
            add(remove());
        }
        System.out.println();
    }

    int size(){
        return size;
    }
}
public class CircularQueueImplementationViaArray {
    public static void main(String[] args) throws Exception{
        CircularQueue q = new CircularQueue(4);
        q.add(10); q.add(20); q.add(30); q.add(40);
        q.display();
        // q.add(50); error
        q.remove(); q.remove();
        q.display();
        System.out.println(q.size());
        q.add(50); q.add(60);
        q.display();
        q.print();
    }

}
