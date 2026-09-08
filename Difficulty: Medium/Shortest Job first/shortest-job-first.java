class Solution {
    static int solve(int bt[]) {
        // code here
       Arrays.sort(bt);
       int avg_WT = 0;
       int total_Wt = 0;
       for(int i=0 ; i < bt.length ; i++){
           avg_WT += total_Wt;
           total_Wt += bt[i];
       }
       return avg_WT/bt.length;
    }
}
