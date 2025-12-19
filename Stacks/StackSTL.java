package Stacks;
import java.util.Stack;
public class StackSTL {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); st.push(20); st.push(30);
        System.out.println(st+" "+st.peek());
        st.pop();
        System.out.println(st+" "+st.peek());
        st.push(60);
        System.out.println(st+" "+st.peek());
    }
}
