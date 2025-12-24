package Queues;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfAQueue {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if(q.size()<k) return q;
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=k;i++)
            st.push(q.remove());
        for(int i=1;i<=k;i++)
            q.add(st.pop());
        for(int i=1;i<=n-k;i++)
            q.add(q.remove());
        return q;
    }
}
