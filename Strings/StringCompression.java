package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaaaaggguwwjaa";
        StringBuilder ans = new StringBuilder("");
        int i = 0, j = 0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                ans.append(s.charAt(i));
                int len = j-i;
                if(len>1) ans.append(len);
                i=j;
            }
        }
        ans.append(s.charAt(i));
        int len = j-i;
        if(len>1) ans.append(len);
        System.out.println(ans);
    }
}
