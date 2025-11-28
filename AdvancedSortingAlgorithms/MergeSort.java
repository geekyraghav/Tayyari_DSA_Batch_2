package AdvanceSortingAlgorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {18,4,-7,45,33,17,-4,2};
        print(arr);
        mergeSort(arr);
        print(arr);
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0; // traversing in arr
        for(int i=0;i<a.length;i++)
            a[i] = arr[idx++];
        for(int i=0;i<b.length;i++)
            b[i] = arr[idx++];
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(j<b.length)
            c[k++] = b[j++];
        while(i<a.length)
            c[k++] = a[i++];
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
