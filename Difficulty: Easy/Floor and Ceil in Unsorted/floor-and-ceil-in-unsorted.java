import java.util.*;

class Solution {
    
    public int floor(int []arr , int x){
        int n = arr.length ;
        int low = 0;
        int high = n-1;
        int ans  = -1;
        Arrays.sort(arr);
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] <= x){
                ans = arr[mid];
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans ;
    }
    public int ceil(int []arr , int x){
        int n = arr.length ;
        int low = 0;
        int high = n-1;
        int ans  = -1;
        Arrays.sort(arr);
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= x){
                ans = arr[mid];
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return ans ;
    }
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        return new int[]{floor(arr, x), ceil(arr, x)};
        
    }
}
