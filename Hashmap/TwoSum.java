package Maps_And_Sets;

import java.util.HashSet;

public class TwoSum {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            // ele + x = target  ->  x = target - ele
            if(set.contains(target-ele)) return true;
            set.add(ele);
        }
        return false;
    }
}
