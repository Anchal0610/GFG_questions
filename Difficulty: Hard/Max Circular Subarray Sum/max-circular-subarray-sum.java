class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int maxSubarray = Integer.MIN_VALUE;
        int maxsum =0;
        for(int i=0 ; i<arr.length ; i++){
            maxsum += arr[i];
            if( maxsum > maxSubarray){
                maxSubarray = maxsum;
            }
            if(maxsum < 0){
                maxsum = 0;
            }
        }
        int totalSum =0;
        int minsum = 0;
        int minSubarray = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            totalSum += arr[i];
            minsum += arr[i];
            if(minsum < minSubarray){
                minSubarray = minsum;
            }
            if(minsum > 0){
                minsum = 0;
            }
        }
        if(totalSum == minSubarray){
            return maxSubarray;
        }
        
        return Math.max(maxSubarray , (totalSum - minSubarray));
    }
}
