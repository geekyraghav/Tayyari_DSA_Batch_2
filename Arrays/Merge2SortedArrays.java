package OneDimensionalArrays;
public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] a = {1,10,18,93,333};
        int[] b = {7,17,22,33};
        int[] c = new int[a.length+b.length];
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(j<b.length)
            c[k++] = b[j++];
        while(i<a.length)
            c[k++] = a[i++];
        print(c);
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
