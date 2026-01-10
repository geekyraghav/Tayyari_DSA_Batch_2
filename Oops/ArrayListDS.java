package OOPS;
class MyArrayList{ // user defined data structure
    private int[] arr;
    private int idx = 0;
    MyArrayList(int capacity){
        arr = new int[capacity];
    }
    MyArrayList(){
        arr = new int[16];
    }
    void add(int ele){
        if(idx==arr.length){
            int[] newArr = new int[2*arr.length];
            for(int i=0;i<arr.length;i++){ // copy pasting
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[idx++] = ele;
    }
    int get(int i) throws Exception{
        if(i<0 || i>=idx)
            throw new Exception("Index out of bound!");
        return arr[i];
    }
    void set(int i, int ele) throws Exception{
        if(i<0 || i>=idx)
            throw new Exception("Index out of bound!");
        arr[i] = ele;
    }
    void remove() throws Exception{
        if(idx==0) throw new Exception("Index out of bound!");
        idx--;
    }
    void remove(int j) throws Exception{
        if(j<0 || j>=idx)
            throw new Exception("Index out of bound!");
        for(int i=j+1;i<idx;i++){
            arr[i-1] = arr[i];
        }
        idx--;
    }
    int size(){
        return idx;
    }
    void print(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class ArrayListDS {
    public static void main(String[] args) throws Exception{
        MyArrayList list = new MyArrayList(18);
        // list is from index (0 to idx-1)
        list.add(10); list.add(20); list.add(30);
        list.print();
        list.add(40); list.add(90); list.add(220);
        list.print();
        System.out.println(list.get(4));
        System.out.println(list.get(6));
        list.set(2,11);
        list.print();
        list.remove();
        list.print();
        System.out.println(list.size());
        list.remove(2);
        list.print();

        MyArrayList list2 = new MyArrayList();
    }
}
