package Maps_And_Sets;

import java.util.HashSet;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    int longestUniqueSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int i = 0, j = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)) set.add(ch);
            else{
                int len = j-i;
                maxLen = Math.max(maxLen,len);
                while(s.charAt(i) != ch){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
            }
            j++;
        }
        int len = j-i;
        maxLen = Math.max(maxLen,len);
        return maxLen;
    }
}
