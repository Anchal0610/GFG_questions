class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int l =0;
        int r =0;
        int maxlen = -1;
        HashMap<Character , Integer> map = new HashMap<>();
        while(r < s.length()){
            map.put(s.charAt(r) , map.getOrDefault(s.charAt(r) , 0)+1);
            if(map.size() > k){
                char str = s.charAt(l);
                map.put(str , map.get(str)-1);
                if(map.get(str) == 0){
                    map.remove(str);
                }
                l++;
            }
            if(map.size() == k){
                maxlen = Math.max(maxlen , r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}