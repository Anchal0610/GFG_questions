class Solution {
    public int lowerBound(int[]arr , int n , int x){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = low +(high - low)/2;
            if(arr[mid] >= x ){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans ;
    }
    public int rowWithMax1s(int[][] arr) {
        // code here
        int cnt_max = -1;
        int index = -1;
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0 ; i<n ; i++){
            int cnt_ones = m - lowerBound(arr[i] , m , 1);
            if(cnt_ones > 0 && cnt_ones > cnt_max){
                cnt_max = cnt_ones;
                index = i;
            }
        }
       return index; 
    }
}