class Solution {
    public int upperBound(int[]mat , int x){
        int low = 0 ;
        int high = mat.length-1;
        int ans = mat.length;
        while(low <= high){
            int mid = low  + (high - low)/2;
            if(mat[mid] > x){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    public int blackbox(int[][]mat , int x){
        int cnt =0;
        int n = mat.length;
        for(int i=0 ; i<n ; i++){
            cnt += upperBound(mat[i] , x);
        }
        return cnt;
    }
    public int median(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int required = (n*m) / 2;
        int low = mat[0][0];
        int high = mat[0][m - 1];
        for (int i = 1; i < n; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][m - 1]);
        }
        while(low <= high){
            int mid  = low + (high -low)/2;
            int smallerEquals = blackbox(mat , mid);
            if(smallerEquals <= required){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
        
    }
}