package TwoDimensionalArrays;

import java.util.ArrayList;

public class PascalTriangle {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        n--;
        ArrayList<Integer> ans = new ArrayList<>();
        int x = 1;
        for(int r=0;r<=n;r++){
            ans.add(x);
            x = (n-r)*x/(r+1);
        }
        return ans;
    }

//    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
//        n--;
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        for(int i=0;i<=n;i++){
//            ArrayList<Integer> a = new ArrayList<>();
//            list.add(a);
//            for(int j=0;j<=i;j++){
//                a.add(0);
//                if(j==0 || j==i) list.get(i).set(j,1);
//                else list.get(i).set(j,list.get(i-1).get(j)+list.get(i-1).get(j-1)); // list[i][j] =  list[i-1][j] +  list[i-1][j-1]
//            }
//        }
//        return list.get(n);
//    }
}
