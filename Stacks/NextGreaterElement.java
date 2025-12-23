package Stacks;
import java.util.ArrayList;
import java.util.Stack;
public class NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        nge[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek() <= arr[i]) st.pop();
            nge[i] = (st.size()==0) ? -1 : st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : nge) ans.add(ele);
        return ans;
    }
}
