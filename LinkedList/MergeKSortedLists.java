package LinkedList;

import java.util.ArrayList;

public class MergeKSortedLists {
    Node mergeKLists(Node[] arr) {
        int n = arr.length;
        while(n > 1){
            for(int i=0;i<n;i+=2){
                Node a = arr[i];
                Node b = (i+1 < n) ? arr[i+1] : null;
                Node c = merge(a,b);
                arr[i/2] = c;
            }
            if(n%2 == 0) n = n/2;
            else n = n/2 + 1;
        }
        return arr[0];
    }

//    Node mergeKLists(Node[] arr) {
//        ArrayList<Node> list1 = new ArrayList<>();
//        ArrayList<Node> list2 = new ArrayList<>();
//        for(Node n : arr){
//            list1.add(n);
//        }
//        while(list1.size()+list2.size() > 1){
//            while(list1.size() > 1){
//                Node a = list1.remove(list1.size()-1);
//                Node b = list1.remove(list1.size()-1);
//                Node c = merge(a,b);
//                list2.add(c);
//            }
//            while(list2.size() > 1){
//                Node a = list2.remove(list2.size()-1);
//                Node b = list2.remove(list2.size()-1);
//                Node c = merge(a,b);
//                list1.add(c);
//            }
//            if(list1.size()==1 && list2.size()==1)
//                return merge(list1.get(0),list2.get(0));
//        }
//        return (list1.size()>0) ? list1.get(0) : list2.get(0);
//    }
    Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node i = head1;
        Node j = head2;
        Node k = dummy;
        while(i!=null && j!=null){
            if(i.data < j.data){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null) k.next = j;
        else k.next = i;
        return dummy.next;
    }
}
