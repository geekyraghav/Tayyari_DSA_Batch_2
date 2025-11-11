package Strings;
public class StringBuildersInjava {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("");
        System.out.println(s.length()+" "+s.capacity());
        for(int i=1;i<=13;i++){
            s.append(i);
            System.out.println(s+" "+s.length()+" "+s.capacity());
        }
        StringBuilder a = new StringBuilder("Harsh");
        a.setCharAt(0,'M');
        System.out.println(a);
        a.reverse();
        System.out.println(a);
    }
}
