package Strings;

public class ToggleCharacters {
    public String toggleCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch>=65 && ch<=90){
                char dh = (char)(ch+32);
                sb.setCharAt(i,dh);
            }
            else if(ch>=97 && ch<=122){
                char dh = (char)(ch-32);
                sb.setCharAt(i,dh);
            }
        }
        return sb.toString();
    }
}
