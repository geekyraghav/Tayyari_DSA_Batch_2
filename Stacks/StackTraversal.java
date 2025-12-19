package Stacks;
import java.util.Stack;
public class StackTraversal {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); st.push(20); st.push(30);
        st.push(40); st.push(50); st.push(60);
        Stack<Integer> helper = new Stack<>();
        while(st.size()>0){
            System.out.print(st.peek()+" "); // top to bottom print
            helper.push(st.pop());
        }
        System.out.println();
        while(helper.size()>0){
            System.out.print(helper.peek()+" "); // bottom to top print
            st.push(helper.pop());
        }
    }
}
