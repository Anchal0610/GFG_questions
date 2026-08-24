class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        Boolean[][] dp = new Boolean[n][sum + 1];
        return subsetsum(n-1, sum , arr , dp);
        
    }
    static boolean subsetsum(int index , int target , int[]arr , Boolean [][]dp){
        if(target == 0){
            return true;
        }
        if(index == 0){
            return arr[0] == target;
        }
        if(dp[index][target] != null) {
            return dp[index][target];
        }
        boolean notTake = subsetsum(index -1 , target , arr, dp);
        boolean take = false;
        if(target >= arr[index]){
           take = subsetsum(index-1 , target - arr[index] , arr ,dp);
        }
        return dp[index][target] = take || notTake;
    }
    
}