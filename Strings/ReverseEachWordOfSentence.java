package Strings;

public class ReverseEachWordOfSentence {
    public static void main(String[] args) {
        String s = "satyam and harsh sleep in the class";
        StringBuilder sb = new StringBuilder(s);
        sb.append(' ');
        int i = 0, j = 0;
        while(j<sb.length()){
            if(sb.charAt(j)==' '){
                reversePart(sb,i,j-1);
                i = j+1;
            }
            j++;
        }
        System.out.println(sb);
    }

    private static void reversePart(StringBuilder sb, int i, int j) {
        while(i<j){
            char tempi = sb.charAt(i);
            char tempj = sb.charAt(j);
            sb.setCharAt(i,tempj);
            sb.setCharAt(j,tempi);
            i++;
            j--;
        }
    }
}
