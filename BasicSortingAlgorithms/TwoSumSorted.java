package BasicSortingAlgorithms;

import java.util.ArrayList;

public class TwoSumSorted {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] < target) i++;
            else if(arr[i]+arr[j] > target) j--;
            else{
                ans.add(i+1);
                ans.add(j+1);
                return ans;
            }
        }
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}
