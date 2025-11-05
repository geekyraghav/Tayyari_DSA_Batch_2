package TwoDimensionalArrays;
import java.util.ArrayList;
public class TwoDimensionalArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4); b.add(5); b.add(6); b.add(7);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(8); c.add(9);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(a); list.add(b); list.add(c);
        // System.out.println(list);

//        for(int i=0;i<list.size();i++){
//            for(int j=0;j<list.get(i).size();j++){
//                System.out.print(list.get(i).get(j)+" "); // list[i][j]
//            }
//            System.out.println();
//        }

        for(ArrayList<Integer> l : list){
            for(int ele : l){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
