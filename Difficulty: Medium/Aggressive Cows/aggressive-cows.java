class Solution {
    public boolean CanWePlace(int []arr , int dist , int k){
        int CntCows = 1; 
        int last = arr[0];
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            if(arr[i] - last >= dist){
                CntCows++;
                last = arr[i];
            }
            if(CntCows >= k){
                return true;
            }
        }
       return false; 
    }
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int low =0;
        int n = arr.length;
        int high = arr[n-1] - arr[0];
        while(low <= high){
            int mid = low + (high - low)/2;
            if(CanWePlace(arr, mid , k) == true){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high;
    }
}