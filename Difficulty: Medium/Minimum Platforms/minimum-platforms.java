class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0 ;
        int j =0 ;
        int cnt = 0;
        int maxcnt = 0;
        while(i < arr.length){
            if(arr[i] <= dep[j]){
                cnt = cnt+1;
                i = i+1;
            }
            else{
                cnt  = cnt-1;
                j = j+1;
            }
            
            maxcnt = Math.max(cnt , maxcnt);
        }
        return maxcnt;
    }
}
