class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int low =0 ;
        int high = n-1;
        int count = 0;
        int first = -1;
        int last = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                first = mid;
                high = mid-1;
            }
            else if( target > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        low =0 ;
        high = n-1;
         while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            }
            else if( target > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        
        if(first == -1){
            return 0;
        }
        
        count = last - first + 1;
        
        return count;
    }
}
