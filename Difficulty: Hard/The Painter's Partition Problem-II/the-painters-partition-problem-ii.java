class Solution {
    public boolean allocation(int[] arr , long totaltime , int k){
        int cntPainter = 1;
        int time = 0;
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            if(arr[i] > totaltime){
                return false;
            }
            if(time + arr[i] > totaltime){
                cntPainter++;
                time = arr[i];
            }
            else{
                time += arr[i];
            }
        }
        if(cntPainter > k){
            return false;
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        // code here
        long sum = 0;
        long low = Arrays.stream(arr).min().getAsInt();
        for(int num : arr){
            sum += num;
        }
        long high = sum;
        while(low <= high){
            long mid = low + (high - low)/2;
            if(allocation(arr , mid , k) == true){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return (int)low;
    }
}
