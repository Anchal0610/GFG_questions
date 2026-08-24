class Solution {
    public int maximumPoints(int mat[][]) {
        // code here
        int n = mat.length;
        int[][] dp = new int[n][4];
        for(int i=0 ; i<n; i++){
            Arrays.fill(dp[i] , -1);
        }
        return find(n-1 , 3 , mat , dp);
        
    }
    public int find(int days , int last , int [][]mat , int[][]dp){
        
        if(days==0){
            int max = 0;
            for(int i= 0 ; i<=2 ; i++){
                if(i != last){
                  max = Math.max(max , mat[0][i]);
                }
            }
            return max;
        }
        if(dp[days][last] != -1){
            return dp[days][last];
        }
        int max = 0;
        for(int i= 0 ; i<=2 ; i++){
            if(i != last) {
                int points = mat[days][i]  + find(days-1 , i , mat , dp);
                max = Math.max(max , points);
            }
        }
        return dp[days][last] = max;
    }
}