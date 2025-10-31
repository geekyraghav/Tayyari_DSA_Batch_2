package OneDimensionalArrays;

public class MissingInArray {
    int missingNum(int arr[]) {
        long n = arr.length + 1;
        long sum1toN = (n*(n+1)/2);
        long arraySum = 0;
        for(int ele : arr){
            arraySum += ele;
        }
        long missing = sum1toN - arraySum;
        return (int)missing;
    }
}
