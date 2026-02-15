package Maps_And_Sets;

import java.util.HashMap;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
//            map.put(ch,map.getOrDefault(ch,0)+1);
            if(!map.containsKey(ch)) map.put(ch,1);
            else{
                int freq = map.get(ch);
                map.put(ch,freq+1);
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(!map.containsKey(ch)) return false;
            else{
                int freq = map.get(ch);
                map.put(ch,freq-1);
                if(map.get(ch) == 0) map.remove(ch);
            }
        }
        return true;
    }
}
