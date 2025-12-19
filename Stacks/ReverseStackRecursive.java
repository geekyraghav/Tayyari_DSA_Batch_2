package Stacks;

import java.util.Stack;

public class ReverseStackRecursive {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); st.push(20); st.push(30);
        st.push(40); st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }

    private static void reverse(Stack<Integer> st) {
        if(st.size()<=1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(top,st);
    }
    private static void pushAtBottom(int ele, Stack<Integer> st) {
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(ele,st);
        st.push(top);
    }
}
