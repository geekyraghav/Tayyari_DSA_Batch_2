package Maps_And_Sets;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        // nums[i] is from 1 to 100
        int[] freq = new int[101];
        for(int ele : nums){
            freq[ele]++;
        }
        int sum = 0;
        for(int ele : nums){
            if(freq[ele]==1) sum += ele;
        }
        return sum;
    }
}
