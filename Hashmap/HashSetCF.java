package Maps_And_Sets;
import java.util.HashSet;

public class HashSetCF {
    static void main() {
        HashSet<Integer> set = new HashSet<>();
        set.add(2); set.add(3); set.add(-9);
        set.add(3); set.add(8); set.add(10);
        System.out.println(set.size());
        System.out.println(set.contains(3));
        set.remove(3);
        System.out.println(set.contains(3)+" "+set.size());
        // Traversal
        for(int ele : set){
            System.out.print(ele+" ");
        }
    }
}
