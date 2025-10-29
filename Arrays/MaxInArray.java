package OneDimensionalArrays;

public class MaxInArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Array Size: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n]; // n size ka array ban gaya
//        System.out.print("Enter Array Elements: ");
//        // input
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {-4,-5,-2,-6,-7,-3};
        // max is -2
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);
    }
}
