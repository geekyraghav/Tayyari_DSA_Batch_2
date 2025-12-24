package Queues;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueSTL {
    public static void main(String[] args) {
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        System.out.println(q);
        System.out.println(q.remove()); // q.peek() then q.remove()
        System.out.println(q);
        System.out.println(q.peek());
        q.add(50); q.add(60);
        print(q);
    }

    private static void print(Queue<Integer> q) {
        int n = q.size();
        for(int i=1;i<=n;i++){
            System.out.println(q.peek());
            q.add(q.remove());
        }
        System.out.println();
    }

}
