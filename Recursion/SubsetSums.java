package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSums {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        sub(0,0,arr,list);
        return list;
    }
    public static void sub(int ans, int i, int[] s, ArrayList<Integer> list) {
        if(i==s.length){
            list.add(ans);
            return;
        }
        int ch = s[i];
        sub(ans,i+1,s,list); // skip
        sub(ans+ch,i+1,s,list); // pick
    }
}
