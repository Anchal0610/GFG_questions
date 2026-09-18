class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
        }
        ArrayList<Map.Entry<Integer, Integer>> list = new 
        ArrayList<>(map.entrySet());
        list.sort((a,b) -> {
            if(a.getValue() != b.getValue()){
            return Integer.compare(b.getValue() , a.getValue());
            }
            return Integer.compare(b.getKey() , a.getKey());
            });
        
        ArrayList<Integer> ans  = new ArrayList<>();
        
        for(int i = 0 ; i<k && i < list.size() ; i++){
            ans.add(list.get(i).getKey());
        }
        
        return ans; 
    }
}
