class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int n = arr.length;
        int prefix_xor = 0;
        int max =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0 ; i<n ; i++){
            prefix_xor ^= arr[i];
            
            int required = prefix_xor ^ k;
            
            if(map.containsKey(required)){
                max += map.get(required);
            }
           
            map.put(prefix_xor , map.getOrDefault(prefix_xor , 0)+1);
        }
      return max;  
    }
}