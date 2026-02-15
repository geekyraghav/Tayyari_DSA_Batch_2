package Maps_And_Sets;
import java.util.*;
public class MapsCF {
    static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Raghav",76);
        map.put("Satyam",66);
        map.put("Harsh",7);
        map.put("Priya",47);
        map.put("Alviya",20);
        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }

        System.out.println(map.get("Priya"));
        map.put("Priya",99); // overwrite kar dega 47 ko
        System.out.println(map.get("Priya"));
        System.out.println(map.get("Yash"));
        System.out.println(map.containsKey("Yash")); // false
        map.put("Ranjit",null);
        System.out.println(map.containsKey("Ranjit")); // true
        map.remove("Harsh");
        System.out.println(map.get("Harsh"));
    }
}
