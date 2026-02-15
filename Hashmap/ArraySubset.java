package Maps_And_Sets;
import java.util.HashMap;
public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        // a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 1, 1, 7]
        // b is not a subset of a
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : a){
//            map.put(ele,map.getOrDefault(ele,0)+1);
            if(!map.containsKey(ele)) map.put(ele,1);
            else{
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
        }
        for(int ele : b){
            if(!map.containsKey(ele)) return false;
            int freq = map.get(ele);
            map.put(ele,freq-1);
            if(map.get(ele)==0) map.remove(ele);
        }
        return true;
    }
}
