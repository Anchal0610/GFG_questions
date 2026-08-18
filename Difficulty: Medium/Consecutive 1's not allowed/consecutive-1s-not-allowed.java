class Solution {

     int[] dp;

     int countStrings(int n) {

         dp = new int[n + 1];

         return solve(n);
     }

     int solve(int n) {

         if (n == 1) {
             return 2;
         }

         if (n == 2) {
             return 3;
         }

         if (dp[n] != 0) {
             return dp[n];
         }

         dp[n] = solve(n - 1) + solve(n - 2);

         return dp[n];
     }
 }