package Strings;

public class Substrings {
    public static void main(String[] args) {
//        String s = "bottle";
//        System.out.println(s.substring(1));
//        System.out.println(s.substring(1,5)); // 1 to 4
        String s = "abcd";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                System.out.print(s.substring(i,j+1)+" "); // i to j
            }
        }

//        String x = "123";
//        int z = Integer.parseInt(x);
    }
}
