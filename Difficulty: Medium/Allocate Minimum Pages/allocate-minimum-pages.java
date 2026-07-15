class Solution {
    public boolean allocation(int []arr, long totalPages , int k){
        int Cntstu = 1 ;   int pages =0;
        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] > totalPages){
                return false;
            }
            if(pages + arr[i] > totalPages){
                Cntstu += 1;
                pages = arr[i];
            }
            else{
                pages += arr[i];
            }
        }
        if(Cntstu >k){
            return false;
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if( n < k){
            return -1;
        }
        long sum = 0;
        for(int pages : arr){
            sum += pages;
        }
        long low = Arrays.stream(arr).min().getAsInt();
        long high = sum;
        
        while(low <= high){
            long mid = low+ (high -low)/2;
            if(allocation(arr , mid , k) == true){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return (int)low;
    }
}