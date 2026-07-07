public class MaxSubArrayBruteForceApproach {
    public static int maxSubArray(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currSum=0;
            for(int j=1;j<arr.length;j++){
                currSum=arr[j]+currSum;
                maxSum=Math.max(maxSum,currSum);

            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] Array1={-1,2,3,-2};
        int result=maxSubArray(Array1);

        System.out.println(result);
    }
}
