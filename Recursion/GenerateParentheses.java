package Recursion;
import java.util.ArrayList;
public class GenerateParentheses {
    public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> ans = new ArrayList<>();
        generate("",0,0,n/2,ans);
        return ans;
    }

    private void generate(String s, int opening, int closing, int n, ArrayList<String> ans) {
        if(closing==n){
            ans.add(s);
            return;
        }
        if(opening<n) generate(s+'(',opening+1,closing,n,ans);
        if(closing<opening) generate(s+')',opening,closing+1,n,ans);
    }

//    public static void main(String[] args) {
//        ArrayList<String> ans = new ArrayList<>();
//        generate("",0,0,4,ans);
//        System.out.println(ans+" "+ans.size());
//    }
}
