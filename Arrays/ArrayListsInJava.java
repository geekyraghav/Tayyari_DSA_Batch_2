package OneDimensionalArrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsInJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // empty
        System.out.println(arr.size());

        arr.add(10); arr.add(20); arr.add(30); arr.add(40);
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" "); // arr[i]
        }
        System.out.println();

        arr.add(50); arr.add(33); arr.add(27); arr.add(9);
        System.out.println(arr.size());
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        arr.remove(4);
        System.out.println(arr.size());
        System.out.println(arr); // TC = O(n)

        arr.set(2,3); // arr[2] = 3
        System.out.println(arr);

        // Reverse arraylist
        int i = 0, j = arr.size()-1;
        while(i<j){
            int tempI = arr.get(i);
            int tempJ = arr.get(j);
            arr.set(i,tempJ);
            arr.set(j,tempI);
            i++;
            j--;
        }
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
