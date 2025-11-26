package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
        String s = "abcd";
        List<String> list = new ArrayList<>();
        System.out.println(list);
        sub("",0,new StringBuilder(s),list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void sub(String ans, int i, StringBuilder s, List<String> list) {
        if(i==s.length()){
            if(!ans.equals("")) list.add(ans);
            return;
        }
        char ch = s.charAt(i);
        sub(ans,i+1,s,list); // skip
        sub(ans+ch,i+1,s,list); // pick
    }
}
