class Solution {
    public int needed(int []stations , double dist , int K){
        int cnt =0;
        int n = stations.length;
        for(int i=0 ; i<n-1 ; i++){
           double gap = stations[i+1] - stations[i];
           
           cnt += (int)(gap / dist);
           
           if(gap % dist == 0){
               cnt--;
           }
        }
        return cnt;
    }
    public double minMaxDist(int[] stations, int K) {
        // code here
        Arrays.sort(stations);
        int n = stations.length;
       double low = 0;
       double high = stations[n-1] - stations[0];
       while(high - low > 1e-6){
           double mid = low + (high - low)/2.0;
           int cnt = needed(stations , mid , K);
           if(cnt > K){
               low = mid;
           }
           else{
               high =mid;
           }
       }
       return low ;
    }
}
