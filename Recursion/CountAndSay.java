package Recursion;

public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1) + "a";
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int count = j-i;
                ans.append(count);
                ans.append(s.charAt(i));
                i = j;
            }
        }
        return ans.toString();
    }
}
